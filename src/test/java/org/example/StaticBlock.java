package org.example;


public class StaticBlock {

    String name;
    static{

        System.out.println("This is static block");
    }

    StaticBlock(){
        System.out.println("This is no arg constructor");
    }

    StaticBlock(String name){
        this.name=name;
        System.out.println("This is 1 arg constructor, name :" +name);
    }

    public static void main(String[] args){

        System.out.println("This is main method");

        StaticBlock sb=new StaticBlock("Rohit");
    }
}
