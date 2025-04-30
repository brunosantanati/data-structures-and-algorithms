package com.bruno.santana.merge_two_sorted_lists;

// https://leetcode.com/problems/merge-two-sorted-lists/description/
// My solution: https://leetcode.com/problems/merge-two-sorted-lists/submissions/1621744629/
public class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Connect the remaining elements
        current.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }

}
