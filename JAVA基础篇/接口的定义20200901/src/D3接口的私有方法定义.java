/*
* 问题描述需要抽取一个公共方法，用来解决两个默认方法重复代码的问题
* 但是这公共方法不应该让实现类使用应该私有化
* 解决方案：java9开始接口当中运行定义私有化方法
* 1.普通私有方法，解决多个默认方法之间重复代码问题
* 格式
* private  返回值类型 方法名称(参数列表){
* 方法体
* }
*
* 2.静态私有方法，解决多个静态方法代码之间重复问题
* * private static 返回值类型 方法名称(参数列表){
 * 方法体
 * }
* */
public interface D3接口的私有方法定义 {
public default void mthob1(){
    System.out.println("默认方法1");
    A();
}public default void mthob2(){
        System.out.println("默认方法2");
        A();
}
public default void mthob3(){
    System.out.println("默认方法3");
   A();

}
 private  void A(){
    System.out.println("AAA");
    System.out.println("BBB");
    System.out.println("CCC");
}


  
}
