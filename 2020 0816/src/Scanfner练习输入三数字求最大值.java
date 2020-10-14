import java.util.Scanner;//导包

public class Scanfner练习输入三数字求最大值 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个数字");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max;
      /*  if (a > b) {
            if (a > c) {
                max = a;

            } else max = c;
        } else {
            if (b > c) {
                max = b;
            } else max = c;

        }*/
        int tmp = a>b?a:b;
         max =tmp>c?tmp:c;
        System.out.println("最大值为"+max);
    }

}
