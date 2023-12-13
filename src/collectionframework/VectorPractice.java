package src.collectionframework;

import java.util.Vector;

public class VectorPractice {



    public static void main(String[] args){
        Vector<Integer> v1=new Vector<>();
        v1.add(2);
        v1.add(null);
        v1.add(3);
        v1.add(null);
        v1.add(2);
        v1.add(null);
        v1.add(3);
        v1.add(null);
        v1.add(2);
        v1.add(null);
        v1.add(3);
        v1.add(null);

        System.out.println(v1);
        System.out.println(v1.capacity());

    }
}
