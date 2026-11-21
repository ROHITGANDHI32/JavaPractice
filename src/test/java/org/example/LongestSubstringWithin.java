package org.example;
import java.util.Scanner;

public class LongestSubstringWithin {

    public static void main(String[] args) {
        int max =0;

        System.out.println("Enter String : ");
        Scanner sc =new Scanner(System.in);

        String input = sc.nextLine();
        sc.close();
        String sub[] = input.split(" ");

        for(int i=0;i<=sub.length-1;i++){

            if (sub[i].length()>max) {
                max = sub[i].length();
            }
        }
        System.out.println("Longest substring : "+max);
    }
}
