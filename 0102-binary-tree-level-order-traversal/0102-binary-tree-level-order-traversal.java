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
//     This code uses a breadth-first search (BFS) approach to traverse the binary tree level by level. It initializes a queue with the root node and enters a loop, processing nodes from the front of the queue. For each level, it adds the node values to a list, then enqueues their left and right children for the next level. The process continues until the queue is empty, and the list of lists containing node values at each level is returned as the final result.
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.peek();
                queue.remove();

                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
                level.add(node.val);
            }
            ans.add(level);
        }

        return ans;
    }
}