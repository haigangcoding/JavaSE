// float 胆精度浮点型 （32 bit， 4 字节）
// double 双精度浮点型 （64 bit， 8 字节）
//public class Float {
//    public static void main(String[] args) {
//        double d = 15;
//        System.out.println(d);
//    }
//}


// float 类型的精度不如 double 如果直接给一个 double类型的值，会直接报错
//public class Float {
//    public static void main(String[] args) {
//        float f = 9.9F; // 这样就可以正常编译通过
//    }
//}

//由于 double 精度更大，所以直接接收 float 类型的值
public class Float {
    public static void main(String[] args) {
        float f = 9.9F;
        double a = f; // 隐式类型转换为 double 值
        System.out.println(a);
        // 9.899999618530273 精度问题
    }
}


