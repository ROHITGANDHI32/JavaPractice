package org.example;

public class StringReverse_withoutFunction {

    public static void main(String[] args){

        String name = "Rohit";
        int len = name.length();
        String rev="";

        for(int i=len-1;i>=0;i--){
            rev= rev + name.charAt(i);
        }

        System.out.println("Reverse String : "+rev);

    }

}
