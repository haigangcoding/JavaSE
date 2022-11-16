public class assignmentOperators {
    public static void main(String[] args) {
//        char c = 'A' + 2;
//        System.out.println(c);

        // 使用等号进行赋值计算
//        int a = 555;
//        System.out.println(a);


        // 当出现连续赋值运算符时，按照从右往左的顺序进行计算，首先 a = 777，
        // 计算完成后， a 的值就变成了 777 ，计算完成后，会得到计算结果
        // 赋值运算得计算结果就是赋的值本身，就像 1 + 1的结果 为 2 一样
        // a = 1 的结果 为 1
        // 此时继续进行赋值计算，那么 b 就是被赋值 为 a = 777的 计算结果，也就是 777 了
        // 所有连等可以 将 一串变量都赋值为 最右边的值
        int a;
        int b = a = 777;
        System.out.println(b);
        System.out.println(a);
    }
}
