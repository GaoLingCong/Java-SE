import java.util.Scanner;

public class 算术题优化 {
    public static void main(String[] args) {
            int right = 0;//正确的题目次数
            int wrong = 0;//错误的题目次数
            System.out.println("请输入成绩");
            Scanner sc = new Scanner(System.in);
            int results = sc.nextInt();
            while (true) {//判断用户输入，如果范围大了或者小重新输入
                if ((results >= 210) || (results <= 0)) {
                    System.out.println("您输入有误请重新输入");
                    results = sc.nextInt();
                }
                else if ((results >= 0) && (results <= 210)) { break;}//如果输入对了就跳出

            }

           //用方程思想  错的题目次数=21-对的题目次数
            //用方程  10*对的题目次数-4*错的题目次数=用户所输入的成绩
            System.out.println("21道算术题一共答对：" + (right= (results + 84) / 14));
            wrong = 21 - right;
            System.out.println("21道算术题一共答错：" + wrong);
        }
}
