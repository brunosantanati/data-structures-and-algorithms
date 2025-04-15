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

# Example Usage
solution_instance = Solution()  # Create an instance of the Solution class.  This is needed to call the twoSum method.
nums_list = [2, 7, 11, 15]
target_value = 9
result = solution_instance.twoSum(nums_list, target_value) # Call the twoSum method on the instance
print(result)  # Output: [0, 1]

nums_list2 = [3,2,4]
target_value2 = 6
result2 = solution_instance.twoSum(nums_list2, target_value2)
print(result2)

# Debug options / Common pdb commands:
# n (next): Execute the current line and move to the next line in the current function.
# s (step): Execute the current line and step into a function call.
# c (continue): Continue execution until the next breakpoint or the end of the program.
# p <expression> (print): Evaluate and print the value of an expression.
# pp <expression> (pretty print): Pretty-print the value of an expression (useful for complex data structures).
# l (list): Show the code around the current line.
# q (quit): Abort the execution of the script.
# r (return): Continue execution until the current function returns.
# b (breakpoint): Set or list breakpoints. b <lineno> sets a breakpoint at a specific line, b <filename>:<lineno> in another file, and b <function> at the start of a function.
# cl <breakpoint_number(s)> (clear): Clear specified breakpoints.

