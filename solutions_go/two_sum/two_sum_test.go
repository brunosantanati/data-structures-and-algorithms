package main

import (
	"reflect"
	"testing"
)

func TestTwoSum(t *testing.T) {
	tests := []struct {
		nums     []int
		target   int
		expected []int
	}{
		{[]int{2, 7, 11, 15}, 9, []int{0, 1}},
		{[]int{3, 2, 4}, 6, []int{1, 2}},
		{[]int{3, 3}, 6, []int{0, 1}},
		{[]int{1, 2, 3}, 7, []int{}}, // No match case
	}

	for _, tt := range tests {
		result := twoSum(tt.nums, tt.target)
		if !reflect.DeepEqual(result, tt.expected) {
			t.Errorf("twoSum(%v, %d) = %v; want %v", tt.nums, tt.target, result, tt.expected)
		}
	}
}

