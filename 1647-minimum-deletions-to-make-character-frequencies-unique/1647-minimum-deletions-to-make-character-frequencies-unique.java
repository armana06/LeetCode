class Solution {
       public int minDeletions(String s) {
        ArrayList<Character> uniqueChar = new ArrayList<>();
        ArrayList<Integer> frequency = new ArrayList<>();
        int deletions = 0;
        for(int i = 0; i < s.length(); i++) {
            if(!uniqueChar.contains(s.charAt(i))) {
                uniqueChar.add(s.charAt(i));
                frequency.add(1);
            }
            else {
                frequency.set(uniqueChar.indexOf(s.charAt(i)), frequency.get(uniqueChar.indexOf(s.charAt(i))) + 1);
            }
        }
        System.out.println(frequency);
        while(containsDup(frequency)) {
            for (int i = 0; i < frequency.size(); i++) {
                if (frequency.lastIndexOf(frequency.get(i)) != i) {
                    frequency.set(i, frequency.get(i) - 1);
                    deletions++;
                    if (frequency.get(i) == 0) {
                        frequency.remove(i);
                        if (i > 0) {
                            i--;
                        }
                    }
                }
                if (frequency.indexOf(frequency.get(i)) != i) {
                    i = frequency.indexOf(frequency.get(i));
                    frequency.set(i, frequency.get(i) - 1);
                    deletions++;
                    if (frequency.get(i) == 0) {
                        frequency.remove(i);
                        if (i > 0) {
                            i--;
                        }
                    }
                }

                System.out.println(frequency + " " + i);
            }
    }
        return deletions;
    }
    public static boolean containsDup(ArrayList<Integer> a) {
        for(int i = 0; i < a.size(); i++) {
            if(a.lastIndexOf(a.get(i)) != i || a.indexOf(a.get(i)) != i) {
                return true;
            }
        }
        return false;
    }
}