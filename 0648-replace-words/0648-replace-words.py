class Solution:
    def replaceWords(self, dictionary: List[str], sentence: str) -> str:
        roots = set(dictionary)
        words = sentence.split()
        ans = ''
        for j in range(0, len(words)):
            word = words[j]
            added = False
            temp = ''
            for i in range(0, len(word)):
                temp+=word[i]
                if temp in roots :
                    ans+=temp
                    added = True
                    break
            if not added:
                ans+=word
            if j != len(words) - 1:
                ans+=' '
        return ans