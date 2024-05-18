package random;

import java.util.ArrayList;
import java.util.List;

//Kids With the Greatest Number of Candies
public class Candies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int greatest = 0;
        for(int i=0; i<candies.length;i++){
            if(candies[i] > greatest){
                greatest = candies[i];
            }
        }

        for(int i=0; i<candies.length; i++){
            int sum = candies[i] + extraCandies;
            if(sum >= greatest){
                list.add(true);
            }else{
                list.add(false);
            }
        }
return list;
    }
    public static void main(String[] args){
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
}
