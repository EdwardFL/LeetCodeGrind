package ValidAnagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    // input: 2 string s, t; s = "anagram", t= "nagaram"
    // output: true
    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        char[] arr = s.toCharArray();
        char[] arr1 = t.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);

        String str = new String(arr);
        String str1 = new String(arr1);

        if (str.equals(str1)) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
    }
}
