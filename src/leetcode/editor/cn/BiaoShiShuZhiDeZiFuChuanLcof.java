package leetcode.editor.cn;

//请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。例如，字符串"+100"、"5e2"、"-123"、"3.1416"、"-1E-16"、"012
//3"都表示数值，但"12e"、"1a3.14"、"1.2.3"、"+-5"及"12e+5.4"都不是。 
//
// 
// Related Topics 数学 
// 👍 169 👎 0

public class BiaoShiShuZhiDeZiFuChuanLcof{
        public static void main(String[] args) {
                 Solution solution = new BiaoShiShuZhiDeZiFuChuanLcof().new Solution();

         }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isNumber(String s) {
        if (s == null || s.length() == 0)
            return false;
        return s.matches("\\s*[+-]?\\d+(\\.\\d*)?([eE][+-]?\\d+)?\\s*")
                || s.matches("\\s*[+-]?\\.\\d+([eE][+-]?\\d+)?\\s*");
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}