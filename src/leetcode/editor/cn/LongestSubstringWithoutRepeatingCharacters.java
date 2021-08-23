package leetcode.editor.cn;

//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 
//输入: s = "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 
//输入: s = "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
//
// 示例 4: 
//
// 
//输入: s = ""
//输出: 0
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 5 * 104 
// s 由英文字母、数字、符号和空格组成 
// 
// Related Topics 哈希表 双指针 字符串 Sliding Window 
// 👍 5287 👎 0

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters{
        public static void main(String[] args) {
                 Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();

         }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        // 哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();

        int end = -1;
        int ans = 0;
        for (int start = 0; start < n; start++) {
            if (start != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(start - 1));
            }
            // 先试探右指针能不能右移，能就右移
            while (end + 1 < n && !occ.contains(s.charAt(end + 1))) {
                occ.add(s.charAt(end + 1));
                end++;
            }
            ans = Math.max(ans, end - start + 1);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}