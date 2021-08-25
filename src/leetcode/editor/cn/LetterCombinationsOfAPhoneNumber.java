package leetcode.editor.cn;

//给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。 
//
// 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。 
//
// 
//
// 
//
// 示例 1： 
//
// 
//输入：digits = "23"
//输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
// 
//
// 示例 2： 
//
// 
//输入：digits = ""
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：digits = "2"
//输出：["a","b","c"]
// 
//
// 
//
// 提示： 
//
// 
// 0 <= digits.length <= 4 
// digits[i] 是范围 ['2', '9'] 的一个数字。 
// 
// Related Topics 哈希表 字符串 回溯 👍 1461 👎 0

import java.util.*;

public class LetterCombinationsOfAPhoneNumber{
        public static void main(String[] args) {
                 Solution solution = new LetterCombinationsOfAPhoneNumber().new Solution();

         }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new LinkedList<>();
        if (null == digits || digits.length() == 0)
            return res;
        Map<Character, List<String>> ref = new HashMap<>();
        ref.put('2', Arrays.asList("a","b","c"));
        ref.put('3', Arrays.asList("d","e","f"));
        ref.put('4', Arrays.asList("g","h","i"));
        ref.put('5', Arrays.asList("j","k","l"));
        ref.put('6', Arrays.asList("m","n","o"));
        ref.put('7', Arrays.asList("p","q","r","s"));
        ref.put('8', Arrays.asList("t","u","v"));
        ref.put('9', Arrays.asList("w","x","y","z"));

        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < digits.length(); i++) {
            process(queue, ref.get(digits.charAt(i)));
        }

        res.addAll(queue);

        return res;
    }

    private void process(Queue<String> queue, List<String> letters) {
        if (queue.isEmpty()) {
            queue.addAll(letters);
        } else {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String s = queue.poll();
                for (String letter : letters) {
                    queue.add(s + letter);
                }
            }
        }
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}