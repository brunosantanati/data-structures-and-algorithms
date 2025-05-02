# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

    # Add a method to print the linked list
    def printList(self):
        current = self
        while current:
            print(current.val, end=" -> " if current.next else "\n")
            current = current.next

class Solution(object):
    def mergeTwoLists(self, list1: ListNode, list2: ListNode) -> ListNode:
        dummy: ListNode = ListNode(-1)
        current: ListNode = dummy

        while list1 is not None and list2 is not None:
            if list1.val <= list2.val:
                current.next = list1
                list1 = list1.next
            else:
                current.next = list2
                list2 = list2.next
            current = current.next

        current.next = list1 if list1 is not None else list2

        return dummy.next
    
solution = Solution()

node3L1 = ListNode(4)
node2L1 = ListNode(2, node3L1)
node1L1 = ListNode(1, node2L1)

node3L2 = ListNode(4)
node2L2 = ListNode(3, node3L2)
node1L2 = ListNode(1, node2L2)

result = solution.mergeTwoLists(node1L1, node1L2)
result.printList()