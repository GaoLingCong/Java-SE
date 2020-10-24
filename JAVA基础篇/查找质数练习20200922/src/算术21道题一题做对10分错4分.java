import java.util.Scanner;

public class 算术21道题一题做对10分错4分 {//84

    public static void main(String[] args) {
        int right = 0;
        int wrong = 0;
        System.out.println("请输入成绩");
        Scanner sc = new Scanner(System.in);
        int results = sc.nextInt();
        while (true) {

            if ((results >= 210) || (results <= 0)) {
                System.out.println("您输入有误请重新输入");
                results = sc.nextInt();
            }
            else if ((results >= 0) && (results <= 210)) { break;}
        }
            right = (results + 84) / 14;
            wrong = 21 - right;
            System.out.println("21道算术题一共答对：" + right);
            System.out.println("21道算术题一共答错：" + wrong);
        }
        /*public static int  scors(int results)
        {
            Scanner sc = new Scanner(System.in);
            results = sc.nextInt();
            while (true) {
                results = sc.nextInt();
                if ((results >= 210) || (results <= 0)) {
                    System.out.println("您输入有误请重新输入");
                   }
                else if ((results >= 0) && (results <= 210)) { break;}
            }
            int right = (results + 84) / 14;
            int wrong = 21 - right;
            System.out.println("21道算术题一共答对：" + right);
            System.out.println("21道算术题一共答错：" + wrong);

            return results;*/


    }


