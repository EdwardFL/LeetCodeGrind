package ContainsDuplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    // input: [1, 2, 3, 4]
    // output: false
    public static boolean containsDuplicate(int[] nums) {

        if (nums == null || nums.length == 0) {
            return false;
        }

        Set<Integer> uniqueNums = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            uniqueNums.add(nums[i]);
        }

        if (nums.length != uniqueNums.size()) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1};
        System.out.println(containsDuplicate(array));
    }
}
