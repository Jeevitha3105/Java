package strings;

public class NumbersInSentence {
    public static boolean areNumbersAscending(String s) {
        String[] tokens = s.split("\\s+");
        int prevNum=-1;
        for(String token : tokens){
            try{
                int num = Integer.parseInt(token);
                if(num<=prevNum){
                    return false;
                }
                prevNum=num;
            }
            catch(NumberFormatException e){

            }
        }
        return true;
    }

    public static void main(String[] args){
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        System.out.println(areNumbersAscending(s));
    }
}
