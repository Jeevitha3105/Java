package Queue;

import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueClass {
  public static void main(String[] args){
      Queue<Integer> pQueue = new PriorityQueue<Integer>();
      pQueue.add(10);           //elements are reordered automatically based on their natural ordering (10,15,20)
      pQueue.add(20);
      pQueue.add(15);

      System.out.println(pQueue);
      System.out.println(pQueue.peek());
      System.out.println(pQueue.remove());
      System.out.println(pQueue.peek());
  }
}
