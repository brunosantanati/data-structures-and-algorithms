import unittest
from largest_palindromic_number import Solution

class TestLargestPalindromicNumber(unittest.TestCase):
    
    def setUp(self):
        self.solution = Solution()

    def test_scenario1(self):
        result = self.solution.largestPalindromic("444947137")
        expected = "7449447"
        self.assertEqual(expected, result)