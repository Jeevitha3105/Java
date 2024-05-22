package strings;

import java.util.*;

public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = String.valueOf(charArr);

            if(map.containsKey(sortedStr)){
                map.get(sortedStr).add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(sortedStr,list);
            }
        }
        return new ArrayList<>(map.values());               //Convert the map values to a list of lists and return
    }
    public static void main(String[] args){
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}
