class Solution:
    def findMaxFish(self, grid: List[List[int]]) -> int:
        visited = {(0,0)}
        maxVal = 0
        for i in range(0, len(grid)):
            for j in range(0, len(grid[i])):
                if grid[i][j] not in visited and grid[i][j] != 0:
                    visited.add((i,j))
                    component = self.dfs(grid, i, j, visited)
                    maxVal = max(component, maxVal) 
        return maxVal
    def dfs(self, grid, i, j, visited) -> int:
        ans = 0
        stack = [(i, j)]
        while(len(stack) != 0):
            elem = stack.pop()
            ans += grid[elem[0]][elem[1]]
            adj = [(elem[0] - 1, elem[1]), (elem[0] + 1, elem[1]), (elem[0], elem[1] - 1), (elem[0], elem[1] + 1)]
            for cell in adj:
                if( cell not in visited and cell[0] >= 0 and cell[0] < len(grid) and cell[1] >= 0 and cell[1] < len(grid[cell[0]]) and grid[cell[0]][cell[1]] != 0):
                    stack.append(cell)
                    visited.add(cell)
        return ans
