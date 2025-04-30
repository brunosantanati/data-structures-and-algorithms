package com.bruno.santana.merge_two_sorted_lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    void testScenario1() {
        /*ListNode node3L1 = new ListNode(4);
        ListNode node2L1 = new ListNode(2, node3L1);
        ListNode node1L1 = new ListNode(1, node2L1);*/
        ListNode node1L1 = createList(1, 2, 4); //this line does the same thing as the commented out lines

        node1L1.printList();

        /*ListNode node3L2 = new ListNode(4);
        ListNode node2L2 = new ListNode(3, node3L2);
        ListNode node1L2 = new ListNode(1, node2L2);*/
        ListNode node1L2 = createList(1, 3, 4); //this line does the same thing as the commented out lines

        node1L2.printList();

        ListNode result = solution.mergeTwoLists(node1L1, node1L2);

        result.printList();

        assertEquals(1, result.val);
        result = result.next;
        assertEquals(1, result.val);
        result = result.next;
        assertEquals(2, result.val);
        result = result.next;
        assertEquals(3, result.val);
        result = result.next;
        assertEquals(4, result.val);
        result = result.next;
        assertEquals(4, result.val);
    }

    @Test
    void testScenario2() {
        ListNode node1L1 = null;
        ListNode node1L2 = null;

        ListNode result = solution.mergeTwoLists(node1L1, node1L2);

        assertNull(result);
    }

    @Test
    void testScenario3() {
        ListNode node1L1 = null;

        ListNode node1L2 = new ListNode(0);

        node1L2.printList();

        ListNode result = solution.mergeTwoLists(node1L1, node1L2);

        result.printList();

        assertEquals(0, result.val);
        assertNull(result.next);
    }

    private ListNode createList(int... values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }


}
