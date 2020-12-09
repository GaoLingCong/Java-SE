package 四.等待唤醒机制;

public class 吃货类 extends  Thread {
    private  包子类 bz;

    public 吃货类(包子类 bz) {
        this.bz = bz;
    }




    @Override
    public void run() {
      while (true){
          //让他一直吃包子
          //必须同时同步技术保证两个线程只能有一个在执行
           synchronized (bz){
               if(bz.flag==false){
                   //吃货调用wait方法进入等待状态
                   try {
                       bz.wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
               //被唤醒之后执行的代码，吃包子
               System.out.println("吃货正在吃"+bz.pi+bz.xian+"的包子");
               //吃完包子 修改包子的状态为false
               bz.flag=false;
               //吃货唤醒包子铺线程，生产包子
               bz.notify();
               System.out.println("吃货以及把"+bz.pi+bz.xian+"的包子，包子铺继续生产包子");
               System.out.println("-------------------");





           }




      }
    }
}
