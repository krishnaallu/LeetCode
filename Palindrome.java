class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("kanak"));
    }


private static boolean isPalindrome(String s) {
return new StringBuilder(s).reverse().toString().equals(s);

}
}