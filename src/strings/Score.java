package strings;
//The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.
public class Score {
    public static int ScoreOfString(String s){
        char[] ch = s.toCharArray();
        int sum = 0;

        for(int i=0;i<ch.length-1;i++){
            sum+=Math.abs((int)ch[i] - (int)ch[i+1]);
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(ScoreOfString("hello"));
    }
}
