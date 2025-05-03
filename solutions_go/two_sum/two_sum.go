package main

import (
	"fmt"
)

func twoSum(nums []int, target int) []int {
	// Create a map to store number -> index
	numIndices := make(map[int]int)

	for i, num := range nums {
		complement := target - num
		if idx, found := numIndices[complement]; found {
			return []int{idx, i}
		}
		numIndices[num] = i
	}
	return []int{}
}

func main() {
	// Example Usage
	nums := []int{2, 7, 11, 15}
	target := 9
	result := twoSum(nums, target)
	fmt.Println(result) // Output: [0 1]
}
