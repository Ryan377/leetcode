package leetcode.editor.cn;

//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
//输出：6
//解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [1]
//输出：1
// 
//
// 示例 3： 
//
// 
//输入：nums = [0]
//输出：0
// 
//
// 示例 4： 
//
// 
//输入：nums = [-1]
//输出：-1
// 
//
// 示例 5： 
//
// 
//输入：nums = [-100000]
//输出：-100000
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 3 * 10⁴ 
// -10⁵ <= nums[i] <= 10⁵ 
// 
//
// 
//
// 进阶：如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的 分治法 求解。 
// Related Topics 数组 分治 动态规划 👍 3601 👎 0

public class MaximumSubarray{
        public static void main(String[] args) {
                 Solution solution = new MaximumSubarray().new Solution();

         }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int N = nums.length;
        if (N == 1)
            return nums[0];
        int[] dp = new int[N + 1]; //dp[i]表示以第i个元素结尾的最大连续和
        dp[0] = 0;
        int res = nums[0];
        for (int i = 0; i < N; i++) {
            dp[i + 1] = Math.max(dp[i] + nums[i], nums[i]);
            res = Math.max(res, dp[i + 1]);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}