package org.example;

import java.util.HashSet;
import java.util.Set;


public class ArrayDuplicates {

    public static  void main(String[] args){

        int[] arr={10,20,30,20,10,50,60};

        Set<Integer> set = new HashSet<>();

        for(int num1:arr){

            if(!set.add(num1)){
                System.out.println("Duplicates are : "+num1);
            }
        }



    }

}
