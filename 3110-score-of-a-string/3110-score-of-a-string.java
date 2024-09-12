public class Solution {
    // Method to calculate the score of the string
    public int scoreOfString(String s) {
        // Variable to store the total score
        int sum = 0;

        // Loop through the string to calculate the absolute difference
        for (int i = 0; i < s.length() - 1; i++) {
            // Get the ASCII values of the current character and the next character
            int ascii1 = s.charAt(i);
            int ascii2 = s.charAt(i + 1);

            // Calculate the absolute difference and add it to the sum variable
            int difference = Math.abs(ascii1 - ascii2);
            sum += difference;
        }

        // Return the final score result
        return sum;
    }

    // Additional method for testing, if needed
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "hello";
        String s2 = "zaz";

        // Print the scores for testing purposes
        System.out.println("Score of '" + s1 + "': " + solution.scoreOfString(s1)); 
        System.out.println("Score of '" + s2 + "': " + solution.scoreOfString(s2));
    }
}