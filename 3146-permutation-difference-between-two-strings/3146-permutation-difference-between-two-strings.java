import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findPermutationDifference(String s, String t) {
        // Step 1: Create a map to store the index of each character in s
        Map<Character, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            indexMap.put(s.charAt(i), i);
        }
        
        // Step 2: Compute the permutation difference
        int differenceSum = 0;
        for (int i = 0; i < t.length(); i++) {
            char charInT = t.charAt(i);
            int indexInS = indexMap.get(charInT);
            differenceSum += Math.abs(indexInS - i);
        }
        
        return differenceSum;
    }
}
