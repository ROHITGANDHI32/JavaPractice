package org.example;

public class RemoveDuplicateChar {

    public static void main(String[] args) {

        String str = "Hello World";
        String output = removeChars(str);
        System.out.println(output);
    }

    public static String removeChars(String str){

        String res ="";

        for (int i=0;i<=str.length();i++){
            char ch= str.charAt(i);

            if(res.indexOf(ch)==-1){
                res += ch;
            }
        }
        return res;
    }

}
