package leetcode.editor.cn;

//地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一
//格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但
//它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？ 
//
// 
//
// 示例 1： 
//
// 输入：m = 2, n = 3, k = 1
//输出：3
// 
//
// 示例 2： 
//
// 输入：m = 3, n = 1, k = 0
//输出：1
// 
//
// 提示： 
//
// 
// 1 <= n,m <= 100 
// 0 <= k <= 20 
// 
// 👍 253 👎 0

public class JiQiRenDeYunDongFanWeiLcof{
        public static void main(String[] args) {
                 Solution solution = new JiQiRenDeYunDongFanWeiLcof().new Solution();

         }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        private final int next[][] = {{0,1},{1,0},{0,-1},{-1,0}};
        private int count = 0;


        public int movingCount(int m, int n, int k) {
            boolean[][] marked = new boolean[m][n];
            backtracking( m, n, k, marked, 0, 0);
            return count;

        }

        private void backtracking(int m, int n, int k, boolean[][] marked, int i, int j) {
            if ( i < 0 || i >= m || j < 0 || j >= n || marked[i][j]) return;

            marked[i][j] = true;

            if ( sum(i, j) > k ) return;

            count++;

            for (int[] dir : next) {
                backtracking(m, n, k, marked, i + dir[0], j + dir[1]);
            }
        }

        private int sum(int i, int j) {
            return (i/10 + i%10) + (j/10 + j%10);
        }
}
//leetcode submit region end(Prohibit modification and deletion)

}