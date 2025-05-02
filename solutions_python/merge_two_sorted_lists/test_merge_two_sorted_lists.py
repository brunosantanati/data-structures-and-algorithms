import unittest
from merge_two_sorted_lists import Solution
from merge_two_sorted_lists import ListNode

class TestMergeTwoSortedLists(unittest.TestCase):
    def setUp(self):
        self.solution = Solution()

    def test_scenario1(self):
        solution = Solution()

        node3L1 = ListNode(4)
        node2L1 = ListNode(2, node3L1)
        node1L1 = ListNode(1, node2L1)

        node3L2 = ListNode(4)
        node2L2 = ListNode(3, node3L2)
        node1L2 = ListNode(1, node2L2)

        result = solution.mergeTwoLists(node1L1, node1L2)
        result.printList()

        self.assertEqual(1, result.val)
        result = result.next;
        self.assertEqual(1, result.val);
        result = result.next;
        self.assertEqual(2, result.val);
        result = result.next;
        self.assertEqual(3, result.val);
        result = result.next;
        self.assertEqual(4, result.val);
        result = result.next;
        self.assertEqual(4, result.val);