public class Solution {
    
    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();
        
        // Example inputs
        int n1 = 10, m1 = 3;
        int n2 = 5, m2 = 6;
        int n3 = 5, m3 = 1;
        
        // Print results for each example
        System.out.println(solution.differenceOfSums(n1, m1)); // Output: 19
        System.out.println(solution.differenceOfSums(n2, m2)); // Output: 15
        System.out.println(solution.differenceOfSums(n3, m3)); // Output: -15
    }

    public int differenceOfSums(int n, int m) {
        // Initialize variables to store the sums
        int sumNotDivisibleByM = 0;
        int sumDivisibleByM = 0;
        
        // Iterate through the range [1, n]
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                // Number is divisible by m
                sumDivisibleByM += i;
            } else {
                // Number is not divisible by m
                sumNotDivisibleByM += i;
            }
        }
        
        // Calculate the difference
        return sumNotDivisibleByM - sumDivisibleByM;
    }
}
