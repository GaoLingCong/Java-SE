package 二.线程安全;

/*
模拟卖票案例
创建三个线程同时开启，对共享的票进行出售*/
public class 模拟卖票案例 {
    public static void main(String[] args) {
     //创建Runnable接口的实现类对象
      用同步代码块解决线程安全问题 run = new 用同步代码块解决线程安全问题();
//     创建Thread类对象，构造发方法中传递Runnable接口的实现类对象
        Thread t1;
        t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);
        //调用start方法开启多线程
        t1.start();
        t2.start();
        t3.start();
    }
}
