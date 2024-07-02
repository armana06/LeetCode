class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        nums1Dict = {}
        nums2Dict = {}
        ans = []
        for num in nums1:
            if num in nums1Dict:
                nums1Dict[num] += 1
            else:
                nums1Dict[num] = 1
        for num in nums2:
            if num in nums2Dict:
                nums2Dict[num] += 1
            else:
                nums2Dict[num] = 1
        for num in nums1Dict:
            if num in nums2Dict:
                for i in range(0, min(nums1Dict[num], nums2Dict[num])):
                    ans.append(num)
        return ans