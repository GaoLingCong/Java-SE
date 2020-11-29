package 一.线程;

import 一.线程.设置线程名字C;

public class 设置线程的名字M {
    public static void main(String[] args) {
        //方法一 直接set改名字
        //开启多线程
        设置线程名字C C = new 设置线程名字C();
        C.setName("啊道");
        C.start();
        //方法二
        new 设置线程名字C("帅气的啊道").start();

    }
}
