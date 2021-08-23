package leetcode.editor.cn;

//给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，其中 B[i] 的值是数组 A 中除了下标 i 以外的元素的积, 即 B[
//i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。 
//
// 
//
// 示例: 
//
// 
//输入: [1,2,3,4,5]
//输出: [120,60,40,30,24] 
//
// 
//
// 提示： 
//
// 
// 所有元素乘积之和不会溢出 32 位整数 
// a.length <= 100000 
// 
// 👍 96 👎 0

public class GouJianChengJiShuZuLcof{
        public static void main(String[] args) {
                 Solution solution = new GouJianChengJiShuZuLcof().new Solution();

         }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] constructArr(int[] A) {
        int n = A.length;
        int[] B = new int[n];
        for (int i = 0, product = 1; i < n; product *= A[i], i++)       /* 从左往右累乘 */
            B[i] = product;
        for (int i = n - 1, product = 1; i >= 0; product *= A[i], i--)  /* 从右往左累乘 */
            B[i] *= product;
        return B;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}