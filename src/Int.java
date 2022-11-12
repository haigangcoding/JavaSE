// 在 java 中， 整数类型包括以下几个：
// byte 字节型（8个 bit, 也就是 1 个字节）范围 ： -128 ~ +127
// short 短整型（16个 bit, 也就是 2 个字节）范围： -32768 ~ +32767
// int 整形（32 个 bit， 也就是 4 个字节）最常用的类型 -2147483648 ~ +2147483647
// long 长整型（64 个 bit， 也就是 8 个字节 ）范围：

//public class Int {
//    public static void main(String[] args) {
//        long l =2371289371298317L;
//        System.out.println(l);
//    }
//}

// 用 8 进制 或者 16 进制表示一个常量值
//public class Int {
//    public static void main(String[] args) {
//        System.out.println(0xAF);
//        System.out.println(012);
//    }
//}

public class Int {
    public static void main(String[] args) {
        int a = 2147483647; // int 最大值
        a = a + 1; // 继续加
        System.out.println(a);
//        -2147483648
    }
}

