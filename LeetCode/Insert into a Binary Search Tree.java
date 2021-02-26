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
    TreeNode prev;
    TreeNode prev1;
    int flag=1;
    public TreeNode insertIntoBST(TreeNode root, int val)
    {
        if(root==null)
        {
            return new TreeNode(val);
        }
        else
        {
            x(root,val);
        }
        return root;
    }
    public void x(TreeNode root, int val)
    {
        if(root==null)
        {
            if(flag==1)
            {
                TreeNode q=new TreeNode(val);
                prev.right=q;
            }
            else
            {
                 TreeNode q=new TreeNode(val);
                prev.left=q;  
            }     
        }
        else if(root.val>val)
        {
            flag=0;
            prev=root;
            x(root.left,val);
        }
        else
        {
            flag=1;
            prev=root;
            x(root.right,val);
         }
    }
}