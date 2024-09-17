class Solution {
    // Method to shuffle the array
    public int[] shuffle(int[] nums, int n) {
        // Create an array to store the result
        int[] result = new int[2 * n];
        
        // Fill the result array with interleaved elements from nums
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];       // x1, x2, ..., xn
            result[2 * i + 1] = nums[n + i]; // y1, y2, ..., yn
        }
        
        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example test cases
        int[] nums1 = {2, 5, 1, 3, 4, 7};
        int n1 = 3;
        int[] result1 = solution.shuffle(nums1, n1);
        System.out.println(java.util.Arrays.toString(result1)); // Output: [2, 3, 5, 4, 1, 7]

        int[] nums2 = {1, 2, 3, 4, 4, 3, 2, 1};
        int n2 = 4;
        int[] result2 = solution.shuffle(nums2, n2);
        System.out.println(java.util.Arrays.toString(result2)); // Output: [1, 4, 2, 3, 3, 2, 4, 1]

        int[] nums3 = {1, 1, 2, 2};
        int n3 = 2;
        int[] result3 = solution.shuffle(nums3, n3);
        System.out.println(java.util.Arrays.toString(result3)); // Output: [1, 2, 1, 2]
    }
}
