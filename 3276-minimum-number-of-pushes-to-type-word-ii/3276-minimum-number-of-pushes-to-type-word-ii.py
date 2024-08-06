class Solution:
    def minimumPushes(self, word: str) -> int:
        letterFreq = [0] * 26
        ans = 0
        for i in range (0, len(word)):
            letterFreq[ord(word[i:i+1]) - ord('a')] += 1
        letterFreq.sort()
        for i in range(25, -1, -1):
            if letterFreq[i] == 0:
                break
            ans += letterFreq[i] * (int((25-i)/8) + 1)
        return ans
         
        