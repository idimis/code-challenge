class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;  // Variable to store the maximum wealth found

        // Loop through each customer (each row in the 2D array)
        for (int i = 0; i < accounts.length; i++) {
            int currentWealth = 0;  // Variable to store the wealth of the current customer

            // Loop through each bank account for the current customer
            for (int j = 0; j < accounts[i].length; j++) {
                currentWealth += accounts[i][j];  // Sum the money in all bank accounts
            }

            // Update the maximum wealth if the current customer's wealth is greater
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }

        return maxWealth;  // Return the wealth of the richest customer
    }
}
