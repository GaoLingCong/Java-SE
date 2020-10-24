import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
/*
题目：
用代码模拟猜数字的小游戏。

思路：
1. 首先需要产生一个随机数字，并且一旦产生不再变化。用Random的nextInt方法
2. 需要键盘输入，所以用到了Scanner
3. 获取键盘输入的数字，用Scanner当中的nextInt方法
4. 已经得到了两个数字，判断（if）一下：
    如果太大了，提示太大，并且重试；
    如果太小了，提示太小，并且重试；
    如果猜中了，游戏结束。
5. 重试就是再来一次，循环次数不确定，用while(true)。
*/
import java.util.Random;
import java.util.Scanner;

public class 用Random猜数字游戏 {
    public static void main(String[] args) {
        Random c = new Random();
        int a = c.nextInt(1000) + 1;//a为随机数 1 2 3
        Scanner sc = new Scanner(System.in);//B为输入
         while(true) {
             System.out.println("请输入的数字");
             int B = sc.nextInt();  //B为输入的数字，a为随机数
             if (B > a) {
                 System.out.println("输入的数字太大,请重新输入");
                // B = sc.nextInt();  //B为输入的数字，a为随机数
             }
             if (B < a) {
                 System.out.println("输入的数字太小，请重新输入");
                // B = sc.nextInt();  //B为输入的数字，a为随机数
             }
             if (B == a) {
                 System.out.println("回答正确,恭喜你");
                  break;
             }
         }
             }

        }


