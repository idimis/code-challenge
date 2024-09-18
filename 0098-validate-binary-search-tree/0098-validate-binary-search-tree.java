/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
     /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    // Helper function to validate BST properties with range constraints
    private boolean isValidBST(TreeNode node, long min, long max) {
        if (node == null) {
            return true; // An empty tree is a valid BST
        }
        
        // The current node's value must be within the valid range
        if (node.val <= min || node.val >= max) {
            return false;
        }
        
        // Recursively check the left and right subtrees with updated ranges
        return isValidBST(node.left, min, node.val) &&
               isValidBST(node.right, node.val, max);
    }
}
