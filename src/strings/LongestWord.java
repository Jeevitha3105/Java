package strings;

public class LongestWord {
    public static String longest(int n, String[] names) {
        // code here
        String max ="";
        for(int i=0; i<n; i++){
            if(max.length() < names[i].length()){
                max = names[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        String[] names = { "Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks" };
        System.out.println(longest(5,names));
    }
}
