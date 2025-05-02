import unittest
from reverse_string import Solution

class TestReverseString(unittest.TestCase):
    def setUp(self):
        self.solution = Solution()

    def test_scenario1(self):
        input_chars = ["h", "e", "l", "l", "o"]
        expected = ["o", "l", "l", "e", "h"]
        self.solution.reverseString(input_chars)
        self.assertEqual(input_chars, expected)

    def test_scenario2(self):
        input_chars = ["H", "a", "n", "n", "a", "h"]
        expected = ["h", "a", "n", "n", "a", "H"]
        self.solution.reverseString(input_chars)
        self.assertEqual(input_chars, expected)
