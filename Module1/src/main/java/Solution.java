import java.util.*;
import java.util.regex.Pattern;

/**
 * @program: LeetCode
 * @description:
 * @author: DUZENG
 * @create: 2020-07-13 20:19
 **/
public class Solution {
    private static Pattern p = Pattern.compile("");

    public int countEval(String s, int result) {
        String[] charArr = s.split("");
        Arrays.stream(charArr).forEach(item -> System.out.println(item));
        return 2;
    }

    /**
     * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
     * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
     * 你可以假设除了整数 0 之外，这个整数不会以零开头。
     *
     * 示例 1:
     *
     * 输入: [1,2,3]
     * 输出: [1,2,4]
     * 解释: 输入数组表示数字 123。
     * 示例 2:
     *
     * 输入: [4,3,2,1]
     * 输出: [4,3,2,2]
     * 解释: 输入数组表示数字 4321。
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {
        int result = 0;
        for (int i = 0; i <= digits.length - 1; i++) {
            result += digits[i] * Math.pow(10, digits.length - 1 - i);
        }
        result++;
        Deque<Integer> stack = new LinkedList<>();
        while (result > 0) {
            int remainder = result % 10;
            stack.push(remainder);
            result = result / 10;
        }

        List<Integer> output = new LinkedList<>();
        while (!stack.isEmpty()) {
            output.add(stack.pop());
        }
        Integer[] intArr = output.toArray(new Integer[output.size()]);
        int[] results = new int[intArr.length];
        for (int i = 0; i <= intArr.length - 1; i++) {
            results[i] = intArr[i].intValue();
        }
        return results;
    }
}