package leetcode.editor.cn;

//字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数
//将返回左旋转两位得到的结果"cdefgab"。 
//
// 
//
// 示例 1： 
//
// 输入: s = "abcdefg", k = 2
//输出: "cdefgab"
// 
//
// 示例 2： 
//
// 输入: s = "lrloseumgh", k = 6
//输出: "umghlrlose"
// 
//
// 
//
// 限制： 
//
// 
// 1 <= k < s.length <= 10000 
// 
// Related Topics 字符串 
// 👍 97 👎 0

public class ZuoXuanZhuanZiFuChuanLcof{
        public static void main(String[] args) {
                 Solution solution = new ZuoXuanZhuanZiFuChuanLcof().new Solution();

         }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseLeftWords(String s, int n) {
        if (n > s.length())
            return null;
        StringBuffer str = new StringBuffer(s);

        reverse(str, 0, n - 1);
        reverse(str, n, str.length() - 1);
        reverse(str, 0, str.length() - 1);
        return str.toString();
    }

    private void reverse(StringBuffer str, int start, int end) {
        if (end - start == 0)
            return;
        for (int i = start, j = end; i < j; i++, j--) {
            char temp = str.charAt(i);
            str.setCharAt(i, str.charAt(j));
            str.setCharAt(j, temp);
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}