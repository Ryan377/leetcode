package leetcode.editor.cn;

//输入一个字符串，打印出该字符串中字符的所有排列。 
//
// 
//
// 你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。 
//
// 
//
// 示例: 
//
// 输入：s = "abc"
//输出：["abc","acb","bac","bca","cab","cba"]
// 
//
// 
//
// 限制： 
//
// 1 <= s 的长度 <= 8 
// Related Topics 回溯算法 
// 👍 224 👎 0

import java.util.ArrayList;
import java.util.Arrays;

public class ZiFuChuanDePaiLieLcof{
        public static void main(String[] args) {
                 Solution solution = new ZiFuChuanDePaiLieLcof().new Solution();

         }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private ArrayList<String> res = new ArrayList<>();

    public String[] permutation(String s) {
        if ( s.length() == 0)
            return res.toArray(new String[0]);
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        backtracking(chars, new boolean[chars.length], new StringBuilder());
        return res.toArray(new String[0]);

    }

    private void backtracking(char[] chars, boolean[] hasused, StringBuilder s) {
        if (s.length() == chars.length) {
            res.add(s.toString());
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            if (hasused[i]) {
                continue;
            }
            if (i != 0 && chars[i] == chars[i - 1] && !hasused[i - 1]) {
                continue;
            }
            hasused[i] = true;
            s.append(chars[i]);
            backtracking(chars, hasused, s);
            s.deleteCharAt(s.length() - 1);
            hasused[i] = false;
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}