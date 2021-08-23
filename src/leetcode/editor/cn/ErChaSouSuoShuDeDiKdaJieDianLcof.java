package leetcode.editor.cn;

//给定一棵二叉搜索树，请找出其中第k大的节点。 
//
// 
//
// 示例 1: 
//
// 输入: root = [3,1,4,null,2], k = 1
//   3
//  / \
// 1   4
//  \
//   2
//输出: 4 
//
// 示例 2: 
//
// 输入: root = [5,3,6,2,4,null,null,1], k = 3
//       5
//      / \
//     3   6
//    / \
//   2   4
//  /
// 1
//输出: 4 
//
// 
//
// 限制： 
//
// 1 ≤ k ≤ 二叉搜索树元素个数 
// Related Topics 树 
// 👍 137 👎 0

import leetcode.editor.cn.entity.TreeNode;

import java.util.ArrayList;

public class ErChaSouSuoShuDeDiKdaJieDianLcof{
        public static void main(String[] args) {
                 Solution solution = new ErChaSouSuoShuDeDiKdaJieDianLcof().new Solution();

         }

//leetcode submit region begin(Prohibit modification and deletion)
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
    private ArrayList<Integer> ret = new ArrayList<>();
    public int kthLargest(TreeNode root, int k) {
        inorder(root, k);
        return ret.get(ret.size() - k);
    }

    private void inorder(TreeNode root, int k) {
        if (root == null)
            return;


        inorder(root.left, k);
        ret.add(root.val);
        inorder(root.right, k);

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}