import unittest
from best_time_to_buy_and_sell_stock import maxProfit

class TestMaxProfit(unittest.TestCase):

  def test_scenario1(self):
    prices = [7, 1, 5, 3, 6, 4]
    result = maxProfit(prices)
    expected = 5
    self.assertEqual(result, expected)

  def test_scenario2(self):
    prices = [7, 6, 4, 3, 1]
    result = maxProfit(prices)
    expected = 0
    self.assertEqual(result, expected)

  def test_scenario3(self):
    prices = [7, 8, 9, 6, 4, 3, 2]
    result = maxProfit(prices)
    expected = 2
    self.assertEqual(result, expected)

  def test_scenario4(self):
    prices = [7, 8, 9, 6, 4, 3, 6]
    result = maxProfit(prices)
    expected = 3
    self.assertEqual(result, expected)