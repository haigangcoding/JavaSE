public class SelectStructure24 {
    public static void main(String[] args) {
        //只有当 a 判断等于 15 时，才会执行下面打印语句
//        int a = 15;
//        if( a == 15) // 只有当 a 判断等于 15 时，才会执行下面的打印语句
//            System.out.println("hello world");
//        System.out.println("我是外层"); // if 只会紧跟一行代码生效，后续内容无效


        // 使用 if 时，如果分支有多行代码需要执行，就需要添加花括号
//        int a = 15;
//        if(a > 10) {  //只有当 a 判断等于 15 时，才会执行下面的代码块
//            System.out.println("a 大于 10");
//            System.out.println("a 的值为：" + a);
//        }
//        System.out.println("我是外层");


        // 希望判断条件为真时执行某些代码，条件为假时执行另一些代码，
        // 我们可以在后面继续 else 语句
//        int a = 15;
//        if(a > 10) {  // 只有判断成功时，才会执行下面的代码中的内容，否则直接跳过
//            System.out.println("a大于10");
//            System.out.println("a的值为：" + a);
//        } else { // 当判断不成功时，会执行else代码块中的代码
//            System.out.println("a大于10");
//            System.out.println("a的值为：" + a);
//        }
//        System.out.println("我是外层");
//        希望判断学生的成绩，不同分数段打印的等级不一样，
//        比如90 以上就是优秀， 70以上就是良好 60以上是及格
//        其他的都是不及格
        int score = 2;
        if(score >= 90)  // 90 分以上才是优秀
            System.out.println("优秀");
        else if (score >= 70) // 当上一级 if 判断失败时，会继续判断这一级
            System.out.println("良好");
        else if (score >= 60)
            System.out.println("及格");
        else // 当之前所有的 if 都判断失败时，才会进入到后的else语句中
            System.out.println("不及格");
    }
}

