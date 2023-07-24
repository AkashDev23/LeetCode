/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    // First we will check that the node is null or not
    // if both Q,P are smaller then ROOT then it will be in left.
    // if both q,p are grater then root then it will be in right.
    // if not the current root is the answer!
    // This will solve our question in O(Log N) Time complexity
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(root.val>p.val && root.val>q.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        else if (root.val<p.val && root.val<q.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
}