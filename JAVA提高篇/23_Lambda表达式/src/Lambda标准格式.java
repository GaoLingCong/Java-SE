public class Lambda标准格式 {
    public static void main(String[] args) {
         //创建Runnable接口的实现类对象
        RunableImpl run = new RunableImpl();
        //创建Thread类对象,构造方法中传递Runnable接口的实现类
        Thread t = new Thread(run);
        //调用start方法开启新线程,执行run方法
        t.start();


        //简化代码,使用匿名内部类,实现多线程程序
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"创建新线程");
            }
        };
        new Thread(r).start();


        //简化代码
        new  Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"创建新线程");
            }
        }).start();

        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+" 新线程创建了");
        }
        ).start();
        //优化省略Lambda
        new Thread(()-> System.out.println(Thread.currentThread().getName()+"新线程创建了"));

    }
}
