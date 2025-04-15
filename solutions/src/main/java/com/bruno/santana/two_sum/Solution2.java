package com.bruno.santana.two_sum;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum/
// I submitted this solution: https://leetcode.com/problems/two-sum/submissions/1607238093/
// https://leetcode.com/problems/two-sum/solutions/6652249/simple-java-solution-by-brunosantanati-qsm4/

public class Solution2 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numberIndices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer subtractionResult = target - nums[i];
            if (numberIndices.containsKey(subtractionResult)) {
                return new int[]{numberIndices.get(subtractionResult), i};
            }
            numberIndices.put(nums[i], i);
        }
        return new int[]{};
    }

}
