package ValidPalindrome;

import java.util.Arrays;

public class Solution {

    //input: "A man, a plan, a canal: Panama"
    //output: true
    public static boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        for(int i = 0; i < s.length() / 2; i++) { // Use < instead of <=
            char start = s.charAt(i);
            char end = s.charAt(s.length() - 1 - i);

            if (start != end) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }
}
