package strings;

public class Reverse {
    public static void ReverseString(char[] s){
        int left=0;
        int right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;

            left++;
            right--;
        }
    }
    public static void main (String[] args){
        char[] s = {'h','e','l','l','o'};
        ReverseString(s);

        for(char ch : s){
            System.out.print(ch + " ");
        }
    }

}
