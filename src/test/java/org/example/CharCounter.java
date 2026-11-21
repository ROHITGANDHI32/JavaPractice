package org.example;

import java.util.HashMap;
import java.util.Map;

public class CharCounter {

    public static void main(String[] args){

        String str = "rohitgandhi";

        Map<Character,Integer> m = new HashMap<>();

        for(char ch:str.toCharArray()){

            m.put(ch,m.getOrDefault(ch,0)+1);

        }
        System.out.println(m);


    }

}
