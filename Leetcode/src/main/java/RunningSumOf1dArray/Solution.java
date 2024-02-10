package RunningSumOf1dArray;

import java.util.Arrays;

public class Solution {

    // input: [2, 3, 5, 1, 6]
    // output: [2, 5, 10, 11, 17]

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int currentSum = 0;

        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            result[i] = currentSum;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 5, 1, 6};
        System.out.println(Arrays.toString(runningSum(array)));
    }
}
