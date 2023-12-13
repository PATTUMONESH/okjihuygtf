package src.collectionframework;

import java.util.Hashtable;
import java.util.Map;

public class HashTablePractice {
    public static void main(String[] args){

        //List<Integer> l1=new LinkedList<>();

        Map<Integer,String> m1=new Hashtable<>();

        //addition of element
        //m1.put(1,"monesh");
        m1.put(2,"kiii");
        m1.put(3,"lkijhi");
        //retrival of keys from the map   //keyset another name

//        Set<Integer> keys=m1.keySet();
//        for (Integer key:keys)
//        {
//            System.out.println(key);
//        }


        System.out.println();

        //retrival of value from the map
//        Collection<String> value=   m1.values();
//        for (String values:value)
//             {
//                 System.out.println(values);
//        }

        //retrival of value from the map based on key

//        System.out.println(m1.get(1));
        //retrival of all values and keys
//        for (Integer key:keys) {
//            System.out.println(key +" "+m1.get(key)     );
//        }
//   System.out.println(m1);
//   m1.remove(1);
//   System.out.println(m1);

   //verification of key and value in map
//        System.out.println(m1.containsKey(1));
//        System.out.println(m1.containsKey(2));
//
//
//
//        System.out.println(m1.containsValue("monesh"));
//      System.out.println(m1.containsValue("kiii"));





//updation of value in the map
        System.out.println(m1);
//        m1.put(1,"monesh1");
//        System.out.println(m1);



        //updation of value if the value is not present in the map
        m1.putIfAbsent(1,"monesh");
        System.out.println(m1);


        //updation of value with replace()
        m1.replace(1,"pokh");
        System.out.println(m1);


//entry set in map
//        Set<Map.Entry<Integer,String>> entries=m1.entrySet();
//
//        for (Map.Entry<Integer,String> mon:entries)
//        {
//         System.out.println(mon);
//        }







    };



    }

