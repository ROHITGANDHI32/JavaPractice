package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VowelsConsonants {

    public static void main(String[] args) {

        System.out.println("Enter string here :");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        countVowelsConsonants(input);

    }

    private static void countVowelsConsonants(String input) {

    int cVowel =0;
    int cConsonants=0;

    for(int i=0;i<input.length();i++) {
        char ch = input.charAt(i);
        if (ch=='a' || ch=='e'|| ch=='i' || ch== 'o' || ch=='u')
        {
            cVowel++;
        } else if (ch >='a' && ch<= 'z') {
            cConsonants++;
        }
    }
        System.out.println( "Vowel count : "+cVowel);
        System.out.println("Consonants count : "+cConsonants );

    }


}
