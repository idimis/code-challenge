class Solution {
    public String defangIPaddr(String address) {
        // Use the replace method to replace '.' with '[.]'
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        // Example 1
        String address1 = "1.1.1.1";
        System.out.println("Input: " + address1);
        System.out.println("Output: " + new Solution().defangIPaddr(address1));
        
        // Example 2
        String address2 = "255.100.50.0";
        System.out.println("Input: " + address2);
        System.out.println("Output: " + new Solution().defangIPaddr(address2));
    }
}
