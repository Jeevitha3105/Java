package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueCreation {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);                                                                 //or offer
        queue.add(3);
        queue.add(4);
        queue.add(5);

        for(int i=1;i<=5;i++){
            queue.add(i);
        }

        System.out.println("Size of the queue : " + queue.size());                     //size
        System.out.println("Elements of queue : " + queue);
        System.out.println("Head of the queue : " + queue.peek());                    //or element

        System.out.println("Removed : " + queue.remove());                            //or poll

        Iterator iterator = queue.iterator();                                         //Iterating
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }



    }
}
