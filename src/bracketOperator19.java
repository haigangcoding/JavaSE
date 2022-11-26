public class bracketOperator19 {
    public static void main(String[] args) {
        int a = 10;
        int b = (a + 8) * (-a + 10);
    /*
    1. 括号的优先级算式最高的，我们需要先计算括号中的内容，如果存在多个括号，就从左往右计算
    2.首先是 a = 8 计算完成之后  a 变成 8， 并且运算结果也为 8
    3. 然后是后面的加法， -a 就是 -8，加上 10 就是 2
    4. 最后才是 乘法，左边此时是 8 右边是 2 最后结果为16
     */
        System.out.println(b);
    }
}
