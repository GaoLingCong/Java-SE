import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class 计算一个人已经出生了多少天练习自学版 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你出生的日期例子yyyy年MM月dd日HH时mm分ss秒");
        method(sc.nextLine());
    }

    public static void method(String a) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        Date date = new Date();
        long time = System.currentTimeMillis();//获取当前系统的毫秒值
        date = sdf.parse(a);//将用户输入的时间转换为日期
        long A= date.getTime();//将用户转换为日期在转换为毫秒值
        long B = time-A;//当前时间减去出生时间
        System.out.println((B/1000/60/60/24)+"天");


    }
}


