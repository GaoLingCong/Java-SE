package 三常用函数式接口;

import java.util.function.Predicate;

/*
     需求:判断一个字符串,有两个判断的条件
        1.判断字符串的长度是否大于5
        2.判断字符串中是否包含a
    满足一个条件即可,我们就可以使用||运算符连接两个条件

    Predicate接口中有一个方法or,表示或者关系,也可以用于连接两个判断条件
    default Predicate<T> or(Predicate<? super T> other) {
        Objects.requireNonNull(other);
        return (t) -> test(t) || other.test(t);
    }
    方法内部的两个判断条件,也是使用||运算符连接起来的
 */
public class Predicate_or {
    /*
            定义一个方法,方法的参数,传递一个字符串
            传递两个Predicate接口
                一个用于判断字符串的长度是否大于5
                一个用于判断字符串中是否包含a
                满足一个条件即可
         */

    public static boolean checkString(String s, Predicate<String> pre1,Predicate<String> pr2){
        return pre1.or(pr2).test(s);
        //return pre1.test(s) || pre2.test(s);
        //等价于return pre1.test(s) || pre2.test(s);
    }
    public static void main(String[] args) {
        String s = "abc";
        boolean b =checkString(s,(String str)->{
            return str.length()>5;
        },(String str)->{
            return str.contains("a");
        });
        System.out.println(b);

    }
}
