package src.collectionframework;

import java.util.LinkedHashSet;

public class LInkedHashSetPractice {



    public static void main(String[] args) {

        //LinkedHashSet internally --->Linkedhashmap -->link of nodes(key,value)
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        //addition
        lhs.add(11);
        lhs.add(19);
        lhs.add(13);

        System.out.println(lhs);


        //removal of element
//        lhs.remove(11);
//        System.out.println(lhs);

        //verification of element
        //System.out.println(lhs.contains(12));      //true or false

        //retrival of element
        for (Integer element : lhs) {
            System.out.println(element);


        }
    }}
