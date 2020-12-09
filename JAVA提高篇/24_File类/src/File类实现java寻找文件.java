import java.io.File;

public class File类实现java寻找文件 {
    public static void main(String[] args) {
        File file = new File("F:\\JavaWeb\\JavaWeb");
        getAllFile(file);
    }
    public static void getAllFile(File dir){
//        public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
//        遍历构造方法中给出的目录,会获取目录中所有的文件/文件夹,把文件/文件夹封装为File对象,多个File对象存储到File数组中
        File [] files = dir.listFiles();
        for (File f:files){
            //对遍历得到的File对象f进行判断,判断是否是文件夹
            if (f.isDirectory()) {
                //f是一个文件夹,则继续遍历这个文件夹
                //我们发现getAllFile方法就是传递文件夹,遍历文件夹的方法
                //所以直接调用getAllFile方法即可:递归(自己调用自己)
                getAllFile(f);
            }else {

               /* 1.把File对象f,转为字符串对象
                String name = f.getName();//abc.java

                2.
                把字符串,转换为小写
                s = s.toLowerCase();


                3.调用String类中的方法endsWith判断字符串是否是以.java结尾
                boolean b = s.endsWith(".java");

                4.如果是以.java结尾的文件,则输出
                if(b){
                    System.out.println(f);
                }*/
                if(f.getName().toLowerCase().endsWith(".java"));
                System.out.println(f);
            }
        }
    }

}
