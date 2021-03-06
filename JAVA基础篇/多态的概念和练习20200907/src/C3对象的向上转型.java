/*
对象的向上转型
格式:  父类名称  对象名 = new 子类名称（）；
含义：右侧创建一个子类对象，把它当做父类来使用
向上转型  从小范围转向大范围，从猫上升到动物
* 向上转型一定是安全的,没有问题的，但是有一个弊端
* 对象一旦向上转型为父类那么就无法调用子类特有的的内容
* 解决方案：用对象的向下转型【还原】




对象的向下转型
格式：子类名称 对象名 = new （子类名称）父类对象；
含义：将父类对象，还原成本类的子类对象
注意事项：
1.必须保证对象本来创建的时候就是猫，才能向下转型成为猫
2.如果对象创建的时候本来不是猫，现在非要向下转型成为猫，就会报错
* */
public class C3对象的向上转型 {
    private static Object C1Animal;

    public static void main(String[] args) {
        //对象的向上转型 就是 父类引用指向子类对象  左父右子
        C1Animal animal = new C2Cat();  //向上转型把老鼠上身转为动物    本来创建时候就是猫这是前提
        animal.eat();
//        animal.猫抓老鼠();
//        向下转型  进行还原
           C2Cat cat = (C2Cat) C1Animal;
           cat.猫抓老鼠();//就可调用子类特有的方法
//        下面是错误的向下转型
//        本来new的是一只猫，现在非要当做狗
C4Dog dog = (C4Dog) C1Animal;//报错 类转换异常 ClassCastException
//        类似 int num （int） = 10 ；可以    int num （int） = 10.5；不可以精度损失

    }
}
