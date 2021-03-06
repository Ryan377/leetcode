package leetcode.editor.cn;

//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重
//复的三元组。 
//
// 注意：答案中不可以包含重复的三元组。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-1,0,1,2,-1,-4]
//输出：[[-1,-1,2],[-1,0,1]]
// 
//
// 示例 2： 
//
// 
//输入：nums = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：nums = [0]
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 3000 
// -105 <= nums[i] <= 105 
// 
// Related Topics 数组 双指针 排序 
// 👍 3653 👎 0

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum{
        public static void main(String[] args) {
                 Solution solution = new ThreeSum().new Solution();

         }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(nums);
        if (nums.length < 3)
            return res;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                break;
            } else if (i == 0 || nums[i] != nums[i - 1]) {
                int j = i + 1;
                int k = nums.length - 1;
                while (j < k) {
                    if (nums[j] + nums[k] + nums[i] > 0) {
                        k--;
                    } else if (nums[i] + nums[j] + nums[k] < 0) {
                        j++;
                    } else {
                        List<Integer> aRes = new LinkedList<>();
                        aRes.add(nums[i]);
                        aRes.add(nums[j]);
                        aRes.add(nums[k]);
                        res.add(aRes);

                        while (j < k && nums[j + 1] == nums[j]) {
                            j++;
                        }
                        while (j < k && nums[k - 1] == nums[k]) {
                            k--;
                        }
                        j++;
                        k--;
                    }
                }

            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}