package TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if (integerMap.get(nums[i]) != null) {
                return new int[] {integerMap.get(nums[i]), i};
            }
            integerMap.put(target - nums[i], i);
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(array, target)));
    }
}
