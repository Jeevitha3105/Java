package matrix;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RichestWealth {

    public static void main(String[] args){
        int[][] accounts = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] wealthValues = new int[accounts.length];
        for(int i=0;i<accounts.length;i++){
            int wealth=0;
            for(int j=0;j<accounts[0].length;j++){
                wealth+=accounts[i][j];
            }
            wealthValues[i] = wealth;
        }
        System.out.println(Arrays.toString(wealthValues));

        int max = wealthValues[0];
        for(int i=0;i<wealthValues.length;i++){
            if(wealthValues[i]>max){
                max=wealthValues[i];
            }
        }
        System.out.println(max);
    }

}
