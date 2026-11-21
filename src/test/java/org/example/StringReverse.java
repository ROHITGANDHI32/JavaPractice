package org.example;

public class StringReverse {


    public static void main(String[] args) {

        String str = "Rohit";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);

        }
        System.out.println("Reverse string : " + rev);


    String sb = new StringBuilder(str).reverse().toString();

    System.out.println("With StringBuilder : "+sb);

}

}
