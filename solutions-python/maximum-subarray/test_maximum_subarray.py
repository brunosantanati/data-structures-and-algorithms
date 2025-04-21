import unittest
from maximum_subarray import Solution

class TestMaxSubArray(unittest.TestCase):
    
    def setUp(self):
        self.solution = Solution()

    def test_scenario1(self):
        nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
        result = self.solution.maxSubArray(nums)
        expected = 6;
        self.assertEqual(expected, result)

    def test_scenario2(self):
        nums = [1]
        result = self.solution.maxSubArray(nums)
        expected = 1;
        self.assertEqual(expected, result)

    def test_scenario3(self):
        nums = [5, 4, -1, 7, 8]
        result = self.solution.maxSubArray(nums)
        expected = 23;
        self.assertEqual(expected, result)