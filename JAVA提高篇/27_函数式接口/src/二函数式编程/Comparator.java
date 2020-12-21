package 二函数式编程;
/*
    如果一个方法的返回值类型是一个函数式接口，那么就可以直接返回一个Lambda表达式。
    当需要通过一个方法来获取一个java.util.Comparator接口类型的对象作为排序器时,就可以调该方法获取。
 */
public class Comparator {
    //定义一个方法,方法的返回值类型使用函数式接口Comparator
    public static java.util.Comparator<String> getComparator(){
        //方法的返回值类型是一个接口,那么我们可以返回这个接口的匿名内部类

        //一
       /* return new java.util.Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 02-01;
            }
        };
        */

        //二
        return ((o1, o2) -> o2.length()-o1.length());



    }
}
