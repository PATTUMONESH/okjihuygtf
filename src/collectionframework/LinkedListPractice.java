package src.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListPractice {



    public static void main(String[] args){

        ArrayList<String> l2=new ArrayList<>();
        l2.add("k1");
        l2.add("k2");
        LinkedList<String> l1=new LinkedList<>();
        l1.add("m1");
        l1.add("m2");
        l1.add("m3");
        l1.addAll(l2);

        System.out.println(l1);
        l1.set(0,"u1");

       // l1.remove("m1");

        //l1.removeAll(l2);


        System.out.println(l1);
        System.out.println(l1.contains("m2"));
        System.out.println(l1.contains("m1"));
        System.out.println(l1.containsAll(l2));

        Collections.synchronizedList(l1);

        for (String s1:l1) {
            System.out.print(""+s1);


        }

    }
}
