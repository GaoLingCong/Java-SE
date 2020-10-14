/*
* super关键字用来访问父类内容，而this关键字用来访问本类的内容，用法也有三种*/
// 1.在本类的成员方法中，访问本类的成员变量
public class Fu3 extends Zi3 {
    int num    =    20;
    public void showNum(){
        int num = 10;
        System.out.println(num);//局部变量
        System.out.println(this.num);//本类中的成员变量

    }


}
