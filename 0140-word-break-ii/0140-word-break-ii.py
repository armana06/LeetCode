class Solution:
    def wordBreak(self, s: str, wordDict: list[str]) -> list[str]:
        wordSet = set(wordDict)
        ans = []
        self.wbreak(s, wordSet, "", ans, 0)
        return ans
    def wbreak(self, s, wordSet, cur, ans, index):
        if index == len(s) :
            ans.append(cur)
            return
        for cut in range(index + 1, len(s) + 1) :
            word = s[index:cut]
            if word in wordSet :
                tempCur = cur
                if(len(cur) == 0):
                    tempCur += word
                else:
                    tempCur += " " + word
                self.wbreak(s, wordSet, tempCur, ans, cut)
        return