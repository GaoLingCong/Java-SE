package 三.线程状态;
/*
    进入到TimeWaiting(计时等待)有两种方式
    1.使用sleep(long m)方法,在毫秒值结束之后,线程睡醒进入到Runnable（可运行）/Blocked(堵塞)状态
    2.使用wait(long m)方法,wait方法如果在毫秒值结束之后,还没有被notify唤醒,就会自动醒来,线程睡醒进入到Runnable/Blocked状态

    唤醒的方法:
         void notify() 唤醒在此对象监视器上等待的单个线程。
         void notifyAll() 唤醒在此对象监视器上等待的所有线程。
 */
public class Object类中wait带参方法和notifyAll方法 {
    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object obj1 = new Object();
        //创建一个顾客线程（消费者）
        //用匿名对象创建
        new Thread(){
            @Override
            public void run() {
                //加个While让它一直做包子
                while (true){
                    //保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                    synchronized (obj1){
                        System.out.println("顾客1告知老板要的包子的种类和数量");
                        //调用wait方法，放弃cpu的执行，进入到WAITING状态（无线等待）
                        try {
                            //加参数5秒
//                            obj1.wait(5000);
                            obj1.wait(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            //开启线程
        }.start();
        new Thread(){
            @Override
            public void run() {
                //加个While让它一直做包子
                while (true){
                    //保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                    synchronized (obj1){
                        System.out.println("顾客2告知老板要的包子的种类和数量");
                        //调用wait方法，放弃cpu的执行，进入到WAITING状态（无线等待）
                        try {
                            //加参数5秒
//                            obj1.wait(5000);
                            obj1.wait(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            //开启线程
        }.start();

        //创建一个老板线程（生产者）
        new Thread(){

            @Override
            public void run() {
                //加个While让他一直买包子
                while (true){
                    //花了5秒做包
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj1){
                        System.out.println("老板5秒后交给顾客所需要的包子");
                        //唤醒之后执行的代码
//                        如果有多个线程，随机唤醒一个 obj1.notify();
//                        唤醒所有等待的线程
                        obj1.notifyAll();
                        }
                    System.out.println("包子给钱开吃");
                    System.out.println("-----------------");

                }
            }
        }.start();

    }
}
