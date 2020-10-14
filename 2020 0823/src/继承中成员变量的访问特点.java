/*
在父子类的继承关系当中，如果成员变量重名，则创建子类对象时，访问有两种方式：

直接通过子类对象访问成员变量：
    等号左边是谁，就优先用谁，没有则向上找。
间接通过成员方法访问成员变量：
    该方法属于谁，就优先用谁，没有则向上找。
 */
public class 继承中成员变量的访问特点 {
    public static void main(String[] args) {
        FU fu = new FU();//创建父类对象
        System.out.println(fu.numFu);//只能使用父类的东西，没有任何子类的东西  父亲不知道儿子 儿子知道父亲

        ZI zi = new ZI();
     System.out.println(zi.numzi);//20
     System.out.println(fu.numFu);//10
        System.out.println("=======================");
        System.out.println(zi.num);//优先子类200     zi.num是直接访问
        //等号左边是谁就优先用谁
        //System.out.println(zi.abc);//子类没有先父类找都没有  编译器报错
        System.out.println("===================" );
        zi.methodZI();//200   间接访问  方法属于是就优先用谁
        zi.methodFU();//100      间接访问  方法属于是就优先用谁


    }
}
