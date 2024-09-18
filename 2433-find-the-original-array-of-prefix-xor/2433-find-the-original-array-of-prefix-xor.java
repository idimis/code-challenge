class Solution {
    public int[] findArray(int[] pref) {
        // Initialize an array to store the result
        int[] arr = new int[pref.length];
        
        // arr[0] is the same as pref[0]
        arr[0] = pref[0];
        
        // Calculate the rest of the arr elements
        for (int i = 1; i < pref.length; i++) {
            arr[i] = pref[i] ^ pref[i - 1];  // XOR current and previous pref elements
        }
        
        // Return the resulting arr
        return arr;
    }
}
