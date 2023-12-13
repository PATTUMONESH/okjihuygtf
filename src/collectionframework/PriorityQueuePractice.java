package src.collectionframework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueuePractice {



    public static void main(String[] args){


        //priority queue
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());

        //addition of elements
        pq.offer(1);
        pq.add(2);
        pq.add(3);
        pq.offer(7);
        pq.offer(4);
        //pq.offer(null);


        System.out.println(pq);
// retrival of element it retrives only head element
//        System.out.println(pq.peek());
//        System.out.println(pq);
        //removal of element
        //System.out.println(pq.poll());
        //System.out.println(pq.remove());
       // System.out.println(pq);

        //verification of element
        //System.out.println(pq.contains(3));



        //we should not use foreach loop
//        for (Integer integer:pq) {
//            System.out.println(integer);
//
//        }



        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }

        System.out.println(pq);


        //remove all the elements
//        pq.clear();
//        System.out.println(pq);






    }

}
