
import java.util.Arrays;

class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isValidAnagram("Allu","uaall"));
    }


private static boolean isValidAnagram(String s, String t) {

if(s.length() != t.length()) return false;

char[] sArr = s.toCharArray();
char[] tArr = t.toCharArray();
Arrays.sort(sArr);
Arrays.sort(tArr);


return new String(sArr).equalsIgnoreCase(new String(tArr));


}
}