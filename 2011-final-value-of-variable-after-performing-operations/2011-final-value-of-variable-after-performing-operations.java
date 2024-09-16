class Solution {
    // Make this method static so it can be called from the static main method
    public static int finalValueAfterOperations(String[] operations) {
        // Initialize X to 0
        int X = 0;
        
        // Iterate through each operation
        for (String operation : operations) {
            if (operation.equals("++X") || operation.equals("X++")) {
                // Increment X for ++X and X++
                X++;
            } else if (operation.equals("--X") || operation.equals("X--")) {
                // Decrement X for --X and X--
                X--;
            }
        }
        
        return X;
    }
    
    public static void main(String[] args) {
        // Example 1
        String[] operations1 = {"--X", "X++", "X++"};
        System.out.println(finalValueAfterOperations(operations1));  // Output: 1
        
        // Example 2
        String[] operations2 = {"++X", "++X", "X++"};
        System.out.println(finalValueAfterOperations(operations2));  // Output: 3
        
        // Example 3
        String[] operations3 = {"X++", "++X", "--X", "X--"};
        System.out.println(finalValueAfterOperations(operations3));  // Output: 0
    }
}
