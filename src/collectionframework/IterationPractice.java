package src.collectionframework;

import java.util.HashMap;

public class IterationPractice {



    public static void main(String[] args){

        //  Iterator ---interface
        //Introduced for iterating all the collection object
        //legacy classes--  v-1.0     plus     newclasses-- v1.2
        //one direction,read-only with special permission for removing the elements

//        ArrayList<Integer> al=new ArrayList<>();
//        al.add(20);
//        al.add(25);
//        al.add(45);
//
//        Iterator<Integer>  i=al.iterator();

//        while (i.hasNext()){
//            i.next();
//            i.remove();
//        }


        //System.out.println(al);


//        i.next();
//            i.remove();
//
//        System.out.println(al);
//
//        i.next();
//        i.remove();
//
//
//        System.out.println(al);



        //example 2

        HashMap<String ,Integer> h=new HashMap<>();
        h.put("iuhygtf",5631);
        h.put("iuhyg",652);
        h.put("koijuhg",845);
        h.keySet().iterator();
        System.out.println(h);
        h.values().iterator();
        System.out.println(h);
        h.entrySet().iterator();
        System.out.println(h);





    }
}
