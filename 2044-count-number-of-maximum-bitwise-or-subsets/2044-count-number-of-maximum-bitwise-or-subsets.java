class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxOr = 0, count = 0;
        for (int num : nums) maxOr |= num;
        return dfs(nums, 0, 0, maxOr);
    }

    private int dfs(int[] nums, int index, int currentOr, int maxOr) {
        if (index == nums.length) return currentOr == maxOr ? 1 : 0;
        return dfs(nums, index + 1, currentOr | nums[index], maxOr) + 
               dfs(nums, index + 1, currentOr, maxOr);
    }
}
