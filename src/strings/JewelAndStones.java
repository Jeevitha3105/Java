package strings;

public class JewelAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i=0; i<jewels.length();i++){
            for(int j=0; j<stones.length();j++){
                if(jewels.charAt(i) == stones.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        String jewels = "aA";
        String stones = "aAAAbbbb";
        System.out.println(numJewelsInStones(jewels,stones));
    }
}
