class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // Initialize a counter to keep track of jewels in stones
        int count = 0;
        
        // Loop through each stone
        for (char stone : stones.toCharArray()) {
            // Check if the stone is a jewel by seeing if it exists in the jewels string
            if (jewels.indexOf(stone) != -1) {
                count++; // Increment the count if it is a jewel
            }
        }
        
        // Return the total count of jewels found in stones
        return count;
    }
}
