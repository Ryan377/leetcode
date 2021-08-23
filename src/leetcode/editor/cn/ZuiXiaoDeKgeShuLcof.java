package leetcode.editor.cn;

//输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。 
//
// 
//
// 示例 1： 
//
// 输入：arr = [3,2,1], k = 2
//输出：[1,2] 或者 [2,1]
// 
//
// 示例 2： 
//
// 输入：arr = [0,1,2,1], k = 1
//输出：[0] 
//
// 
//
// 限制： 
//
// 
// 0 <= k <= arr.length <= 10000 
// 0 <= arr[i] <= 10000 
// 
// Related Topics 堆 分治算法 
// 👍 219 👎 0

import java.util.Collection;
import java.util.PriorityQueue;

public class ZuiXiaoDeKgeShuLcof{
        public static void main(String[] args) {
                 Solution solution = new ZuiXiaoDeKgeShuLcof().new Solution();

         }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr == null)
            return  null;
        if ( k > arr.length || k <= 0)
            return new int[0];
        int[] ret = new int[k];
        PriorityQueue<Integer> maxheap = new PriorityQueue<Integer>((o1, o2) -> o2 - o1);
        for (int n : arr) {
            maxheap.add(n);
            if (maxheap.size() > k)
                maxheap.poll() ;
        }
        for (int i = 0; i < k && maxheap.size() > 0; i++) {
            ret[i] = maxheap.poll();
        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}