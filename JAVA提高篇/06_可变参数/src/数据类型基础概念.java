import jdk.swing.interop.SwingInterOpUtils;

import java.io.Console;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class 数据类型基础概念 {
    public static final double ABC=5;//类常量定义
    public static void main(String[] args) throws IOException {
        int a =  1_0000_1;
        System.out.println(a);
        double b = 0x1.0p-3;//指数运算
        System.out.println(b);
        double x = 4;
        double y = Math.sqrt(x);
        System.out.println(y);
        String all = String.join("/","s","f","d");//界定符分隔方法
        System.out.println(all);
        String all2 ="java".repeat(3);//字符串翻倍方法
        System.out.println(all2);
        System.out.println("*************");
        Scanner in = new Scanner(Path.of("C:\\Users\\13362\\123.txt"), StandardCharsets.UTF_8);
        System.out.println(in);



    }

}
