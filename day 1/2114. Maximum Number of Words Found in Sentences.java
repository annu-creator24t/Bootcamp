class Solution {
    public int mostWordsFound(String[] sentences) {

        int max = 0;

        for (String sentence : sentences) {

            int spaces = 0;

            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    spaces++;
                }
            }

            int words = spaces + 1;

            if (words > max) {
                max = words;
            }
        }

        return max;
    }
}