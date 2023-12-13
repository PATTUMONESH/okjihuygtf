package src.collectionframework;

import java.util.LinkedList;

public class LinkedListQueuePractice {



    public static void main(String [] args){
        LinkedList<String> ad=new LinkedList<>();


        //addition of elements
        ad.add("apple");
        ad.addFirst("jimmy");
        ad.addLast("mone");
        ad.offer("link");
        ad.offerFirst("gayi");
        ad.offerLast("viji");
        System.out.println(ad);

        //retrival of element

        System.out.println(ad.peek());
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());

        //remove of elements
        System.out.println(ad);
        System.out.println(ad.poll());
        System.out.println(ad);
        System.out.println(ad.pollFirst());
        System.out.println(ad);
        System.out.println(ad.pollLast());
        System.out.println(ad);



    }
}
