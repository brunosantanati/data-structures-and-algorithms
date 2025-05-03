package main

import "fmt"

// https://leetcode.com/problems/merge-two-sorted-lists/description/
// My solution: https://leetcode.com/problems/merge-two-sorted-lists/submissions/1624112514/

// Definition for singly-linked list.
type ListNode struct {
	Val  int
	Next *ListNode
}

func (l *ListNode) PrintList() {
	for l != nil {
		fmt.Print(l.Val)
		if l.Next != nil {
			fmt.Print(" -> ")
		}
		l = l.Next
	}
	fmt.Print()
}

func mergeTwoLists(list1 *ListNode, list2 *ListNode) *ListNode {
	dummy := &ListNode{}
	current := dummy

	for list1 != nil && list2 != nil {
		if list1.Val <= list2.Val {
			current.Next = list1
			list1 = list1.Next
		} else {
			current.Next = list2
			list2 = list2.Next
		}

		current = current.Next
	}

	if list1 != nil {
		current.Next = list1
	} else {
		current.Next = list2
	}

	return dummy.Next
}

func main() {
	node3L1 := &ListNode{Val: 4}
	node2L1 := &ListNode{Val: 2, Next: node3L1}
	node1L1 := &ListNode{Val: 1, Next: node2L1}

	node3L2 := &ListNode{Val: 4}
	node2L2 := &ListNode{Val: 3, Next: node3L2}
	node1L2 := &ListNode{Val: 1, Next: node2L2}

	result := mergeTwoLists(node1L1, node1L2)
	result.PrintList()
}
