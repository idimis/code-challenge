class Solution {
    // Method to check if a string is a palindrome
    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to convert a number to a given base and return it as a string
    private String toBase(int number, int base) {
        if (number == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (number > 0) {
            int digit = number % base;
            sb.append(digit);
            number /= base;
        }
        return sb.reverse().toString();
    }

    public boolean isStrictlyPalindromic(int n) {
        // Handle edge cases where n is less than or equal to 2
        if (n <= 2) {
            return false;
        }

        // Check palindromic property for each base b from 2 to n-2
        for (int b = 2; b <= n - 2; b++) {
            String representation = toBase(n, b);
            if (!isPalindrome(representation)) {
                return false;
            }
        }

        // If all representations are palindromic
        return true;
    }
}
