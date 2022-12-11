/**
 * 逻辑运算符
 * && 与运算，要求两边同时为 true 才能返回 true
 * || 或运算，要求两边至少有一个为 true 才能 返回 true
 * !  非运算，一般放在表达式最前面，表达式用括号括起来
 */

public class RelationalAndLogicalOperators22 {
    public static void main(String[] args) {
//        int a = 8;
//        boolean c = 0 < a && a < 100;  // 与运算
//        System.out.println(c);

        int a = 10;

        // 三元运算符需要 三个内容，第一个是判断语句
        // 第二个满足判断语句的值，第三个是不满足判断语句的值
        // 判断语句 ？ 结果 1： 结果 2
        // 上面的判断为假 所以说返回的是 结果 2， 最后 b 得到的就是 B 这个字符
        char b = a > 10 ? 'A': 'B';
        System.out.println(b);
    }
}
