package leetcode.editor.cn;

//在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。 
//
// 示例: 
//
// s = "abaccdeff"
//返回 "b"
//
//s = "" 
//返回 " "
// 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 50000 
// Related Topics 哈希表 
// 👍 81 👎 0

import java.util.HashMap;
import java.util.Map;

public class DiYiGeZhiChuXianYiCiDeZiFuLcof{
        public static void main(String[] args) {
                 Solution solution = new DiYiGeZhiChuXianYiCiDeZiFuLcof().new Solution();

         }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public char firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
        }
        for (int i = 0; i < chars.length; i++) {
            if ( map.get(chars[i]) == 1 )
                return chars[i];
        }
        return ' ';
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}