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
    public List<Integer> postorderTraversal(TreeNode root) {
         
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode curr = root;
        TreeNode lastVisited = null;

        while(curr != null || !stack.isEmpty()){

            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }

            TreeNode node = stack.peek();

            if(node.right != null && lastVisited != node.right){
                curr = node.right;
            }else{
                res.add(node.val);
                lastVisited = stack.pop();
            }
        }
        return res;
    }
}