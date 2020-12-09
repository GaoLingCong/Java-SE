import java.io.File;
import java.io.IOException;

/*
    File类创建删除功能的方法
        - public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
        - public boolean delete() ：删除由此File表示的文件或目录。
        - public boolean mkdir() ：创建由此File表示的目录。
        - public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目录。
 */
public class File类创建删除功能的方法 {
    public static void main(String[] args) throws IOException {
        CREATENEWFILE();
       // MKDIR();
        Del();

    }
    /*
      方法三
      public boolean delete() ：删除由此File表示的文件或目录。
      此方法,可以删除构造方法路径中给出的文件/文件夹
      返回值:布尔值
          true:文件/文件夹删除成功,返回true
          false:文件夹中有内容,不会删除返回false;构造方法中路径不存在false
      注意:
          delete方法是直接在硬盘删除文件/文件夹,不走回收站,删除要谨慎
   */

    private static void  Del()
    {
        File f1 = new File("F:\\计算机\\C源代码\\200");
        boolean b1 = f1.delete();
        System.out.println(b1);

        File f2 = new File("F:\\计算机\\C源代码\\22\\323\\444\\55");
        boolean b2 = f2.delete();
        System.out.println(b2);

        File f4 = new File("F:\\计算机\\C源代码\\22");
        boolean b4 = f4.delete();
        System.out.println(b4);

        File f3 = new File("F:\\计算机\\C源代码\\abc.txt");
        boolean b3 = f3.delete();
        System.out.println(b3);

    }    /*
       方法二
       public boolean mkdir() ：创建单级空文件夹
       public boolean mkdirs() ：既可以创建单级空文件夹,也可以创建多级文件夹
       创建文件夹的路径和名称在构造方法中给出(构造方法的参数)
        返回值:布尔值
            true:文件夹不存在,创建文件夹,返回true
            false:文件夹存在,不会创建,返回false;构造方法中给出的路径不存在返回false
        注意:
            1.此方法只能创建文件夹,不能创建文件
     */
    private static void MKDIR(){
        File f1 =new File("F:\\计算机\\C源代码\\200");
        boolean b1 = f1.mkdir();
        System.out.println("b1"+b1);

        File f2 = new File("F:\\计算机\\C源代码\\22\\323\\444\\55");
        boolean b2 = f2.mkdirs();
        System.out.println("b2"+b2);

        File f3 = new File("F:\\计算机\\C源代码\\abc.txt");
        boolean b3 = f2.mkdirs();
        System.out.println("b3"+b3);

        File f4 = new File("F:\\计算\\abc.txt");
        boolean b4 = f4.mkdirs();
        System.out.println("b4"+b4);
        System.out.println("-----------");

    }



     /*
        方法一:
        public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
        创建文件的路径和名称在构造方法中给出(构造方法的参数)
        返回值:布尔值
            true:文件不存在,创建文件,返回true
            false:文件存在,不会创建,返回false
        注意:
            1.此方法只能创建文件,不能创建文件夹
            2.创建文件的路径必须存在,否则会抛出异常

        public boolean createNewFile() throws IOException
        createNewFile声明抛出了IOException,我们调用这个方法,就必须的处理这个异常,要么throws,要么trycatch
     */
    private static void CREATENEWFILE() throws IOException {
        File f1 = new File("F:\\计算机\\C源代码\\200.txt");
        boolean b1 = f1.createNewFile();
        System.out.println("b1"+b1);

        File f2 = new File("F:\\计算机\\C源代码\\2.txt");
        System.out.println(f2.createNewFile());

        File f3 =new File("F:\\计算机\\C源代码\\3.txt");
        System.out.println(f3.createNewFile());
        System.out.println("---------");

      /*  File f4 =new File("F:\\计算机\\C源代\\2.txt");//路径不存在,抛出IOException
        System.out.println(f4.createNewFile());
*/
    }
}
