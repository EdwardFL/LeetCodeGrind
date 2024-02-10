package LeftAndRightSumDifferences;

import java.util.Arrays;

public class Solution {

    // leftSum[i] is sum of elements to the left of the index i in the array nums. if no such element then leftSum[i] = 0;
    // rightSum[i] is sum of elements to the right of the index i in the array nums. if no such element then rightSum[i] = 0;
    // input: [10, 4, 8, 0]
    // output: [15, 1, 11, 22] left[0, 10, 14, 22], right[15, 11, 3, 0]

    public static int[] leftRightDifference(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int[] answer = new int[nums.length];
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                answer[i] = 0;
                currentSum += nums[i];
                continue;
            }
            answer[i] = currentSum;
            currentSum += nums[i];

        }
        currentSum = 0;
        answer[nums.length - 1] = Math.abs(answer[nums.length - 1] - currentSum);
        for (int j = nums.length - 1; j >= 0; j--) {
            if (j == nums.length - 1) {
                answer[j] = Math.abs(answer[j] + 0);
                currentSum += nums[j];
                continue;
            }
            answer[j] = Math.abs(answer[j] - currentSum);
            currentSum += nums[j];

        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {10, 4, 8, 3};
        System.out.println(Arrays.toString(leftRightDifference(array)));
    }
}
