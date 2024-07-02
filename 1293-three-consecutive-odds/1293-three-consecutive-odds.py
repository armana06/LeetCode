class Solution:
    def threeConsecutiveOdds(self, arr: List[int]) -> bool:
        for i in range(0, len(arr) - 2):
            allOdd = True
            i -= 1
            for j in range(0, 3):
                i += 1
                if arr[i] % 2 != 1:
                    allOdd = False
                    break
            if allOdd:
                return True
        return False