package leetcode.editor.cn;

//从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。 
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
//  [9,20],
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
//
// 注意：本题与主站 102 题相同：https://leetcode-cn.com/problems/binary-tree-level-order-tra
//versal/ 
// Related Topics 树 广度优先搜索 
// 👍 93 👎 0

import leetcode.editor.cn.entity.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class CongShangDaoXiaDaYinErChaShuIiLcof{
        public static void main(String[] args) {
                 Solution solution = new CongShangDaoXiaDaYinErChaShuIiLcof().new Solution();

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
            if (!t.isEmpty())
                ret.add(t);
        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}