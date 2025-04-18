from typing import List

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        # Maximum sum so far
        max_sum = nums[0]

        # Maximum sum for subarray ending at current index
        curr_sum = nums[0]

        for i in range(1, len(nums)):
            # If maximum sum subarray ending at last index is negative, start a new subarray
            if curr_sum < 0:
                curr_sum = nums[i]
            else:
                # Otherwise, extend the maximum sum subarray from the last index
                curr_sum = curr_sum + nums[i]

            # Update the maximum sum if the current sum is greater
            max_sum = max(max_sum, curr_sum)

        # max_sum now holds the maximum of all subarrays
        return max_sum

# Example usage
solution = Solution()
nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
result = solution.maxSubArray(nums)
print("Maximum subarray sum:", result)

