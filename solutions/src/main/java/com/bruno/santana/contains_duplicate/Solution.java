package com.bruno.santana.contains_duplicate;

// https://leetcode.com/problems/contains-duplicate/

// This solution is failing in Leetcode (Time Limit Exceeded), so I need to come up with another one

public class Solution {

    public boolean containsDuplicate(int[] nums) {
        Integer[] history = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (checkIfNumExistsInHistory(nums[i], history)) {
                return true;
            }
            history[i] = nums[i];
        }
        return false;
    }

    private boolean checkIfNumExistsInHistory(int num, Integer[] history) {
        for (Integer historyItem : history) {
            if (historyItem != null && historyItem == num) {
                return true;
            }
        }
        return false;
    }

}
