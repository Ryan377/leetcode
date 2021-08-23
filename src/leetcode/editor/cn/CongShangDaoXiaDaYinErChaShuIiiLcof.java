package leetcode.editor.cn;

//请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。 
//
// 
//
// 例如: 
//给定二叉树: [3,9,20,null,null,15,7], 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
// 
//
// 返回其层次遍历结果： 
//
// [
//  [3],
//  [20,9],
//  [15,7]
//]
// 
//
// 
//
// 提示： 
//
// 
// 节点总数 <= 1000 
// 
// Related Topics 树 广度优先搜索 
// 👍 87 👎 0

import leetcode.editor.cn.entity.TreeNode;

import java.util.*;

public class CongShangDaoXiaDaYinErChaShuIiiLcof{
        public static void main(String[] args) {
                 Solution solution = new CongShangDaoXiaDaYinErChaShuIiiLcof().new Solution();

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ret = new LinkedList<>();
        boolean flag = true;
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> t = new LinkedList<>();
            int cnt = queue.size();
            while ( cnt-- >0 ) {
                TreeNode temp = queue.poll();
                if (temp == null)
                    continue;
                t.add(temp.val);
                queue.add(temp.left);
                queue.add(temp.right);
            }
            if (!t.isEmpty()) {
                if (flag) {
                    ret.add(t);
                } else {
                    Collections.reverse(t);
                    ret.add(t);
                }
                flag = !flag;
            }
        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}