class Solution {
    public int minPartitions(String n) {
        // Initialize the variable to keep track of the maximum digit
        int maxDigit = 0;

        // Iterate through each character in the string
        for (char c : n.toCharArray()) {
            // Convert the character to an integer digit
            int digit = c - '0';
            // Update maxDigit if the current digit is greater
            if (digit > maxDigit) {
                maxDigit = digit;
            }
        }

        // Return the maximum digit found
        return maxDigit;
    }
}
