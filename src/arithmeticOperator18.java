public class arithmeticOperator18 {
    public static void main(String[] args) {
//        int a = 10;
//        short b = 20;
//        int c = a + b;
        // 30
        // 不同类型 的整数 一起运算，小类型需要转换为 大类型， short  byte  char
        // 一律转换 为 int 再进行计算（ 无论算式 有无 int ，都需要转换）
        //  结果也是 int; 如果 算式出现了 long 类型，那么都需要 转换到 long 类型
        // 再进行计算，也是 long 反正就是 依照 大的来
//        System.out.println(c);

//        int a = 10;

        // 减号作为 负号运算符在使用，会将右边紧跟的目标变成相反数
//        a = -a;

        // 得到 - 10
//        System.out.println(a);

//        String str1 = "Hello";
//        String str2 = "world";

// 拼接 字符串
//        String str3 = str1 + str2;

//        System.out.println(str3);


        // 整数与小数一起计算时，所有的整数都会变成小数参与运算，所以最后结果也是小数
//        double a = 8.0;
//        int b = 5;
//        System.out.println(a / b);  // 1.6

        // 希望两个整数需要进行计算，但是想得到一个小数的结果怎么办
//        int a = 8, b = 5;
//        double c = a; // 可以将 其先隐式转换为小数类型，再转换后小数变量去参与计算/
//        System.out.println( c / b );  // 同样可以得到正确的结果


        // 取余数
//      int a = 10;
//        System.out.println(a % 3);

        System.out.println(10 + 3 * 4);
    }

}
