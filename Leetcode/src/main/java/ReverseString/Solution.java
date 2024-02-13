package ReverseString;

public class Solution {

    //input:  s = ["h","e","l","l","o"]
    //Output: ["o","l","l","e","h"]
    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        char temp;
        while (i < j) {
            temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }
}
