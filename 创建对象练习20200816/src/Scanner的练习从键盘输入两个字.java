//import java.util.Scanner;//  1 .导包  直接输入Scanner回车自动出来

import java.util.Scanner;

//三步骤 导包 创建 使用
//import java.util.Scanner;
public class Scanner的练习从键盘输入两个字 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // 2. 创建   快捷Alt+回车
        System.out.println("请输入第一个数字");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int num2 = sc.nextInt(); // 3 使用
        int sum;
        sum = num1+num2;
        System.out.println("两个数之和等于"+sum);

    }
}

