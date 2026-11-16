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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        helper(ans,root,0);
        return ans;
    }
    public void helper(List<Integer> ans, TreeNode root, int lvl){
        if(root == null) return;
        if(ans.size() == lvl){
            ans.add(root.val);
        }
        helper(ans,root.right,lvl+1);
        helper(ans,root.left,lvl+1);
    }

}