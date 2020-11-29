package 二.线程安全;
/*实现卖票案例*/
public class RunnableImpl implements Runnable {
    //定义一个多线程共享的票源
    private int ticket = 100;
    @Override
    public void run() {
        //先判断票是否存在
        while (true){
            if(ticket>0) {
                //提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //票存在，卖票则 ticker--
                System.out.println(Thread.currentThread().getName()+"-->正在卖"+ticket+"张");
                ticket--;
        }

            }
    }
}
