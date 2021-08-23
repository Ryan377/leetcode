package leetcode.editor.cn;

//输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。 
//
// 
//
// 示例 1： 
//
// 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
//输出：[1,2,3,6,9,8,7,4,5]
// 
//
// 示例 2： 
//
// 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//输出：[1,2,3,4,8,12,11,10,9,5,6,7]
// 
//
// 
//
// 限制： 
//
// 
// 0 <= matrix.length <= 100 
// 0 <= matrix[i].length <= 100 
// 
//
// 注意：本题与主站 54 题相同：https://leetcode-cn.com/problems/spiral-matrix/ 
// Related Topics 数组 
// 👍 213 👎 0

public class ShunShiZhenDaYinJuZhenLcof{
        public static void main(String[] args) {
                 Solution solution = new ShunShiZhenDaYinJuZhenLcof().new Solution();

         }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if ( matrix.length == 0)
            return new int[0];

        int rows = matrix.length - 1;
        int cols = matrix[0].length - 1;

        int row = 0;
        int col = 0;
        int N = (rows + 1) * (cols + 1);
        int[] ret = new int[N];
        int index = 0;
        while (index < N) {

            for (int j = col; index < N && j <= cols; j++) {
                ret[index] = matrix[row][j];
                index++;
            }
            row++;

            for (int i = row; index < N && i <= rows; i++) {
                ret[index] = matrix[i][cols];
                index++;
            }
            cols--;


            for (int j = cols; index < N && j >= col; j--) {
                ret[index] = matrix[rows][j];
                index++;
            }
            rows--;



            for (int i = rows; index < N && i >= row; i--) {
                ret[index] = matrix[i][col];
                index++;
            }
            col++;



        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}