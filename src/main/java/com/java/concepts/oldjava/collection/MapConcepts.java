package com.java.concepts.oldjava.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapConcepts {

    public static void main (String args[]){

        Map<String, String> cityMaps = new HashMap<>();
        cityMaps.put("India", "Delhi");
        cityMaps.put("USA", "Washington");
        cityMaps.put("England", "London");
        cityMaps.put("Scotland", "Edinburgh");

        //iteration methods

        // 1. using Entry Set - Most efficient

        System.out.println("Using Entry Set");
        Iterator<Map.Entry<String, String>> iterator= cityMaps.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry entry= iterator.next();
            System.out.println("Country: " +entry.getKey()+ ", City: " + entry.getValue());
        }

        //2. using iterator keySet - less efficient

        System.out.println("Using iterator keySet");

        Iterator<String> it= cityMaps.keySet().iterator();
        while (it.hasNext()){
            String key= it.next();
            {
                if (cityMaps.get(key).equalsIgnoreCase("Washington")){
                    it.remove();
                }
            }
            System.out.println("Country: " +key+ ", City: " + cityMaps.get(key));
        }

        //3. using lambda function:
        System.out.println("Using lambda function");

        cityMaps.forEach((key, value) ->
        {
            System.out.println("Country: " +key+ ", City: " +value);

        });

        // 4. using streams
        System.out.println("Using Streams");

        cityMaps.entrySet().stream().filter(e -> !e.getValue().equalsIgnoreCase("Rome"))
                .forEach(e ->
                    System.out.println(e.getKey() +" : " +e.getValue()));

    }
}
