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
    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }

    private int dfs(TreeNode node, int maxsoFar){

        if(node == null) return 0;

        int count = 0;

        if(node.val >= maxsoFar){
            count = 1;
        }

        maxsoFar = Math.max(node.val, maxsoFar);

        int leftGoodNodes = dfs(node.left, maxsoFar);
        int rightGoodNodes = dfs(node.right, maxsoFar);

        count = count + leftGoodNodes + rightGoodNodes;

        return count;
    }
}
