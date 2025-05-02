package com.bruno.santana.remove_duplicates_from_sorted_array;


// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// My solution: https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/1617312751/

public class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0; // If array is empty, return 0
        }

        int i = 0; // Pointer to track the unique element position

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) { // Found a unique element
                i++; // Move pointer i to the next position
                nums[i] = nums[j]; // Place the unique element at the new position
            }
        }

        return i + 1; // Return the number of unique elements
    }

}
