/*
    可变参数:是JDK1.5之后出现的新特性
    使用前提:
        当方法的参数列表数据类型已经确定,但是参数的个数不确定,就可以使用可变参数.
    使用格式:定义方法时使用
        修饰符 返回值类型 方法名(数据类型...变量名){}
    可变参数的原理:
        可变参数底层就是一个数组,根据传递参数个数不同,会创建不同长度的数组,来存储这些参数
        传递的参数个数,可以是0个(不传递),1,2...多个

 */


import java.util.ArrayList;

public class 可变参数 {
    public static void main(String[] args) {
        int b = add1(2,3);
        System.out.println(b);
        int c = add1(1,2,3);
        System.out.println(c);
        //计算多个参数时要不停的重载很麻烦，所以引出一个新的方法可变参数
        System.out.println("****************************");
        /*
        add(); 就会创建一个长度为0的数组, new int[0]
        add(10); 就会创建一个长度为1的数组,存储传递来过的参数 new int[]{10};
        add(10,20); 就会创建一个长度为2的数组,存储传递来过的参数 new int[]{10,20};
        add(10,20,30,40,50,60,70,80,90,100); 就会创建一个长度为2的数组,存储传递来过的参数 new int[]{10,20,30,40,50,60,70,80,90,100};
     */
        int l = add2(10,2,3,4,5,66);
        System.out.println(l);





    /*
        可变参数的注意事项
            1.一个方法的参数列表,只能有一个可变参数
            2.如果方法的参数有多个,那么可变参数必须写在参数列表的末尾
     */
    /*public static void method(int...a,String...b){

    }*/

    /*public static void method(String b,double c,int d,int...a){
    }*/



    }
    //定义一个方法，计算三个int整形的整数和
    public  static int add1(int a, int b, int c)
    {
        return a+b+c;
    }
    //定义一个方法，计算两个整形的整数和
    public  static int add1(int a, int b)
    {
        return a+b;
    }

    public static  int add2(int...arr)
    {
        System.out.println(arr);//[I@10f87f48] 底层是一个数组
        System.out.println(arr.length);
        //定义一个初始化的变量，记录累加求和
        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }

        return sum;
    }

    //可变参数的特殊(终极)写法
    public static void method(Object...obj){


    }

}
