package org.example;

public class Pallindrome {

    public static void main(String[] args){

        String pal = "Level";
        String reverse = new StringBuilder(pal).reverse().toString();

        if(pal.equalsIgnoreCase(reverse)){
            System.out.println("Its Pallindrome :"+pal);

        }
        else{
            System.out.println("It not pallindrome : "+pal);
        }


    }
}
