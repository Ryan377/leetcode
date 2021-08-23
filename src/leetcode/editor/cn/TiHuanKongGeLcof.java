package leetcode.editor.cn;
//请实现一个函数，把字符串 s 中的每个空格替换成"%20"。 
//
// 
//
// 示例 1： 
//
// 输入：s = "We are happy."
//输出："We%20are%20happy." 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 10000 
// 👍 88 👎 0

public class TiHuanKongGeLcof{
        public static void main(String[] args) {
                 Solution solution = new TiHuanKongGeLcof().new Solution();

         }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String replaceSpace(String s) {
        StringBuffer str = new StringBuffer();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ')
                str.append("%20");
            else
                str.append(s.charAt(i));
        }
        return new String(str);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}