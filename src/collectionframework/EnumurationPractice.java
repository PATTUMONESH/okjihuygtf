package src.collectionframework;

import java.util.Enumeration;
import java.util.Properties;

public class EnumurationPractice {

    public static void main(String[] args){
        //Enumeration -- interface
        //introduced for iterating the legacy collection objects
        //legacy classes ----1.0v    hashtable,stack,vector,dictionary(abstract class),properties(extends hashtable)
        //new classes  ----1.2v

//        Vector<String> v=new Vector<>();
//        v.add("mone");
//        v.add("iuhgf");
//        v.add("lkjhgfc");
        //System.out.println(v);
       //Enumeration<String> e=v.elements();
       //e.hasMoreElements();
       //e.nextElement();
//        while (e.hasMoreElements()){
//           System.out.println(e.nextElement());
//       }



        //example 2
//        Hashtable<String,Integer> ht=new Hashtable<>();
//        ht.put("cgh",456);
//        ht.put("jghiu",1245);
//        ht.put("lkjh",78945);
//
//
//        Enumeration<Integer> j=ht.elements();
//        while (j.hasMoreElements()){
//            System.out.println(j.nextElement());
//        }



        //example 3
        Properties prop=new Properties();
        prop.setProperty("lkjhb","655555");
        prop.setProperty("lkjhbj","65555522");

       Enumeration en= prop.elements();
       while (en.hasMoreElements()){
           System.out.println(en.nextElement());
       }




    }
}
