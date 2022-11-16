public class arithmeticOperator {
    public static void main(String[] args) {
        int a = 10;
        short b = 20;
        int c = a + b;
        // 30
        // 不同类型 的整数 一起运算，小类型需要转换为 大类型， short  byte  char
        // 一律转换 为 int 再进行计算（ 无论算式 有无 int ，都需要转换）
        //  结果也是 int; 如果 算式出现了 long 类型，那么都需要 转换到 long 类型
        // 再进行计算，也是 long 反正就是 依照 大的来
        System.out.println(c);
    }
}
