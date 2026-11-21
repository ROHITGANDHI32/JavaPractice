package org.example;


import java.util.List;

public class StreamsEx {

    public static void main(String[] args){

        List<String > li = List.of("Lap","Mob","Tab","Mob","Lap");

       List<String> uni=  li.stream().distinct().toList();
        System.out.println(uni);
    }
}
