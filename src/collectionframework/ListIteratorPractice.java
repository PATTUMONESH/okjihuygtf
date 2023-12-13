package src.collectionframework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorPractice {


    public  static void main(String [] args){
        //ListIterator -- interface
        //introduced for iterating the only list type of collection objects
        //legacy classes ----1.0v    hashtable,stack,vector,dictionary(abstract class),properties(extends hashtable) plus newclasses ---1.2v
        //bi-direction,read and write

        ArrayList<Integer> a=new ArrayList<>();
        a.add(12);
        a.add(14);
        a.add(47);
        ListIterator<Integer> lk=a.listIterator();
        //forward direction

        while (lk.hasNext()){
            System.out.println(lk.next());
        }

        //add of element in iterator not in arraylist
        lk.add(42);

        System.out.println();

        //backward direction
        while(lk.hasPrevious()){
            System.out.println(lk.previous());

        }
        lk.remove();
        System.out.println(a);




    }
}
