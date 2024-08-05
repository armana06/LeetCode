class Solution:
    def kthDistinct(self, arr: list[str], k: int) -> str:
        uniqueStr = set()
        removed = set()
        for s in arr:
            if s in removed:
                continue
            if s in uniqueStr:
                uniqueStr.remove(s)
                removed.add(s)
            else:
                uniqueStr.add(s)
            
        i = 0
        print(uniqueStr)
        for s in arr:
            if s in uniqueStr:
                i += 1
                if i == k:
                    return s
        return ""