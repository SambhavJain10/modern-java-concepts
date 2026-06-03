package com.java.concepts.excercises.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Maps {

    public  static  void main(String[] args){

        //1. Find all keys with value 90

        // 1.
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Alice", 90);
        map1.put("Bob", 85);
        map1.put("Charlie", 90);

        List<String> keys= new ArrayList<>();
        for (Map.Entry<String, Integer> entry: map1.entrySet()){

            if(entry.getValue().equals(90)){

                keys.add(entry.getKey());
            }
        }
        System.out.println(keys);

        //2.
        List<String> keys1 = map1.entrySet().stream()
                .filter(e -> e.getValue().equals(90))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(keys1); // [Alice, Charlie]
    }


    }
