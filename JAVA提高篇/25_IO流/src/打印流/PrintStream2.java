package 打印流;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.nio.file.FileAlreadyExistsException;

/*
    可以改变输出语句的目的地(打印流的流向)
    输出语句,默认在控制台输出
    使用System.setOut方法改变输出语句的目的地改为参数中传递的打印流的目的地
        static void setOut(PrintStream out)
          重新分配“标准”输出流。
 */
public class PrintStream2 {
    public static void main(String[] args) throws FileAlreadyExistsException, FileNotFoundException {

        System.out.println("sdsads");


        java.io.PrintStream ps = new PrintStream("10_IO\\目的地是打印流.txt");
        System.setOut(ps);
        System.out.println("dsadsadas");
        ps.close();
    }
}
