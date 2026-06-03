package com.java.concepts.excercises.strings;

public class WhiteSpaceOperations {

    public static void main(String[] args){

        String str = "Welcome to white   space  ";

        String noSpaceStr = str.replaceAll("\\s", ""); //1st way
        System.out.println("1st way output: " +noSpaceStr);

        StringBuffer stringBuffer = new StringBuffer();
        char[] strArray = str.toCharArray();

        for (char ch : strArray){

            if((ch!=' ') && (ch != '\t')){
                stringBuffer.append(ch);
            }
        }

        String noSpaceStr1 = stringBuffer.toString();
        System.out.println("2nd way output: " + noSpaceStr1);
    }
}
