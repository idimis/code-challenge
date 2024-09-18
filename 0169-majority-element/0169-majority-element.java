class Solution {
    
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int n = nums.length;
        
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > n / 2) {
                return num;
            }
        }
        throw new IllegalArgumentException("No majority element found");
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 3};
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        
        System.out.println("Majority element in nums1: " + majorityElement(nums1));
        System.out.println("Majority element in nums2: " + majorityElement(nums2));
    }
}