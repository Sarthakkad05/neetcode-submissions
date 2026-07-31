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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        preorder(root, sb);
        return sb.toString();
    }

    
    private void preorder(TreeNode root, StringBuilder sb){
        if(root == null){
            sb.append("N,");
            return;
        }

        sb.append(root.val).append(",");
        preorder(root.left,sb);
        preorder(root.right,sb);
    }

    // Decodes your encoded data to tree.
    int idx = 0;
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        idx = 0;
        return build(arr);
    }

    public TreeNode build(String[] arr){

        if(arr[idx].equals("N")){
            idx++;
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(arr[idx++]));

        node.left = build(arr);
        node.right = build(arr);

        return node;
    }
}
