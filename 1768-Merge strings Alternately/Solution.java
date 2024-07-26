public class Solution {
    public String mergeAlternately(String word1, String word2) {
        //first convert Strings to array of characters to access any character by index 
        char[] wordOneArray = word1.toCharArray();
        char[] wordTwoArray = word2.toCharArray();
        //we need the length of the two words to know when each one end and to know the length of merged word 
        int wordOneLength = word1.length();
        int wordTwoLength = word2.length();
        //creating array instead of string so we can add charcters alternately (you can use String Builder instead)
        char[] mergedArray = new char[wordOneLength + wordTwoLength];
        //the length of longer word is needed so we know when to stop
        int longerWordLength = Math.max(wordOneLength, wordTwoLength);
        //k is used to track the index to add character at
        int k = 0;
        for (int i = 0; i < longerWordLength; i++) {
            
            if (i < wordOneLength) {
                mergedArray[k] = wordOneArray[i];
                k++;
            }
            if (i < wordTwoLength) {
                mergedArray[k] = wordTwoArray[i];
                k++;
            }
        }
        return new String(mergedArray);
    }

    public static void main(String[] args) {
        //test words, you can use any two words you want!
        String word1 = "mahdi";
        String word2 = "saqqa";
        Solution solution = new Solution();
        //if you intersted to know the runtime of the methode 
        long startTime = System.nanoTime();
        String result = solution.mergeAlternately(word1, word2);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        double durationInMilliseconds = duration / 1_000_000.0;
        System.out.println("Merged String: " + result);
        System.out.println("Runtime in nanoseconds: " + duration);
        System.out.println("Runtime in milliseconds: " + durationInMilliseconds);
    }
}
