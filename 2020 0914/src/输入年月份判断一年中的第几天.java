import java.util.Scanner;

public class 输入年月份判断一年中的第几天 {
    public static void main(String[] args) {
        System.out.println("请输入年，月，日，(空格分隔)");
        Scanner sc = new Scanner(System.in);
        int nian =sc.nextInt();
        int moth = sc.nextInt();
        int day = sc.nextInt();
        if((nian%400 == 0)||(nian%4 == 0 &&nian%100!=0))
        {
            int result1=A(moth,day);
            System.out.println(moth+"月"+day+"日是一年第"+result1+"天");
        }else{

            int result2=B(moth,day);
            System.out.println(moth+"月"+day+"日是一年第"+result2+"天");
        }
    }
    private static int  A(int moth,int day)
    {
        int[] days1 = {0,31,60,91,121,152,182,213,244,274,305,335};
        return days1[moth-1]+day;
    }
    private static int  B(int moth,int day)
    {
        int[] days2 = {0,30,59,90,120,151,181,212,243,273,304,334};
        return days2[moth-1]+day;
    }
}
