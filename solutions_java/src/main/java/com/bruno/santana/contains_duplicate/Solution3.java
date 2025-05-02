package com.bruno.santana.contains_duplicate;

import java.util.HashSet;

public class Solution3 {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> uniqueSet = new HashSet<>();

        for (int num : nums) {
            if (uniqueSet.contains(num)) {
                return true;
            }
            uniqueSet.add(num);
        }

        return false;
    }

}
