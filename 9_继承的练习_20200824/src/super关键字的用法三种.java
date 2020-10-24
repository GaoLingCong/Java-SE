/*
* super关键字的用法有三种
* 1.在子类成员方法中，访问父类的成员变量
* 2 在子类的成员方法中，调用父类的成员方法
* 3.在子类的构造方法中，访问父类构造方法*/
public class super关键字的用法三种 extends Fu2 {
    int num = 20 ;
    public void methodZi (){
        System.out.println(super.num);//加super调用父类的num
    }
    public super关键字的用法三种()
    {
        super();

    }
    public void metuob()
    {
        super.metuob();//加super调用父类方法

        System.out.println( "子类方法");

    }


}
