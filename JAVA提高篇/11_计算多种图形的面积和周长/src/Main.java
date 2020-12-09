import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            Show();
            String opr =sc.nextLine();
            switch (opr) {
                case "1":
                    Rectangle();
                    break;

                case "2":
                    Circle();
                    break;

                case "3":
                    Trapezoidal();
                    break;

                case "4":
                    Triangle();
                    break;

                case "0":
                    System.out.println("********欢迎下次使用********");
                    System.exit(0);
                    break;

                default:
                    System.out.println("您输入有误，请重新输入");
                    System.out.println("***********************");
                    break;
            }

        }
    }
    public static void Rectangle()//矩形
    {
        Rectangle Rec = new Rectangle();//创建对象
        Rec.Assignment();//赋值
        Rec.GetArea();//面积
        Rec.GetPerimetter();//周长
    }


    public static void Circle()//圆形
    {
        Circle Cir = new Circle();
        Cir.Assignment();//赋值
        Cir.GetArea();//面积
        Cir.GetPerimetter();//周长
    }


    public static void Triangle()//三角形
    {
        Triangle Tri = new Triangle();
        Tri.Assignment();//赋值
        Tri.judge();//判断
        Tri.GetArea();//面积
        Tri.GetPerimetter();//周长

    }


    public static void Trapezoidal()//梯形
    {
        Trapezoidal Tri = new Trapezoidal();
        Tri.Assignment();//赋值
        Tri.GetArea();//面积
        Tri.GetPerimetter();//周长
    }


    public static void Show()
    {
        System.out.println("****************************");
        System.out.println("  欢迎使用图形面积周长计算器  ");
        System.out.println("****************************");
        System.out.println("****请输入您需要计算的图形****");
        System.out.println("         输入1  矩形         ");
        System.out.println("         输入2  圆形         ");
        System.out.println("         输入3  梯形         ");
        System.out.println("         输入4  三角形         ");
        System.out.println("         输入0  退出系统         ");
    }


}
