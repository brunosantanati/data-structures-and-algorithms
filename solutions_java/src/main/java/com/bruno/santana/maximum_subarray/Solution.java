package com.bruno.santana.maximum_subarray;

// Kadane’s Algorithm
// https://leetcode.com/problems/maximum-subarray/description/
// My solution: https://leetcode.com/problems/maximum-subarray/submissions/1610185702/

public class Solution {

    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (currentSum < 0) {
                currentSum = nums[i];
            } else {
                currentSum += nums[i];
            }

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

}
