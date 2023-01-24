public class SelectStructure25 {
    // 通过一个 if 语句进行条件判断，
    // 然后根据对应的条件，来执行不同的逻辑
    // 可以使用 switch 语句来实现，更加 适用于多分支的情况

    // switch (目标) { // 我们需要传入一个目标，比如变量，或是计算表达式等
        // case 匹配值： // 如果目标的值等于我们这里匹配值，那么就执行 case 后面的代码
        // 代码 ...
        // break;   // 代码执行结束后需要使用 break 来结束，否则会溜到下一个 case 继续执行代码
    // }


    // 我们要根据学生的等级进行分班， 学生有 ABC 三个等级：
//    public static void main(String[] args) {
//        char c = 'A';
//        switch (c) {    // 这里目标就是变量 C
//            case 'A':   // 分别指定 ABC 三个匹配值，并且执行不同的代码
//                System.out.println("去尖子班！准备冲刺 985 大学");
//                break;  // 执行完之后一定记得 break 否则会继续执行下一个 case 的代码
//            case 'B':
//                System.out.println("去平行班！准备冲刺一本！");
//                break;
//            case 'C':
//                System.out.println("去职高深造");
//                break;
//        }
//    }

        public static void main(String[] args) {
            int score = 100;
            switch (score / 10) {
                case 10:
                case 9:
                    if(score == 100)
                        System.out.println("表扬！");
                    System.out.println("优秀");
                    break;
                case 8:
                case 7:
                    System.out.println("良好");
                    break;
                case 6:
                    System.out.println("及格");
                    break;
                default:
                    System.out.println("不及格");
            }
        }

}
