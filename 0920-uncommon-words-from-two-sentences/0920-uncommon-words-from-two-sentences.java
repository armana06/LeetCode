class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
       HashSet<String> uncommon = new HashSet<String>();
       HashSet<String> removed = new HashSet<String>();
       String[] string1 = s1.split(" ");
       String[] string2 = s2.split(" ");
       for(int i = 0; i < string1.length || i < string2.length; ++i) {
            if(i < string1.length) {
                if(!removed.contains(string1[i]) && !uncommon.add(string1[i])) {
                    uncommon.remove(string1[i]);
                    removed.add(string1[i]);
                }
            }
            if(i < string2.length) {
                if(!removed.contains(string2[i]) && !uncommon.add(string2[i])) {
                    uncommon.remove(string2[i]);
                    removed.add(string2[i]);
                }
            }
       } 
       String[] ans = new String[uncommon.size()];
       int i = 0;
       for(String a : uncommon) {
            ans[i] = a;     
            i++;
       }
       return ans;
    }
}