public class Solution {

    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};

        System.out.println(longestCommonPrefix(strs1)); // Output: "fl"
        System.out.println(longestCommonPrefix(strs2)); // Output: ""
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Find the minimum length string
        int minLength = Integer.MAX_VALUE;
        for (String str : strs) {
            minLength = Math.min(minLength, str.length());
        }

        // Check characters by index position
        for (int i = 0; i < minLength; i++) {
            char currentChar = strs[0].charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != currentChar) {
                    return strs[0].substring(0, i);
                }
            }
        }

        // If no mismatch was found, return the entire prefix
        return strs[0].substring(0, minLength);
    }
}