# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def nodesBetweenCriticalPoints(self, head: Optional[ListNode]) -> List[int]:
        prev  = head.val
        head = head.next
        if not head.next:
            return [-1, -1]
        critpoints = []
        currentMin = 10 **5 + 1
        i = 1
        while head.next:
            if head.val < prev and head.val < head.next.val:
                critpoints.append(i)
            if head.val > prev and head.val > head.next.val:
                critpoints.append(i)
            if len(critpoints) > 1 and abs(critpoints[len(critpoints) - 1] - critpoints[len(critpoints) - 2]) < currentMin :
                currentMin = abs(critpoints[len(critpoints) - 1] - critpoints[len(critpoints) - 2])
            prev = head.val
            head = head.next
            i += 1
        return [-1 if currentMin == 10 ** 5 + 1 else currentMin, -1 if len(critpoints) <= 1 else abs(critpoints[0] - critpoints[len(critpoints) - 1])]
            