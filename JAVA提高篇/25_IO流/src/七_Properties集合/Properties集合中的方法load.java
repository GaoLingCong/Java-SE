package 七_Properties集合;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
    可以使用Properties集合中的方法load,把硬盘中保存的文件(键值对),读取到集合中使用
    void load(InputStream inStream)
    void load(Reader reader)
    参数:
        InputStream inStream:字节输入流,不能读取含有中文的键值对
        Reader reader:字符输入流,能读取含有中文的键值对
    使用步骤:
        1.创建Properties集合对象
        2.使用Properties集合对象中的方法load读取保存键值对的文件
        3.遍历Properties集合
    注意:
        1.存储键值对的文件中,键与值默认的连接符号可以使用=,空格(其他符号)
        2.存储键值对的文件中,可以使用 # 进行注释,被注释的键值对不会再被读取
        3.存储键值对的文件中,键与值默认都是字符串,不用再加引号
 */
public class Properties集合中的方法load {
    public static void main(String[] args) throws IOException {
        //1.创建Properties集合对象
        Properties prop  = new Properties();
        //2.使用Properties集合对象中的方法load读取保存键值对的文件
       prop.load(new FileReader("F:\\计算机\\C源代码\\c.txt"));
        //3.遍历Properties集合
        Set<String> set = prop.stringPropertyNames();
        for(String key: set){
            String value = prop.getProperty(key);
            System.out.println(key+"="+value);
        }
    }
}
