package leetcode.editor.cn;

//输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。 
//
// 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。 
//
// 
//
// 示例 1： 
//
// 输入：target = 9
//输出：[[2,3,4],[4,5]]
// 
//
// 示例 2： 
//
// 输入：target = 15
//输出：[[1,2,3,4,5],[4,5,6],[7,8]]
// 
//
// 
//
// 限制： 
//
// 
// 1 <= target <= 10^5 
// 
//
// 
// 👍 236 👎 0

import java.util.ArrayList;

public class HeWeiSdeLianXuZhengShuXuLieLcof{
        public static void main(String[] args) {
                 Solution solution = new HeWeiSdeLianXuZhengShuXuLieLcof().new Solution();

         }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] findContinuousSequence(int target) {
        int start = 1;
        int end = 2;
        int cursum = 3;
        ArrayList<int[]> res = new ArrayList<>();
        while (end < target) {

            if (cursum == target) {
                int[] temp = new int[end - start + 1];
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = i + start;
                }
                res.add(temp);
                cursum = cursum - start;
                start++;
                end++;
                cursum = cursum + end;
            } else if (cursum < target) {
                end++;
                cursum = cursum + end;
            } else {
                cursum = cursum - start;
                start++;
            }

        }
        int[][] ret = new int[res.size()][];
        for (int i = 0; i < res.size(); i++) {
            ret[i] = res.get(i);
        }
        return ret;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}