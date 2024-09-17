class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {


        // Create a list to store the result
        List<Integer> result = new ArrayList<>();
        
        // Iterate over the array of words with index
        for (int i = 0; i < words.length; i++) {
            // Check if the character x is in the current word
            if (words[i].indexOf(x) != -1) {
                // Add the index to the result list
                result.add(i);
            }
        }
        
        // Return the result list
        return result;
    }
    
    public static void main(String[] args) {
        // Example usage
        Solution solution = new Solution();
        
        String[] words1 = {"leet", "code"};
        char x1 = 'e';
        System.out.println(solution.findWordsContaining(words1, x1)); // Output: [0, 1]

        String[] words2 = {"abc", "bcd", "aaaa", "cbc"};
        char x2 = 'a';
        System.out.println(solution.findWordsContaining(words2, x2)); // Output: [0, 2]

        String[] words3 = {"abc", "bcd", "aaaa", "cbc"};
        char x3 = 'z';
        System.out.println(solution.findWordsContaining(words3, x3)); // Output: []
    }
}