import java.security.PublicKey;
import java.util.Scanner;

public class 钱 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        钱类  Q1 = new 钱类();
        钱类  Q2 = new 钱类();
        System.out.println("请输入A和B钱数");
        System.out.println("钱数A的元角分");
          int [] a=  {Q1.setYuan(sc.nextInt()),Q1.setJiao(sc.nextInt()),Q1.setFen(sc.nextInt())};//存放元角分进行后面的运算
          System.out.println("钱数B的元角分");
          int [] b ={Q2.setYuan(sc.nextInt()),Q2.setJiao(sc.nextInt()),Q2.setFen(sc.nextInt())};
        Q1.decimalism(a[0],a[1],a[2]);Q2.decimalism(b[0],b[1],b[2]);
        Q1.methodshow();Q2.methodshow();//显示远角分方法
       System.out.println("两个钱数相加为");
       int result1=Q1.add(a[0],b[0]);
        int result2=Q1.add(a[1],b[1]);
        int result3=Q1.add(a[2],b[2]);
    Q1.decimalism(result1,result2,result3);//同样的方法
    System.out.println(result1+"元"+result2+"角"+result3+"分");













//        System.out.println("钱数A+钱数B等于："+ Q.add(Q.getX(),Q.getY()));
//        System.out.println("钱数A—钱数B等于："+Q.aubtraction(Q.getX(), Q.getY()));
//        System.out.println("请输入钱数要翻的倍数");
//        n = sc.nextInt();
//        System.out.println("钱数A翻"+n+"倍后为："+Q.dubleA(Q.getX(), n ));
//        System.out.println("钱数B翻"+n+"倍后为："+Q.dubleB(Q.getY(), n ));
//        System.out.println("钱数A与钱数B比较大小为"+Q.compare(Q.getX(), Q.getY()));
    }


}
