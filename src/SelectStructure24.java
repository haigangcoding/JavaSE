public class SelectStructure24 {
    public static void main(String[] args) {
        //只有当 a 判断等于 15 时，才会执行下面打印语句
//        int a = 15;
//        if( a == 15) // 只有当 a 判断等于 15 时，才会执行下面的打印语句
//            System.out.println("hello world");
//        System.out.println("我是外层"); // if 只会紧跟一行代码生效，后续内容无效


        // 使用 if 时，如果分支有多行代码需要执行，就需要添加花括号
        int a = 15;
        if(a > 10) {  //只有当 a 判断等于 15 时，才会执行下面的代码块
            System.out.println("a 大于 10");
            System.out.println("a 的值为：" + a);
        }
        System.out.println("我是外层");
    }
}
