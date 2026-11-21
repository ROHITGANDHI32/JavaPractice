package org.example;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args){

        int[] arr = {10,20,40,10,20,40,30};

        Set<Integer> set = new LinkedHashSet<>();

        for(int i:arr){

            set.add(i);

        }
        System.out.println(set);



    }

}
