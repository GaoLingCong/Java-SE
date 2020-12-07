public class RunableImpl  implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建新线程");
    }
}
