package leetcode.editor.cn;

//输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。 
//
// 
//
// 例如，给出 
//
// 前序遍历 preorder = [3,9,20,15,7]
//中序遍历 inorder = [9,3,15,20,7] 
//
// 返回如下的二叉树： 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7 
//
// 
//
// 限制： 
//
// 0 <= 节点个数 <= 5000 
//
// 
//
// 注意：本题与主站 105 题重复：https://leetcode-cn.com/problems/construct-binary-tree-from-
//preorder-and-inorder-traversal/ 
// Related Topics 树 递归 
// 👍 374 👎 0

import leetcode.editor.cn.entity.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ZhongJianErChaShuLcof{
        public static void main(String[] args) {
                 Solution solution = new ZhongJianErChaShuLcof().new Solution();

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
    private Map<Integer, Integer> indexOfOrder = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            indexOfOrder.put(inorder[i], i);
        }
        return buildTree(preorder,0, preorder.length - 1,0);
    }

    public TreeNode buildTree(int[] preorder, int prel, int prer, int inl) {
        if (prel > prer) return null;
        TreeNode root = new TreeNode(preorder[prel]);
        int index = indexOfOrder.get(root.val);
        int leftsize = index - inl;
        root.left = buildTree(preorder, prel + 1, prel + leftsize, inl);
        root.right = buildTree(preorder, prel + leftsize + 1, prer, inl + leftsize + 1);
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}