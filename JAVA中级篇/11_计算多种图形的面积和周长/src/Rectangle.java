import java.util.Scanner;

//矩形类
 class Rectangle implements Shape{
     private float a;//边长a
     private float b;//边长b
    Scanner sc = new Scanner(System.in);


    public void Assignment()
    {
        System.out.println("请输入矩形边长a的值");
        a=sc.nextFloat();
        System.out.println("请输入矩形边长b的值");
        b=sc.nextFloat();
    }

    @Override
    public void GetArea() {
        System.out.println("矩形的面积为"+a*b);
    }


    @Override
    public void GetPerimetter() {
        System.out.println("矩形的周长为"+2*(a+b));
    }
}
