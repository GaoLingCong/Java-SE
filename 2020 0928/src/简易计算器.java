import java.util.Scanner;

public class 简易计算器 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opr = null;
        简易计算器的类 lei = new 简易计算器的类();
        while (true){

            System.out.println("请输入要进行的运算");
            opr = sc.nextLine();
//            if(opr.equals("-1"))
//            {
//                System.out.println("bye!");
//                break;
//            }
            System.out.println("请输入第一个操作数");
           int  x = sc.nextInt();
            System.out.println("请输入第二个操作数");
           int  y = sc.nextInt();


            lei.setLeft(x);
            lei.setRight(y);
            int result = lei.cala(opr);
            System.out.println("结果为"+result);
             break;
        }


    }
}
