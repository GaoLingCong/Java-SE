public interface A2继承父类并实现多个接口B {
    //static{
    //错误写法  接口不能有静态代码块
    //}
    /* public A1继承父类并实现多个接口(){
     错误写法 接口不能有构造方法
     }
}*/
public abstract  void methodB();
    public abstract  void methodABS();
    public default void methodC(){  //default是默认方法
        System.out.println("默认方法BBB");

    }
}
