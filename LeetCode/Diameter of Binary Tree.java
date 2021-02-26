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
    class pair{
        int dia;
        int dep;
        pair(int dia, int dep)
        {
            this.dia = dia;
            this.dep = dep;
        }
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        pair ans = diameter(root);
        return ans.dia;
    }
    public pair diameter(TreeNode root) {
        if(root == null)
            return new pair(0,0);
        pair left = diameter(root.left);
        pair right = diameter(root.right);
        int khudKaDia = left.dep + right.dep;
        int khudKaDep = Math.max(left.dep , right.dep)+1;
        int maxDia = Math.max(khudKaDia, Math.max(left.dia, right.dia));
        return new pair(maxDia,khudKaDep);
    }
}