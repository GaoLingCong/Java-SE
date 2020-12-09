import java.util.Scanner;
//圆形类
public class Circle implements Shape {
    private float r;//半径

    Scanner sc = new Scanner(System.in);


    public void Assignment()//赋值方法
    {
        System.out.println("请输入圆形半径r的值");
        r=sc.nextFloat();
    }

    @Override
    public void GetArea() {
        System.out.println("圆形的面积为"+ (float) (Math.PI*r*r));
    }

    @Override
    public void GetPerimetter() {
        System.out.println("圆形的周长为"+ (float) (2*Math.PI*r));
    }
}
