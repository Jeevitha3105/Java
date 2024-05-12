package Hackerrank;
import java.util.*;

public class JavaDeque {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Integer> uniqueSet = new HashSet<>();
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.addLast(num);
            uniqueSet.add(num);

            if(deque.size() == m + 1) {
                int removed = deque.removeFirst();
                if (!deque.contains(removed)) {
                    uniqueSet.remove(removed);
                }
            }

            if(deque.size() == m) {
                maxUnique = Math.max(maxUnique, uniqueSet.size());
            }
        }
        System.out.println(maxUnique);
    }
}
