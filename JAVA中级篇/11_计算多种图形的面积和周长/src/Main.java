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
                    Triangle();
                    break;
                case "0":
                    System.out.println("欢迎下次使用，谢谢");
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
        Rectangle Rec = new Rectangle();
        Rec.Assignment();
        Rec.GetArea();
        Rec.GetPerimetter();
    }
    public static void Circle()//圆形
    {
        Circle Cir = new Circle();
        Cir.Assignment();
        Cir.GetArea();
        Cir.GetPerimetter();
    }
    public static void Triangle()//三角形
    {
        Triangle Tri = new Triangle();
        Tri.Assignment();
        Tri.judge();
        Tri.GetArea();
        Tri.GetPerimetter();

    }
    public static void Show()
    {
        System.out.println("****************************");
        System.out.println("**欢迎使用图形面积周长计算器**");
        System.out.println("****************************");
        System.out.println("请输入你需要计算的图形");
        System.out.println("输入1 矩形");
        System.out.println("输入2 圆形");
        System.out.println("输入3 三角形");
        System.out.println("输入0 退出系统");
    }


}
