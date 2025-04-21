import unittest
from contains_duplicate import Solution

class TestcontainsDuplicate(unittest.TestCase):
    
    def setUp(self):
        self.solution = Solution()

    def test_scenario1(self):
        nums = [1, 2, 3, 1]
        result = self.solution.containsDuplicate(nums)
        expected = True
        self.assertEqual(expected, result)

    def test_scenario2(self):
        nums = [1, 2, 3, 4]
        result = self.solution.containsDuplicate(nums)
        expected = False
        self.assertEqual(expected, result)

    def test_scenario3(self):
        nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
        result = self.solution.containsDuplicate(nums)
        expected = True
        self.assertEqual(expected, result)

    def test_scenario4(self):
        nums = [7, 2, 1, 1]
        result = self.solution.containsDuplicate(nums)
        expected = True
        self.assertEqual(expected, result)

    def test_scenario5(self):
        nums = [0, 1, 2, 3, 4]
        result = self.solution.containsDuplicate(nums)
        expected = False
        self.assertEqual(expected, result)