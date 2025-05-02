import unittest
from two_sum import Solution  # <-- Import your class from the other file

class TestTwoSum(unittest.TestCase):
    def setUp(self):
        self.solution = Solution()

    def test_example_case(self):
        self.assertEqual(self.solution.twoSum([2, 7, 11, 15], 9), [0, 1])

    def test_different_indices(self):
        self.assertEqual(self.solution.twoSum([3, 2, 4], 6), [1, 2])

    def test_same_number_twice(self):
        self.assertEqual(self.solution.twoSum([3, 3], 6), [0, 1])

    def test_no_solution(self):
        self.assertEqual(self.solution.twoSum([1, 2, 3], 7), [])

if __name__ == '__main__':
    unittest.main()

