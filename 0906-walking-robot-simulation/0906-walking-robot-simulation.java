class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        HashMap<Integer, HashSet<Integer>> obsMap = new HashMap<Integer, HashSet<Integer>>();
        int[] curCoord = new int[] {0, 0};
        int curDirection = 0;
        int furthestPoint = 0;
        for(int[] obs : obstacles) {
            obsMap.putIfAbsent(obs[0], new HashSet<Integer>());
            obsMap.get(obs[0]).add(obs[1]);
        }
        for(int command : commands) {
            if(command == -1) {
                curDirection = (curDirection + 1) % 4;
                continue;
            }
            if(command == -2) {
                curDirection = (curDirection - 1) % 4;
                if(curDirection == -1) {
                    curDirection = 3;
                }
                continue;
            }
            for(int i = 0; i < command; ++i) {
            switch(curDirection) {
                case 0:
                    if(obsMap.containsKey(curCoord[0]) && obsMap.get(curCoord[0]).contains(curCoord[1] + 1)) {
                        continue;
                    }
                    curCoord[1] += 1;
                    break;
                case 1:
                    if(obsMap.containsKey(curCoord[0] + 1) && obsMap.get(curCoord[0] + 1).contains(curCoord[1])) {
                        continue;
                    }
                    curCoord[0] += 1;
                    break;
                case 2:
                    if(obsMap.containsKey(curCoord[0]) && obsMap.get(curCoord[0]).contains(curCoord[1] - 1)) {
                        continue;
                    }
                    curCoord[1] -= 1;
                    break;
                case 3:
                    if(obsMap.containsKey(curCoord[0] - 1) && obsMap.get(curCoord[0] - 1).contains(curCoord[1])) {
                        continue;
                    }
                    curCoord[0] -= 1;
                    break;
            }
            furthestPoint = furthestPoint < ((int) (Math.pow(curCoord[0], 2) + Math.pow(curCoord[1], 2))) ? ((int) (Math.pow(curCoord[0], 2) + Math.pow(curCoord[1], 2))) : furthestPoint;
            }
        }
        return furthestPoint;

    }
}