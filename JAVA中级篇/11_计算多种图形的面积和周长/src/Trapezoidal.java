import java.util.Scanner;

//梯形
public class Trapezoidal implements Shape{
    private float a;//上底
    private float b;//下底
    private float h;//高
    private float Y1;//下底
    private float Y2;//下底
    Scanner sc = new Scanner(System.in);
    public void Assignment()
    {
        System.out.println("请输入梯形上底a的值");
        a=sc.nextFloat();
        System.out.println("请输入梯形下底b的值");
        b=sc.nextFloat();
        System.out.println("请输入梯形高h的值");
        h=sc.nextFloat();

    }
    @Override
    public void GetArea() {
        System.out.println("梯形面积为"+((a+b)*h)/2);
    }

    @Override
    public void GetPerimetter() {

    }
}
