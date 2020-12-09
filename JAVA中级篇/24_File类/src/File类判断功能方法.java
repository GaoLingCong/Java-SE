import java.io.File;

/*
    File类判断功能的方法
        - public boolean exists() ：此File表示的文件或目录是否实际存在。
        - public boolean isDirectory() ：此File表示的是否为目录。
        - public boolean isFile() ：此File表示的是否为文件。
 */
public class File类判断功能方法 {
    public static void main(String[] args) {
EXEISTS();
ISIS();

    }   /*
        方法一：
        public boolean exists() ：此File表示的文件或目录是否实际存在。
        用于判断构造方法中的路径是否存在
            存在:true
            不存在:false
     */
    private  static  void EXEISTS(){
        File f1 = new File("F:\\计算机\\C源代码\\1.c");
        System.out.println(f1.exists());

        File f2 = new File("1.c");
        System.out.println(f2.exists());

        File f3 = new File("F:\\计算机\\C源代码");
        System.out.println(f3.exists());
    }
        /*
        方法二和方法三
        public boolean isDirectory() ：此File表示的是否为目录。
            用于判断构造方法中给定的路径是否以文件夹结尾
                是:true
                否:false
        public boolean isFile() ：此File表示的是否为文件。
            用于判断构造方法中给定的路径是否以文件结尾
                是:true
                否:false
        注意:
            电脑的硬盘中只有文件/文件夹,两个方法是互斥
            这两个方法使用前提,路径必须是存在的,否则都返回false
     */
    private static void  ISIS(){
        File f1 = new File("F:\\计算机\\C源代码\\1.c");

        //不存在就没必要获取
        if(f1.exists()){
            System.out.println(f1.isDirectory());
            System.out.println(f1.isFile());
        }

        File f2 = new File("F:\\计算机\\C源代码");
        if(f2.exists()){
            System.out.println(f2.isDirectory());
            System.out.println(f2.isFile());
        }

        File f3 = new File("F:\\计算机\\C源代码\\1.c");
        if (f3.exists()){
            System.out.println(f3.isDirectory());
            System.out.println(f3.isFile());
        }
    }
}

