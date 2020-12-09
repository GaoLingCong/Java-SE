import java.io.File;
import java.lang.reflect.Field;

/*
    练习:
        递归打印多级目录
    需求:
        遍历c:\\abc文件夹,及abc文件夹的子文件夹
        c:\\abc
        c:\\abc\\abc.txt
        c:\\abc\\abc.java
        c:\\abc\\a
        c:\\abc\\a\\a.jpg
        c:\\abc\\a\\a.java
        c:\\abc\\b
        c:\\abc\\b\\b.java
        c:\\abc\\b\\b.txt
 */
public class 用递归打印多级目录 {
    public static void main(String[] args) {
        File file = new File("F:\\JavaWeb\\JavaWeb");
        getAllFile(file);

    }
     /*
        定义一个方法,参数传递File类型的目录
        方法中对目录进行遍历
     */
    public static void getAllFile(File dir){
        System.out.println(dir);//打印被遍历的目录名称
//        public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
        //        public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
        File [] files = dir.listFiles();
        for (File f: files){
            //对遍历得到的File对象f进行判断,判断是否是文件夹
//            - public boolean isDirectory() ：此File表示的是否为目录。
            if (f.isDirectory()){
                //f是一个文件夹,则继续遍历这个文件夹
                //我们发现getAllFile方法就是传递文件夹,遍历文件夹的方法
                //所以直接调用getAllFile方法即可:递归(自己调用自己)
                getAllFile(f);
            }else
                //f是一个文件,直接打印即可
                System.out.println(f);
            //不断寻找文件夹如果是文件夹就一直寻遍历文件夹下去直到 直道找到文件为止

        }
    }
}
