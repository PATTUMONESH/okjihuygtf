package src.collectionframework;

import java.util.HashSet;

public class HashSetPractice {



    public static void main(String[] args){

        //hashset internally --->hashmap -->array of nodes(key,value)

      //  Set<Integer> s=new HashSet<>();

        //new Object();       dummy object


        HashSet<Integer> hs=new HashSet<>();

        //addition
        hs.add(11);
        hs.add(19);
        hs.add(13);

        System.out.println(hs);


        //removal of element
//        hs.remove(11);
//        System.out.println(hs);

        //verification of element
       // System.out.println(hs.contains(12));      //true or false

        //retrival of element
        for (Integer element:hs) {
            System.out.println(element);
        }


    }
}
