package org.example;

import java.util.Scanner;

public class SentencewithWordsReverse {

    public static void main(String[] args) {
        String res = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence : ");
        String str = sc.nextLine();
        sc.close();

        String[] subStr = str.split(" ");

        for(String words : subStr){
            String revWords="";
            for (int i=words.length()-1;i>=0;i--){
                revWords += words.charAt(i);
            }
            res +=revWords+ " ";

        }
        System.out.println("Previous :"+str);
        System.out.println("Updated : "+res);
    }



    }