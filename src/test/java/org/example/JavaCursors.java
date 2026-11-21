package org.example;


import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class JavaCursors {


    public static void main(String[] args)
    {
        ArrayList<Object> al = new ArrayList<Object>();

        al.add(1);
        al.add(2);
        al.add(100);
        al.add(200);

        System.out.println(" arrayList is "+al);


        HashSet<String> hs= new HashSet<String>();

        hs.add("Rohit");
        hs.add("Prachi");
        hs.add("Anaya");

        System.out.println("Hash set is"+hs);


        LinkedHashSet<String> lh=new LinkedHashSet<String>();

        lh.add("A");
        lh.add("B");
        lh.add(null);
        lh.add("D");

        System.out.println("LinkedHashSet is"+lh);



    }

}
