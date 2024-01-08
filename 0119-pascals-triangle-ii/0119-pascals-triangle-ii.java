class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<Integer>();
        row.add(1);
        if(rowIndex == 0) {
            return row;
        }
        row.add(1);
        if(rowIndex == 1) {
            return row;
        }
        for(int i = 1; i < rowIndex ; i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp.add(1);
            for(int j = 1; j < row.size(); j++) {
                temp.add(row.get(j - 1) + row.get(j));
            }
            temp.add(1);
            row = temp;
        }
        return row;
    }
}