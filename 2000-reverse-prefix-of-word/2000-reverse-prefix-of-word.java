class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder reverse = new StringBuilder();
        StringBuilder wordString = new StringBuilder(word);
        while(wordString.charAt(0) != ch) {
            reverse.insert(0, wordString.charAt(0));
            wordString.deleteCharAt(0);
            if(wordString.length() == 0) {
                return word;
            }
        }
        reverse.insert(0, wordString.charAt(0));
        wordString.deleteCharAt(0);
        reverse.append(wordString);
        return reverse.toString();
        
        
    }
}