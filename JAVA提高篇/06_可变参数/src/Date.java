import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.*;

public class Date {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();//创建一个新对象，表示构造这个对象时的日期
        int month = date.getMonthValue();//获取当前月份
        int today = date.getDayOfMonth();//获取当前时间

         date = date.minusDays(today-1);//
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i = 1;i<value;i++)
            System.out.print("   ");
            while (date.getMonthValue() == month) {
                System.out.printf("%3d" + date.getDayOfMonth());
                if (date.getDayOfMonth() == today)
                    System.out.print("*");

                else
                    System.out.print(" ");

                date = date.plusDays(1);
                if (date.getDayOfWeek().getValue() == 1)

                    System.out.println(" ");

            }
            if (date.getDayOfWeek().getValue() != 1)
                System.out.println(" ");
            }
        }





