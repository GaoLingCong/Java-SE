public class 方法的入门基础 {

/*  方法的定义    public static void +方法名称（）{
方法体
     }
    调用格式 方法名称（）

    注意事项
    1.方法顺序无所谓
    2.方法的定义必须挨着，不能一个方法内部定义
    3.方法定义后不能执行，要调用后才可以执行
    * */
    public static void main(String[] args) {
     循环();
    }

 public static void 循环()
    {
        for (int j = 0; j < 5; j++) {
            for (int i1 = 0; i1 < 20; i1++) {

                System.out.print("*");
            }
            System.out.println();

        }
    }
}


