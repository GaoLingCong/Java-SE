/*
* 1.接口的默认方法，可以直接通过实现类对象，直接调用
* 2.接口的默认方法，也可以被接口实现类进行覆盖重写*/
public class B4接口的默认方法定义 {
    public static void main(String[] args) {
        //创建了实现类对象
        B2接口的默认方法定义 B2 = new B2接口的默认方法定义();
         B2.methobAbs(); // 调用抽象方法，实际运行的是右侧实现类   new谁就实现谁
        B2.mehodDefault();//调用默认方法 ，如果实现类当中没有，就会向上找接口
        System.out.println("======================");
        B3接口的默认方法定义 B3 = new B3接口的默认方法定义();
        B3.mehodDefault();  // 可以调用接口的方法，如果覆盖重写了   写什么就是什么
        B3.mehodDefault();  // B3实现类是什么就是是什么
        B3.methobAbs();
    }
}
