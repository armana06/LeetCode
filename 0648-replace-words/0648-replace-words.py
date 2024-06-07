class Solution:
    def replaceWords(self, dictionary: List[str], sentence: str) -> str:
        roots = set(dictionary)
        words = sentence.split()
        ans = ''
        for j in range(0, len(words)):
            word = words[j]
            added = False
            for i in range(0, len(word)):
                if word[0:i + 1] in roots :
                    ans+=word[0:i + 1]
                    added = True
                    break
            if not added:
                ans+=word
            if j != len(words):
                ans+=' '
        return ans[0: len(ans) - 1]