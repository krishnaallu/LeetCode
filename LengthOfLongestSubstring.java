import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println("lengthOfLongestSubstring "+lengthOfLongestSubstring("abcabcdefghabc"));
        
    }

     public static int lengthOfLongestSubstring(String s) {

        Set<Character> charSet = new HashSet<>();
        int left = 0;
        int longLenth = 0;

        for(int right=0;right<s.length();right++) {

            while(charSet.contains(s.charAt(right))) {

                charSet.remove(s.charAt(left));
                left++;
            }

          charSet.add(s.charAt(right));
          longLenth = Math.max(longLenth,right-left+1);



        }
       return longLenth;
    }
}
