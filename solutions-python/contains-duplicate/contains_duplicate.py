from typing import List

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        unique_set = set()
        
        for num in nums:
            # If the current element is already in the set, return True
            if num in unique_set:
                return True
            else:
                # Otherwise, add the element to the set
                unique_set.add(num)

        # If no duplicates are found, return False
        return False

