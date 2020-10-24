import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Money M1 = new Money();
        Money M2 = new Money();
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个钱数A");
        M1.setA(sc.nextFloat());
        System.out.println("请输入第二个钱数B");
        M2.setA(sc.nextFloat());
        System.out.println("进行加法运算");
        double result1=M1.method1(M1.getA(),M2.getA());
        System.out.println(result1);

        System.out.println("进行减法运算");
        double result2=M1.method2(M1.getA(),M2.getA());
        System.out.println(result2);

        System.out.println("两个钱数比较大小结果为：");
        M1.method4(M1.getA(),M2.getA());


        System.out.println("请输入第一个钱数A要翻的倍数");
        double result3= M1.method3(sc.nextInt());
        System.out.println(result3);
        System.out.println("请输入第一个钱数B要翻的倍数");
        double result4= M2.method3(sc.nextInt());
        System.out.println(result4);

        System.out.println("格式化输出钱数A");
        M1.merhod5();

        System.out.println("格式化输出钱数B");
        M2.merhod5();

        }






    }

