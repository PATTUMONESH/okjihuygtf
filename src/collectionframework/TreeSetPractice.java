package src.collectionframework;

import java.util.TreeSet;

public class TreeSetPractice {


    public static void main(String [] args){
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(11);
        ts.add(19);
        ts.add(13);
        ts.add(56);
        ts.add(45);
        ts.add(85);

        System.out.println(ts);
        System.out.println(ts.first());
        System.out.println(ts);
        System.out.println(ts.last());
        System.out.println(ts);
        System.out.println(ts.pollFirst());
        System.out.println(ts);
        System.out.println(ts.pollLast());


        System.out.println(ts);
        //System.out.println(ts.subSet(12,45));
        System.out.println(ts.descendingSet());



        //removal of element
//        lhs.remove(11);
//        System.out.println(lhs);

        //verification of element
        //System.out.println(lhs.contains(12));      //true or false

        //retrival of element
//        for (Integer element : ts) {
//            System.out.println(element);
//            }



}}
