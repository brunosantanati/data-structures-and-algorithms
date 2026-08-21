class Solution:
    def largestPalindromic(self, num: str) -> str:
        # find out frequency of characters
        freq = [0] * 10
        for c in num:
            index = int(c)
            freq[index] += 1
            
        print(freq)
        
        # create the left half
        left_half = ""
        
        for digit in range(9, -1, -1):
            if digit == 0 and not left_half:
                break
            
            pair = freq[digit] // 2
            left_half += str(digit) * pair
            
            freq[digit] %= 2
        
        print(left_half)
            
        # find out the middle
        middle = ""
        for digit in range(9, -1, -1):
            if freq[digit] > 0:
                middle = str(digit)
                break
            
        print(middle)
        
        # return the final result
        right_half = "".join(reversed(left_half))
        
        return left_half + middle + right_half
        
if __name__ == "__main__":
    solution = Solution()
    result = solution.largestPalindromic("444947137")
    print(result)