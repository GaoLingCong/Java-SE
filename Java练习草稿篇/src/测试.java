/*
import java.util.Scanner;
public static void main(String[] args) {
        5         System.out.println("请输入两个数字，中间用空格隔开，例如5 5");
        6         //得到一个扫描器，用来扫描 系统的输入
        7         Scanner input = new Scanner(System.in);
        8         //申明一个临时的字符串变量temp，用来保存 扫描器读取的一行；
        9         String temp = input.nextLine();
        10         //temp字符串首先trim()一下，就是去掉两边的空白，
        11         //因为有的人可能输入的是 空格5空格5空格回车。.
        12         //所以去掉两边的空格变成 5空格5回车 就符合要求了
        13         //split(" ")方法表示，用空格去切割字符串，返回的结果是一个字符串数组
        14         String[] ss = temp.trim().split(" ");
        15         //从两个字符串中解析得到两个数字,并求和
        16         int num1 = Integer.parseInt(ss[0]);
        17         int num2 = Integer.parseInt(ss[1]);
        18         int sum = num1+num2;
        19         //输出结果
        20         System.out.println("输入的数字是"+num1+" "+num2+"两数的和是："+sum);
        21         //养成良好的习惯，打开了的资源要记得关闭，我们打开了扫描器，就要关闭扫描器
        22         input.close();
        23     }
24 }*/
