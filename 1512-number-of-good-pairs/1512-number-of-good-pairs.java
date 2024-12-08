import java.util.HashMap;

public class Solution {

    public static int numIdenticalPairs(int[] nums) {
        
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int goodPairs = 0;

        
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        
        for (int count : freqMap.values()) {
            if (count > 1) {
                goodPairs += count * (count - 1) / 2;  // nC2 pairs
            }
        }

        return goodPairs;
    }

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {1, 2, 3, 1, 1, 3};
        int[] nums2 = {1, 1, 1, 1};
        int[] nums3 = {1, 2, 3};

        // Call numIdenticalPairs and print results
        System.out.println("Good pairs in nums1: " + numIdenticalPairs(nums1));  
        System.out.println("Good pairs in nums2: " + numIdenticalPairs(nums2));  
        System.out.println("Good pairs in nums3: " + numIdenticalPairs(nums3));  
    }
}
