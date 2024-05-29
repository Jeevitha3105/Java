package strings;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();                      //add all the symbols and values
        map.put('I' , 1);
        map.put('V' , 5);
        map.put('X' , 10);
        map.put('L' , 50);
        map.put('C' , 100);
        map.put('D' , 500);
        map.put('M' , 1000);

        int result = map.get(s.charAt(s.length()-1));                       //assign last index to the result
        for(int i=s.length()-2; i>=0; i--){                                 //Iterate from last index, compare last to second last index
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){              //If charAt(i) is lesser than charAt(i+1), subtract from result
                result -= map.get(s.charAt(i));
            }else{
                result += map.get(s.charAt(i));                            //otherwise add to result;
            }
        }
        return result;
    }


    public static void main(String[] args){
        String s = "III";
        System.out.println(romanToInt(s));
    }
}
