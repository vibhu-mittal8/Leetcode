class Solution {
    public int mostWordsFound(String[] sentences) {

        int maxWords = 0;

        for (int i = 0; i < sentences.length; i++) {

            String[] words = sentences[i].split(" ");

            int count = words.length;

            if (count > maxWords) {
                maxWords = count;
            }
        }

        return maxWords;
        
    }
}