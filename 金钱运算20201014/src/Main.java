import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Money Q1 = new Money();
        Money Q2 = new Money();
        System.out.println("请输入A和B数");
        System.out.println("MoneyA的元角分");

        Q1.setYuan(sc.nextInt());
        Q1.setJiao(sc.nextInt());
        Q1.setFen(sc.nextInt());

        System.out.println("钱数B的元角分");
        Q2.setYuan(sc.nextInt());
        Q2.setJiao(sc.nextInt());
        Q2.setFen(sc.nextInt());


        Q1.decimalism();
        Q2.decimalism();


        Q1.methodshow();
        Q2.methodshow();//显示元角分方法

        System.out.println("两个Money数相加为");
        Q1.add(Q2);
        Q1.decimalism();
        Q1.methodshow();
    }


}
