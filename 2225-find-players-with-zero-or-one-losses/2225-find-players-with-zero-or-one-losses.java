class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashSet<Integer> undefeated = new HashSet<Integer>();
        HashSet<Integer> oneLoss = new HashSet<Integer>();
        HashSet<Integer> out = new HashSet<Integer>();
        for(int[] game : matches) {
            if(!oneLoss.contains(game[0]) && !out.contains(game[0])) {
                undefeated.add(game[0]);
            }
            if(oneLoss.contains(game[1])) {
                oneLoss.remove(game[1]);
                out.add(game[1]);
            }
            else if(!out.contains(game[1])){
                undefeated.remove(game[1]);
                oneLoss.add(game[1]);
            }
        }
        ArrayList<Integer> winners = new ArrayList<Integer>();
        ArrayList<Integer> losers = new ArrayList<Integer>();
        for(Integer i : undefeated) {
            winners.add(i);
        }
        winners.sort(Comparator.naturalOrder());
        for(Integer i : oneLoss) {
            losers.add(i);
        }
        losers.sort(Comparator.naturalOrder());
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(winners);
        answer.add(losers);
        return answer;
    }
}