public class CircularStructure27 {
    // 使用 break 和 continue 关键字能够更方便的控制循环，
    // 但在多重循环嵌套下，只对离它最近的循环生效（就近原则）
    public static void main(String[] args) {
        for(int i = 1;  i < 4; ++i ) {
            for(int j = 1; j < 4; ++j) {
                if(i == j) continue;    // 当 i == j 时加速循环
                System.out.println(i + ", " + j);
            }
        }
    }
}

