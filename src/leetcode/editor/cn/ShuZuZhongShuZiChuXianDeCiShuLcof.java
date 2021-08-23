package leetcode.editor.cn;

//一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [4,1,4,6]
//输出：[1,6] 或 [6,1]
// 
//
// 示例 2： 
//
// 输入：nums = [1,2,10,4,1,4,3,3]
//输出：[2,10] 或 [10,2] 
//
// 
//
// 限制： 
//
// 
// 2 <= nums.length <= 10000 
// 
//
// 
// 👍 352 👎 0

public class ShuZuZhongShuZiChuXianDeCiShuLcof{
        public static void main(String[] args) {
                 Solution solution = new ShuZuZhongShuZiChuXianDeCiShuLcof().new Solution();

         }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] singleNumbers(int[] nums) {
        int[] res = new int[2];
        int diff = 0;
        for (int num : nums)
            diff ^= num;
        diff &= -diff;
        for (int num : nums) {
            if ((num & diff) == 0)
                res[0] ^= num;
            else
                res[1] ^= num;
        }
        if (res[0] > res[1]) {
            swap(res);
        }
        return res;
    }

    private void swap(int[] nums) {
        int t = nums[0];
        nums[0] = nums[1];
        nums[1] = t;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}