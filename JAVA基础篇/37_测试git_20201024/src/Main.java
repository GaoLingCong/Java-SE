import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Money M1 = new Money();
        Money M2 = new Money();
        Scanner sc = new Scanner(System.in);
        String opr;
        System.out.println("请输入第一个钱数A");
        M1.setA(sc.nextFloat());
        System.out.println("请输入第二个钱数B");
        M2.setA(sc.nextFloat());
        System.out.println("请输入您的操作输入1进行两个钱数相加，输入2进行两个钱数减法，输入3两个钱数进行比较大小，输入4进行钱数的翻倍，");
        opr = sc.next();
        switch (opr) {
            case "1": {
                System.out.println("进行加法运算");
                float result1 = M1.add(M1.getA(), M2.getA());
                M1.method5(result1);
                break;
            }

            case "2": {
                System.out.println("进行减法运算");
                float result2 = M1.subtract(M1.getA(), M2.getA());
                M1.method5(result2);
                break;
            }
            case "3": {
                System.out.println("两个钱数比较大小结果为：");
                M1.method4(M1.getA(), M2.getA());
                break;
            }
            case "4": {
                System.out.println("请输入第一个钱数A要翻的倍数");
                float result3 = M1.method3(sc.nextInt());
                M1.method5(result3);
                System.out.println("请输入第一个钱数B要翻的倍数");
                float result4 = M2.method3(sc.nextInt());
                M1.method5(result4);
                break;
            }
            default: {
                System.out.println("输入无效");
                break;
            }
        }


    }
}