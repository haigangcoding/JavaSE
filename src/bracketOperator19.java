public class bracketOperator19 {
//    public static void main(String[] args) {
//        int a = 10;
//        int b = (a + 8) * (-a + 10);
    /*
    1. 括号的优先级算式最高的，我们需要先计算括号中的内容，如果存在多个括号，就从左往右计算
    2.首先是 a = 8 计算完成之后  a 变成 8， 并且运算结果也为 8
    3. 然后是后面的加法， -a 就是 -8，加上 10 就是 2
    4. 最后才是 乘法，左边此时是 8 右边是 2 最后结果为16
     */
//        System.out.println(b);
// }

//        括号是可以嵌套的，这一点跟数字中也是一样的，一律使用小括号
//        在嵌套的情况下，会优先计算最内层中的算式：
//        public static void main(String[] args) {
//            int b = (2 + (3 + 1) * 3) * 2;
//
//            // 输出为 28
//            System.out.println(b);
//        }

         public static void main(String[] args) {
             int a = 8, b = 5;
             double c = (double) (a / b);
             System.out.println(c);
         }

}
