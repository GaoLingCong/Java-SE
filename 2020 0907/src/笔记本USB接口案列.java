public class 笔记本USB接口案列 {
    public static void main(String[] args) {
        //首先创建一个笔记本电脑
        Computer computer = new Computer();  //computer是一个类
        computer.poweron();//开机
        //准备一个鼠标供电脑使用
        鼠标类 鼠标 = new 鼠标类();
        //首先进行向上转型
        //右边是小的   左边是大  左父右子多态
        computer.使用设备(鼠标);
        //参数是USB类型，正好传递进去的USB鼠标
//        创建一个USB键盘
        键盘类 键盘 = new 键盘类();
        //方法参数是USB类型，传递进去的是实现类对象
         computer.使用设备(键盘);//正确写法  发生了向上转型
//        computer.使用设备( new 键盘类());  //  也是正确写法
        System.out.println("============================"); 
        //自动类型转换
        method(10.0);   //正确写法  double-》double
        method(20);   //正确写法  int-》double
        int a = 30;
        method(a);//正确写法  int -》double




        computer.poweroff();//关机
    }
    public static void method(double num)
    {
        System.out.println(num);
    }
}
