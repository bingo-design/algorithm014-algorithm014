package day2;

/**
 * @description: 删除最外层的括号 leetcode-1021
 */
public class RemoveOuterParentheses {

    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int opened = 0;
        for (char c : S.toCharArray()) {
            if (c == '(' && opened++ > 0) {
                sb.append(c);
            }
            if (c == ')' && opened-- > 1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
