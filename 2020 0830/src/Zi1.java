/*
* super关键字用来访问父类内容，而this关键字用来访问本类内容用法也有三种*/
//1.在本类的成员方法中，访问本类的成员变量
//2.在本类的成员方法中，访问本类的另一个成员方法
//.在本类的构造方法中，访问本类的另一个构造方法
//在第三中当中    要注意
//this(...)调用必须是构造方法的第一个语句。唯一一个
//super和this两种构造调用，不能同时使用
public class Zi1 extends Fu1 {
    int num = 20;
    public Zi1(){
        this(123);//本类的无参构造调用本类的有参构造  super调父类   this 调用本类
    }
    public Zi1(int n){

    }
    public void showNum()
    {
        int num = 10;
        System.out.println(num);//局部变量
        System.out.println(this.num);//本类的成员变量
        System.out.println(super.num);//父类的成员变量

    }
    public void methodA()
    {
        System.out.println("AAA");
    }
    public void  methodB() {//在本类的成员方法中，访问本类的另一个成员方法

        this.methodA();//

        System.out.println("BBB");
    }


}
