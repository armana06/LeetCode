class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort(key=lambda x : x[0])
        i : int = 0
        ans : List[List[int]] = []
        while i < len(intervals):
            cur : List[int] = [intervals[i][0], intervals[i][1]]
            while i < len(intervals) and intervals[i][0] <= cur[1] :
                cur[1] = max(cur[1], intervals[i][1])
                i += 1
            ans.append(cur)
        return ans 
            