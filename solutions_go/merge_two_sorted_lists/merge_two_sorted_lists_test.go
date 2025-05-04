package main

import (
	"testing"
)

func TestScenario1(t *testing.T) {
	node3L1 := &ListNode{Val: 4}
	node2L1 := &ListNode{Val: 2, Next: node3L1}
	node1L1 := &ListNode{Val: 1, Next: node2L1}

	node3L2 := &ListNode{Val: 4}
	node2L2 := &ListNode{Val: 3, Next: node3L2}
	node1L2 := &ListNode{Val: 1, Next: node2L2}

	result := mergeTwoLists(node1L1, node1L2)
	result.PrintList()

	if result.Val != 1 {
		t.Errorf("expected 1, got %d", result.Val)
	}
	result = result.Next

	if result.Val != 1 {
		t.Errorf("expected 1, got %d", result.Val)
	}
	result = result.Next

	if result.Val != 2 {
		t.Errorf("expected 2, got %d", result.Val)
	}
	result = result.Next

	if result.Val != 3 {
		t.Errorf("expected 3, got %d", result.Val)
	}
	result = result.Next

	if result.Val != 4 {
		t.Errorf("expected 4, got %d", result.Val)
	}
	result = result.Next

	if result.Val != 4 {
		t.Errorf("expected 4, got %d", result.Val)
	}

}
