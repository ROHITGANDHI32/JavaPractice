package org.example;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplictesLinkedHashset {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input : ");
        String str = sc.nextLine();
        sc.close();

        str =str.toLowerCase();
        String updated ="";
        LinkedHashSet<Character> hash = new LinkedHashSet<>();

        for(int i=0;i<=str.length()-1;i++){
            char ch = str.charAt(i);
            hash.add(ch);
        }
        StringBuilder sb =new StringBuilder();
        for(Character ch:hash) {
        sb.append(ch);

        }
        String res = sb.toString();
        System.out.println(res);



    }

}
