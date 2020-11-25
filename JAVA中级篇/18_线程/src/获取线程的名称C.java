
/*
    获取线程的名称:
        1.使用Thread类中的方法getName()
            String getName() 返回该线程的名称。
        2.可以先获取到当前正在执行的线程,使用线程中的方法getName()获取线程的名称
            static Thread currentThread() 返回对当前正在执行的线程对象的引用。
 */
//定义一个Thread的子类
public class 获取线程的名称C extends Thread{
    @Override
    public void run() {
        //重写Thread类中的run方法,设置线程任务
        String name = getName();
        System.out.println(name);
    }
}
