package src.collectionframework;

import java.util.Arrays;
import java.util.Vector;

public class VPractice {

    public static void main(String[] args) {

        Vector v1=new Vector();

        v1.add("monesh");
        v1.add("mom");
        v1.add(0,"dad");

        Vector v2=new Vector();
        v2.add("vijay");
        v2.add("gayatri");


        Vector v3=new Vector();
        v3.add("vijay");
        v3.add("gayatri");

//		Vector v3=new Vector();
//		v3.add("vijay");
//		v3.add("gayatri");
//

        //	System.out.println(v1);



        v1.addAll(v2);
        v1.addAll(v3);
//		System.out.println(v1);

//		v1.remove(0);
//		System.out.println(v1);
//		System.out.println(v1.get(1));
//		v1.removeAll(v2);
//		System.out.println(v1);


//		System.out.println(v1);
//		System.out.println(v1.containsAll(v3));
//
//
//		System.out.println(v1.get(0));
//		v1.set(0, "mony");
//		System.out.println(v1.get(0));
//		System.out.println(v1.indexOf("mony"));
//		System.out.println(v1.firstElement());
//		System.out.println(v1.lastElement());

        Object[] arr=v1.toArray();
        System.out.println(Arrays.toString(arr));



//		System.out.println("capacity:"+v1.capacity());
//		System.out.println("size:"+v1.size());



    }

}
