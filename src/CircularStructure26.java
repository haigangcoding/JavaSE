public class CircularStructure26 {
    // for(表达式 1; 表达式 2; 表达式 3 ;)
    // 表达式 1 : 在循环开始时仅执行一次
    // 表达式 2 : 每次循环开始前会执行一次，要求为判断语句，用于判断是否判断语句
    //           用于判断是否可以结束循环，结果为真，那么继续循环，否则结束循环
    // 表达式 3 : 每次循环完成后会执行一次
    // 循环体 : 每次循环都会执行一次循环体
    public static void main(String[] args) {
        // 这里我们在 for 语句中定义一个变量 i ，然后每一轮 i 都会自增，直到变成 3 为止
        for (int i = 0; i < 3; i++)

            // 这样就会执行三轮循环，每轮循环都会执行紧跟着 这一句 打印
            System.out.println("!!!!!!!!!!!!!!!!");
    }
}
