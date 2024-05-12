package Set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BasicSet {
    public static void main(String[] args){
        Set<Integer> hashSetA = new HashSet<>();
        hashSetA.addAll(Arrays.asList(new Integer[]{1,2,3,4,5}));

        Set<Integer> hashSetB = new HashSet<>();
        hashSetB.addAll(Arrays.asList(new Integer[]{3,4,5,6,7}));

//        UNION
        Set<Integer> union = new HashSet<>(hashSetA);
        union.addAll(hashSetB);

//        INTERSECTION
        Set<Integer> intersection = new HashSet<>(hashSetA);
        intersection.retainAll(hashSetB);

//       DIFFERENCE
        Set<Integer> difference = new HashSet<>(hashSetA);
        difference.removeAll(hashSetB);

        System.out.println(hashSetA);
        System.out.println(hashSetB);
        System.out.println("union of two sets : " + union);
        System.out.println("intersection of two sets : " + intersection);
        System.out.println("difference of two sets : " + difference);

        Iterator<Integer> i = hashSetA.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }


    }
}
