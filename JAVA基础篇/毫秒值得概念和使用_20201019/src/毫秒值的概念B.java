import java.util.Date;

      public class 毫秒值的概念B {
      public static void main(String[] args) {
        //1
        method1();
        //2
        method2();
        //3
        method3();
       }

    /*
       Date类的空参数构造方法
       Date() 获取当前系统的日期和时间
    */
        private static void method1() {
        Date date = new Date();
        System.out.println(date);
        }

    /*
           Date类的带参数构造方法
           Date(long date) :传递毫秒值,把毫秒值转换为Date日期
    */
        private static void method2() {
        Date date = new Date(1603093087304L);
        System.out.println(date);
        }

    /*
       long getTime() 把日期转换为毫秒值(相当于System.currentTimeMillis()方法)
         返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
    */
        private static void method3() {
        Date date = new Date();
            long time =date.getTime() ;//把日期转化为毫秒值
        System.out.println(time);


    }


}
