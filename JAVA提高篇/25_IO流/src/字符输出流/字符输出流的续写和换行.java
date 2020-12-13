package 字符输出流;

import java.io.FileWriter;
import java.io.IOException;

/*
    续写和换行
    续写,追加写:使用两个参数的构造方法
        FileWriter(String fileName, boolean append)
        FileWriter(File file, boolean append)
        参数:
            String fileName,File file:写入数据的目的地
            boolean append:续写开关 true:不会创建新的文件覆盖源文件,可以续写; false:创建新的文件覆盖源文件
     换行:换行符号
        windows:\r\n
        linux:/n
        mac:/r
 */
public class 字符输出流的续写和换行 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("F:\\计算机\\C源代码\\c.txt",true);
        for (int i = 0; i < 10; i++) {
            fw.write("hellow，wordle研路漫漫星光不负赶路人！！"+i+"\r\n");
        }
        fw.close();
    }
}
