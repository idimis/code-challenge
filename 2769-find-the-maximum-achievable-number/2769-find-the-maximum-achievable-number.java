class Solution {
    // Renaming the method to match the test case
    public static int theMaximumAchievableX(int num, int t) {
        return num + 2 * t;
    }

    public static void main(String[] args) {
        // Example 1
        int num1 = 4, t1 = 1;
        System.out.println(theMaximumAchievableX(num1, t1));  // Output: 6

        // Example 2
        int num2 = 3, t2 = 2;
        System.out.println(theMaximumAchievableX(num2, t2));  // Output: 7
    }
}
