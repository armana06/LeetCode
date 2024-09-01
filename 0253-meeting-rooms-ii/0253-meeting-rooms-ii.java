class Solution {
    class Sort implements Comparator<int[]> {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
    }
    public int minMeetingRooms(int[][] intervals) {
        Sort a = new Sort();
        Arrays.sort(intervals, a);
        PriorityQueue<Integer> endTime = new PriorityQueue<Integer>();
        int rooms = 0;
        int roomsOccupied = 0;
        for(int i = 0; i < intervals.length; ++i) {
            while(!endTime.isEmpty() && endTime.peek() <= intervals[i][0]) {
                endTime.poll();
                roomsOccupied--;
            }
            if(rooms == roomsOccupied) {
                rooms++;     
            }
            roomsOccupied++;
            endTime.offer(intervals[i][1]);
        } 
        return rooms;
    }
}