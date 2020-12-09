import java.util.Scanner;

//梯形
public class Trapezoidal implements Shape{
    private float a;//上底
    private float b;//下底
    private float y1;//梯形的腰1
    private float y2;//梯形的腰2
    private float h;//梯形高

    Scanner sc = new Scanner(System.in);


    public void Assignment()
    {
        System.out.println("请输入梯形上底a的值");
        a=sc.nextFloat();
        System.out.println("请输入梯形下底b的值");
        b=sc.nextFloat();
        System.out.println("请输入梯形腰边长c的值");
        y1=sc.nextFloat();
        System.out.println("请输入梯形腰边长d的值");
        y2=sc.nextFloat();
        System.out.println("请输入梯形的高h的值");
        h=sc.nextFloat();

    }


    @Override
    public void GetArea() {

        System.out.println("梯形面积为"+((a+b)*h)/2);
    }

    @Override
    public void GetPerimetter() {
        System.out.println("梯形周长为"+(a+b+y1+y2));

    }
}
