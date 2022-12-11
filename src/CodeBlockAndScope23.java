public class CodeBlockAndScope23 {
    public static void main(String[] args) {
        int a = 10; // 此时变量在最外层定义
        {
            System.out.println(a); //处于其作用域内部的代码块可以使用
        }
        System.out.println(a); // 这里肯定也可以使用
    }
}
