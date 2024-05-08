package strings;

public class FrequencyOfChar {
    public static int[] countOccurance(String word){
        int[] frequency = new int[256];
        for(char c : word.toCharArray()){
            frequency[c]++;
        }
        return frequency;
    }
    public static void main(String[] args){
        String word = "Jeevitha Ravichandran";
        int[] occurances = countOccurance(word);
        for(int i=0;i<occurances.length;i++){
            if(occurances[i]>0){
                System.out.println((char)i + " : " + occurances[i]);
            }
        }
    }
}
