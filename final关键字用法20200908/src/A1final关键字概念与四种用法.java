/*
*
* final关键字概念与四种用法
* 1.可以修饰一个类
* 2.可以用来修饰一个方法
* 3.还可以修饰一个局部变量
* 4.还可以修饰一个成员变量
*
* 1.当final关键字用来修饰一个类的时候，格式
 * public final class 类名称 {
 *
 * }
 * 含义：当前这个类不能有任何子类（太监类）可以有父类，不能有子类继承不然会报错
 * 注意：一个类如果用final的，那么其中的所以成员方法都无法进行覆盖重写（因为你是太监 没有儿子哈哈没人继承）
 *
 * 2.当final关键字用来修饰一个方法的时候，这个方法就是最终方法，也就是没有儿子不能覆盖重写
格式：
修饰符 final 返回值类型 方法名称(参数列表){
方法体
}
注意事项：
对于类，方法来说，abstract关键字不能同时使用因为矛盾
abstract是抽象方法 要覆盖重写
* */
public class A1final关键字概念与四种用法 {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);
        num1 = 20;
        System.out.println(num1);
        //一旦使用final用来修饰局部变量，那么这个变量就不能进行更改了
        //一次赋值，终身不变
        final  int num2 = 20;
        System.out.println(num2);
//        num2 = 20;//错误写法
//        num2= 200;//错误
        final int num3 ;
        num3 = 20 ;//只要保证有唯一一次赋值即可
        System.out.println(num3);

        //对于基本类型来说，不可变说的是变量当中的数据不可改变
        //对于引用类型来说，不可变说的是变量当中的地址值不可改变
        //例
        A5Student stu1 = new A5Student("高灵聪");
        System.out.println(stu1);
        System.out.println(stu1.getName());//高灵聪
        stu1 = new A5Student("霍建华");
        System.out.println(stu1.getName());
        System.out.println("===========================");
        final A5Student stu2 = new A5Student("高圆圆");
//        stu2 = new A5Student("666");//错误写法  final的引用类型变量，其中的地址不可改变
        //虽然引用类型不可改变地址，但是内容可以改变
        System.out.println(stu2.getName());
        stu2.setName("888");
        System.out.println(stu2.getName());
    }

}
