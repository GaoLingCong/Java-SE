/*
 * 访问成员变量
 * 1.直接通过对象名称访问成员变量：看等号左边是谁就优先用谁，没有则向上找 不会向下找
 * 2.间接通过成员方法访问：该方法属于谁优先用谁，没有则向上找
 * 成员变量不能覆盖重写*/
public class B3多态中成员变量的使用特点 {
     public static void main(String[] args) {


         //使用多态的写法，父类引用指向子类对象
         B1Fu obj2 = new B2Zi();//等号左边是fu 所以出现的是fu，
         System.out.println(obj2.num);//父：10
//         错误写法*/System.out.println(obj2.age);//因为左边是父类 优先访问父类，但是没有找到只会往上查找obj 不会往下子类中查找
         System.out.println("========================");
         obj2.shounum();//子类没有覆盖重写，就是父：10        覆盖重写了 就是 子： 20

     }


}
