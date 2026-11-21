package org.example;

import java.util.HashMap;
import java.util.Map;

public class CountOfCharacters {

public static void main(String[] args){

        String str ="aarya";
    System.out.println("Original String :" +str);

    Map<Character,Integer> map=new HashMap<>();

    for(char ch : str.toCharArray()){

        map.put(ch,map.getOrDefault(ch,0)+1);
    }
    System.out.println("Updated String :" +map);

}

}
