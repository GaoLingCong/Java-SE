import java.io.File;

/*
    File类获取功能的方法
        - public String getAbsolutePath() ：返回此File的绝对路径名字符串。
        - public String getPath() ：将此File转换为路径名字符串。
        - public String getName()  ：返回由此File表示的文件或目录的名称。
        - public long length()  ：返回由此File表示的文件的长度。
 */
public class FIle类获取功能的方法 {
    public static void main(String[] args) {
geuabsolutePath();
GetPath();
GETNAME();
LENGTH();





    }

      /*
        方法一：
        public String getAbsolutePath() ：返回此File的绝对路径名字符串。
        获取的构造方法中传递的路径
        无论路径是绝对的还是相对的,getAbsolutePath方法返回的都是绝对路径
     */
    private  static void geuabsolutePath(){
        File f1 = new File("F:\\计算机\\C源代码\\1.c");
        String absolutepath1 = f1.getAbsolutePath();
        System.out.println(absolutepath1);

        File f2 = new File("1.c");
        String absolutepath2 = f2.getAbsolutePath();
        System.out.println(absolutepath2);
        System.out.println("--------------------");
    }

    /*
        方法二；
        public String getPath() ：将此File转换为路径名字符串。
        获取的构造方法中传递的路径

        toString方法调用的就是getPath方法
        源码:
            public String toString() {
                return getPath();
            }
     */
    private static void GetPath(){
        File f1 = new File("F:\\计算机\\C源代码\\1.c");
        File f2 = new File("1.c");
        String path1 =f1.getPath();
        System.out.println(path1);
        String path2 = f2.getPath();
        System.out.println(path2);
        System.out.println("--------------------");
        //传什么就是什么

    }

    /*  方法三：
        public String getName()  ：返回由此File表示的文件或目录的名称。
        获取的就是构造方法传递路径的结尾部分(文件/文件夹)
     */
    private static void GETNAME(){
        File f1 = new File("F:\\计算机\\C源代码\\1.c");
        String name1 = f1.getName();
        System.out.println(name1);


        File f2 = new File("F:\\计算机\\C源代码\\");
        String name2 = f2.getName();
        System.out.println(name2);
        System.out.println("--------------------");
    }
    /*
        方法四
        public long length()  ：返回由此File表示的文件的长度。
        获取的是构造方法指定的文件的大小,以字节为单位
        注意:
            文件夹是没有大小概念的,不能获取文件夹的大小
            如果构造方法中给出的路径不存在,那么length方法返回0
     */

    private static void LENGTH(){
        File f1 = new File("F:\\计算机\\C源代码\\1.c");
        Long l1 = f1.length();
        System.out.println(l1);//124

        File f2 = new File("C:\\develop\\a\\2.jpg");
        System.out.println(f2.length());//不存在则为0

        File f3 = new File("F:\\计算机");
        System.out.println(f3.length());//0 文件夹没有大小概念的
    }
}
