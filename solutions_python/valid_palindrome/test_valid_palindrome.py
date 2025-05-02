import unittest
from valid_palindrome import is_palindrome

class TestIspalindrome(unittest.TestCase):

    def test_scenario1(self):
        input_string = "A man, a plan, a canal: Panama"
        result = is_palindrome(input_string)
        self.assertEqual(True, result)

    def test_scenario2(self):
        input_string = "race a car"
        result = is_palindrome(input_string)
        self.assertEqual(False, result)

    def test_scenario3(self):
        input_string = " "
        result = is_palindrome(input_string)
        self.assertEqual(True, result)