package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueCreation {
    public static void main(String[] args){
        Deque<String> deque = new ArrayDeque<>();
        deque.add("is");
        deque.addFirst("It");                                                                   //or offerFirst
        deque.addLast("good");                                                                  //or offerLast

        System.out.println(deque);
        System.out.println(deque.getFirst());                                       //peekFirst
        System.out.println(deque.getLast());                                        //peekLast
        System.out.println(deque.contains("is"));
        System.out.println(deque.removeFirst());                                    //or pollFirst
        System.out.println(deque.removeLast());                                     //or pollLast



    }
}
