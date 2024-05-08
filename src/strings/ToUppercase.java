package strings;

public class ToUppercase {
    public static void main(String[] args){
        String sentence = "jeeviTHA";
        char[] array = sentence.toCharArray();
        for(int i=0;i<array.length;i++){
            if(array[i] >='a' && array[i]<='z'){
                array[i] = (char)(array[i]-32);
            }
        }
        String result = new String(array);
        System.out.println(result);
    }
}
