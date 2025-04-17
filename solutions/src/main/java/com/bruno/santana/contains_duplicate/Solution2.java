package com.bruno.santana.contains_duplicate;

import java.util.HashSet;
import java.util.Set;

// My accepted solution: https://leetcode.com/problems/contains-duplicate/submissions/1609307887/

public class Solution2 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> history = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!history.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

}
