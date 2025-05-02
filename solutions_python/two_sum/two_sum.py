from typing import List

class Solution: # The code defines a class named Solution
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        #import pdb; pdb.set_trace() #Enable this line to debug
        num_indices = {}
        for i, num in enumerate(nums):
            complement = target - num
            if complement in num_indices:
                return [num_indices[complement], i]
            num_indices[num] = i
        return []
