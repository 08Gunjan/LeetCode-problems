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
    static int maxLvl;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        maxLvl = 0;
        rH(root, 1, ans);
        return ans;
        
        
    }
    public void rH(TreeNode root, int lvl, List<Integer> ans)
    {
        if(root == null)
        {
            return;
        }
        if(maxLvl < lvl)
        {
            ans.add(root.val);
            maxLvl = lvl;
        }
        rH(root.right, lvl+1, ans);
        rH(root.left, lvl+1, ans);
        return;
    }
}