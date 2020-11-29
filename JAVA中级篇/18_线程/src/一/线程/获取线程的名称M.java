package 一.线程;

/*
    线程的名称:
        主线程: main
        新线程: Thread-0,Thread-1,Thread-2
 */
public class 获取线程的名称M {
    public static void main(String[] args) {
        //创建Thread类的子类对象
        获取线程的名称C CC = new 获取线程的名称C();
        //调用start方法,开启新线程,执行run方法
        CC.start();
        new 获取线程的名称C().start();
        new 获取线程的名称C().start();


        //链式编程
        System.out.println(Thread.currentThread().getName());
        //Thread.currentThread().getName()这是静态方法可以直接名字调用
    }

}
