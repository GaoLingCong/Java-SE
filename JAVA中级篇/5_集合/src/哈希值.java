/*哈希值：是一个十进制整数，由系统随机给出（就是对象的地址值，是一个逻辑地址，是模拟出来的得到的地址，不是数据实际存储的物理地址
* 在Object类中有一个方法 ，可以获取哈希值)  哈希表就是速度快
* int hashCode （） 返回该对象的哈希值
* hashCode方法源码
* public native int hashCode ()
* native :代表该方法调用的是本地操作系统的方法
* */

public class 哈希值 {
    public static void main(String[] args) {

        //person类继承Object类，所以可以使用Object类的hashCode方法
            Person per = new Person();
            int h1=  per.hashCode();
            System.out.println(h1);


            Person per2 = new Person();
            int h2 = per2.hashCode();
            System.out.println(h2);
        System.out.println("31311");
    }

    }

