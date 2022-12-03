public class selfIncreasingAndselfDecreasingOperator19 {
    public static void main(String[] args) {
        int a = 8;
//        a++;    // 自增运算符就是两个加号连在一起，效果跟上面一样的，a 都会自增 1
//        a--;    // 自减少

//          ++a; // 自增运算符在前在后 最终效果都是让 a 自增 1， 是一样的  输出为 9

//        int b = a++; // 先出结果，再自增  为 8
//        int b = ++a; // 先自增，再出结果 为 9
//        System.out.println(b);
//        System.out.println(a);
        int b = -a++ + ++a;
        // 前面的 a 因为是正负号和自增是 同一个优先级，结合性是从右往左，所以说先计算 a++
        // a++ 的结果还是 8 然后是负号，得到 -8
        // 接着是后面的 a 因为此时 a 已经经过前面变成 9 所以说 ++a 就是先自增 再得到 10
        // 最后得到的结果 为 -8 + 10 = 2
        System.out.println(b);
    }
}
