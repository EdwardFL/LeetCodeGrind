package TwoSumII;

import java.util.Arrays;

public class Solution {

    // Array sorted in non-decreasing order
    // find 2 numbers that add up to a specific target number
    // return the indices of the two numbers
    // input: numbers = [2, 7, 11, 15], target = 9
    // output: [1, 2]
    // important! 1 <= index1 <= index2 <= numbers.length -> it starts from 1;
    public static int[] twoSum(int[] nums, int target) {

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            if (nums[i] + nums[j] > target) {
                j--;
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
                return new int[]{i + 1, j + 1};
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(array, target)));
    }
}
