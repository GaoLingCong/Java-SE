package _01_蓝桥杯java本科B组2013年;


/*  100 可以表示为带分数的形式：100 = 3 + 69258 / 714

    还可以表示为：100 = 82 + 3546 / 197

    注意特征：带分数中，数字1~9分别出现且只出现一次（不包含0）。

    类似这样的带分数，100 有 11 种表示法。

题目要求：
从标准输入读入一个正整数N (N<1000*1000)
程序输出该数字用数码1~9不重复不遗漏地组成带分数表示的全部种数。
注意：不要求输出每个表示，只统计有多少表示法！


例如：
用户输入：
100
程序输出：
11

再例如：
用户输入：
105
程序输出：
6


资源约定：
峰值内存消耗（含虚拟机） < 64M
CPU消耗  < 3000ms


请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。

所有代码放在同一个源文件中，调试通过后，拷贝提交该源码。
注意：不要使用package语句。不要使用jdk1.6及以上版本的特性。
注意：主类的名字必须是：Main，否则按无效代码处理。

全排列
在循环中进行递归
*/
import java.util.Scanner;
public class _09带分数 {


    static int ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
//		int[] arr= {1,2,3,4,5,6,7,8,9};
        int[] arr= {1,2,3};
        //最1到9的全排列
        f(arr,0);





    }
    //确认某一个排列的第几位
    private static void f(int[] arr, int k) {
        if (k==9) //全部确认
        {
            if (check(arr)) ans++;


        }
        for(int i =k;i<arr.length;i++) {
            //将第i位和第k位交换
            int t = arr[i];
            arr[i] = arr[k];
            arr[k] = t;

            //选定第K位，移交下一层去确认第K+1位
            f(arr,k+1);

            //回溯 变回原来的样子
            t = arr[i];
            arr[i] = arr[k];
            arr[k] = t;



        }



    }
    private static boolean check(int[] arr) {

        return true;

    }
    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
