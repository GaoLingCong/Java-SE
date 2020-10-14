

/*
题目要求：
定义一个方法，用来判断两个数字是否相同。
 */
public class 方法练习 {

    public static void main(String[] args) {
        System.out.println(isSame(10, 20)); // false
        System.out.println(isSame(20,20)); // true
    }

    /*1
    三要素：
    返回值类型：boolean
    方法名称：isSame
    参数列表：int a, int b
     */
    public static boolean isSame(int a, int b) {
        /* 1.0   boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }*/

        //  2.0   boolean same = a == b ? true : false;

        //3.0  boolean same = a == b;

        return a == b;//布尔值上面定义了
    }

}