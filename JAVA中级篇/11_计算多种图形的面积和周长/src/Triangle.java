import java.util.Scanner;

//三角形类
public class Triangle implements Shape {
    private float a;
    private float b;
    private float c;
    private float s;
    private float d;
    Scanner sc = new Scanner(System.in);
    public void Assignment()
    {
        System.out.println("请输入三角形边长a的值");
        a=sc.nextFloat();
        System.out.println("请输入三角形边长b的值");
        b=sc.nextFloat();
        System.out.println("请输入三角形边长c的值");
        c=sc.nextFloat();
        float p = (a+b+c)/2;//p为三角形半边周长
         s = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));//面积
         d = a+b+c;//周长
    }

    public void  judge(){  //判断三角形边长关系
        while ((a+b)<=c&&(a-c)<=b)
        {
            System.out.println("您输入的三角形边长有误,请重新输入");
            Assignment();
            if((a+b)>c&&(a-c)>b)
            {
                break;
            }
        }

    }
    @Override
    public void GetArea() {
        System.out.println("三角形面积为"+s);
    }

    @Override
    public void GetPerimetter() {
        System.out.println("三角形周长为"+d);
    }
}
