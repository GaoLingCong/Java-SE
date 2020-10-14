import java.util.Scanner;

public class 输入三个数字求最大值 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int A = sc.nextInt();
        System.out.println("请输入第二个数字");
        int B = sc.nextInt();
        System.out.println("请输入第三个数字");
        int C = sc.nextInt();
        int tmp = A>B?A:B;
        int max = tmp>C?tmp:C;
        System.out.println("最大的数为"+max);
    }

}
