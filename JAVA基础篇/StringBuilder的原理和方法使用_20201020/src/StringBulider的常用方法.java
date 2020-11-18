/*
    StringBuilder的常用方法:
        public StringBuilder append(...)：添加任意类型数据的字符串形式，并返回当前对象自身。
 */


public class StringBulider的常用方法 {
    public static void main(String[] args) {
        //创建StringBuilder对象
        StringBuilder bu = new StringBuilder();
        //使用append方法往StringBuilder中添加数据
        //append方法返回的是this，也就是说谁调用就返回谁，调用方法的对象du，this==du
        StringBuilder bu2 = bu.append("abc");//把du的地址赋值给了bu2
        System.out.println(bu);
        System.out.println(bu2);
        System.out.println(bu==bu2);//比较的是地址 true
        System.out.println("========分界线===========");
        //使用append方法无需接收返回值
        bu.append("abc");
        bu.append(1);
        bu.append(1.232);
        bu.append('高');
        System.out.println(bu);
        System.out.println("========分界线===========");
        /*
        * 链式编程：方法返回值是一个对象，可以继续调用方法
        */
        //例子
        System.out.println("abc".toLowerCase().toLowerCase().toLowerCase());
        //toLowerCase()方法是把大小转换小写
        bu.append("abc").append(1).append(true).append('高');
        System.out.println(bu);
    }
    }

