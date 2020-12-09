package 四.等待唤醒机制;

public class 测试类 {
    public static void main(String[] args) {
        //创建包子对象
        包子类 bz = new 包子类();
        //创建包子铺线程开启生产包子
        new 包子铺类(bz).start();
        //创建吃货线程，开启吹包子
        new 吃货类(bz).start();
    }
}
