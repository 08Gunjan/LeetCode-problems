/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
       List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
            return ans;
        levelOrderH(root, ans);
        return ans;
    }
    public void levelOrderH(Node root, List<List<Integer>> ans) {
        Queue<Node> q =new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())  {
            List<Integer> currLvl = new ArrayList<>();
            int size = q.size();
            for(int i=0; i<size; i++)
            {
                Node front = q.remove();
                currLvl.add(front.val);
                q.addAll(front.children);
            }
            ans.add(currLvl);
        }
    }
}