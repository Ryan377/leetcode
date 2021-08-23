package leetcode.editor.cn;

//统计一个数字在排序数组中出现的次数。 
//
// 
//
// 示例 1: 
//
// 输入: nums = [5,7,7,8,8,10], target = 8
//输出: 2 
//
// 示例 2: 
//
// 输入: nums = [5,7,7,8,8,10], target = 6
//输出: 0 
//
// 
//
// 限制： 
//
// 0 <= 数组长度 <= 50000 
//
// 
//
// 注意：本题与主站 34 题相同（仅返回值不同）：https://leetcode-cn.com/problems/find-first-and-last-
//position-of-element-in-sorted-array/ 
// Related Topics 数组 二分查找 
// 👍 109 👎 0

public class ZaiPaiXuShuZuZhongChaZhaoShuZiLcof{
        public static void main(String[] args) {
                 Solution solution = new ZaiPaiXuShuZuZhongChaZhaoShuZiLcof().new Solution();

         }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return 0;
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                cnt++;
            else if (nums[i] > target)
                break;
        }
        return cnt;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}