package src.collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice {


    public static void main(String[] args){


        //array creation
      Integer arr[]=new Integer[]{1,2,3,4};
        ArrayList<Integer> ar1=new ArrayList<>(Arrays.asList(arr));


        //adding
       ar1.add(1);
       ar1.add(2);
       ar1.add(3);



//        ar1.add(0,3);
//        ar1.add(1);
//        ar1.add(0,3);
//        ar1.add(1);
//        ar1.add(0,3);
//        ar1.add(1);
//        ar1.add(0,3);
//        ar1.add(1);
//        ar1.add(0,3);
//        ar1.add(1);
//        ar1.add(0,3);



        System.out.println(ar1);



        //retrieve of element in an arraylist
        System.out.println(ar1.get(0));

        //size of an array
        System.out.println(ar1.size());

        //deletion of element in an array with the help of index number
//        ar1.remove(1);
//        System.out.println(ar1);

//        ar1.removeAll(ar1);
//        System.out.println(ar1);

//        ar1.clear();
//        System.out.println(ar1);

       //verification of element in an arraylist
        //System.out.println(ar1.contains(1));


        //update of element
        ar1.set(0,6);
        System.out.println(ar1);

//        for (int i=0;i<ar1.size();i++){
//            System.out.print(ar1.get(i)+" ");
//        }

        for (Integer integer:ar1) {
            System.out.print(integer +" ");

        }
        Collections.synchronizedList(ar1);




    }
}
