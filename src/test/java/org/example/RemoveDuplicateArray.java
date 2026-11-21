package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateArray {

    public static void main(String[] args){

        int[] arr={10,20,30,10,30};

        System.out.println("Original Array :"+Arrays.toString(arr));

        Set<Integer> set =new HashSet<>();

        for(int n:arr){

            if(!set.add(n)){
                System.out.println("Duplicate are : "+n);
            }

        }
        System.out.println("Updated Arry :"+set);

    }
}
