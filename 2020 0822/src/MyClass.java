public class MyClass {
    int num ;//成员变量
    static int numStatic;//静态变量

    //成员方法
    public void method(){
        System.out.println("这是一个普通的方法");
        //成员方法访问成员变量
        System.out.println(num);
        //成员方法访问静态变量
        System.out.println(numStatic);
               }
               //静态方法
    public static  void StaticMethod(){
        System.out.println("这是一个静态方法");
        //静态方法可以访问静态变量
        System.out.println(numStatic);
    }

}