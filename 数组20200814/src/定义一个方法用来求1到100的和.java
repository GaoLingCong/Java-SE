public class 定义一个方法用来求1到100的和 {


    public static void main(String[] args) {
        int D = sum();
        System.out.println("结果为"+D);

    }
    public  static  int sum()
    {
        int B = 0;
        for (int i = 0; i < 100; i++) {

            B = B+i;

        }
      return B;

    }
}
