package leetcode.editor.cn;

//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。 
//
// 
//
// 示例： 
//
// 
//输入：nums = [1,2,3,4]
//输出：[1,3,2,4] 
//注：[3,1,2,4] 也是正确的答案之一。 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 50000 
// 1 <= nums[i] <= 10000 
// 
// 👍 102 👎 0

public class DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof{
        public static void main(String[] args) {
                 Solution solution = new DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof().new Solution();

         }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] exchange(int[] nums) {
        int n = nums.length;
        int[] new_nums = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 1)
                new_nums[index++] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0)
                new_nums[index++] = nums[i];
        }

        return new_nums;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}