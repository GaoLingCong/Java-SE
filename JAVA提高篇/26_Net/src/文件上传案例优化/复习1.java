package 文件上传案例优化;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/*
    文件上传案例服务器端:读取客户端上传的文件,保存到服务器的硬盘,给客户端回写"上传成功"

    明确:
        数据源:客户端上传的文件
        目的地:服务器的硬盘 d:\\upload\\1.jpg

    实现步骤:
        1.创建一个服务器ServerSocket对象,和系统要指定的端口号
        2.使用ServerSocket对象中的方法accept,获取到请求的客户端Socket对象
        3.使用Socket对象中的方法getInputStream,获取到网络字节输入流InputStream对象
        4.判断d:\\upload文件夹是否存在,不存在则创建
        5.创建一个本地字节输出流FileOutputStream对象,构造方法中绑定要输出的目的地
        6.使用网络字节输入流InputStream对象中的方法read,读取客户端上传的文件
        7.使用本地字节输出流FileOutputStream对象中的方法write,把读取到的文件保存到服务器的硬盘上
        8.使用Socket对象中的方法getOutputStream,获取到网络字节输出流OutputStream对象
        9.使用网络字节输出流OutputStream对象中的方法write,给客户端回写"上传成功"
        10.释放资源(FileOutputStream,Socket,ServerSocket)

         输出就是发送的意思 用write发送getOutputStream()
        输入就是接收的意思 用read来接收getInputStream()


         isFile()：判断是否是文件，也可能是文件或者目录
         exists()：判断该文件是否存在

         mkdir() 创建此抽象路径名指定的目录。只能在已经存在的目录中创建文件夹
          mkdirs() 创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。可以创建多级目录




        */
public class 复习1 {
    public static void main(String[] args) throws IOException {
        ServerSocket server  = new ServerSocket(8888);

        while (true){
            Socket socket = server.accept();
          new Thread(new Runnable() {
              @Override
              public void run() {
                  try{
                      InputStream is = socket.getInputStream();
                      File file = new File("G:\\666");
//                      isFile()：判断是否是文件，也可能是文件或者目录
//                      exists()：判断该文件是否存在
                      if (!file.exists()){
                          file.mkdirs();
                      }

                      String fileName = "高"+System.currentTimeMillis()+new Random().nextInt(9999)+".jpg";
                      FileOutputStream fos = new FileOutputStream(file+"\\"+fileName);

                      int len = 0 ;
                      byte[] bytes = new byte[1024];
                      while ((len = is.read(bytes))!=-1){
                          fos.write(bytes,0,len);
                      }
                      socket.getOutputStream().write("上传成功！".getBytes());
                      fos.close();
                      socket.close();

                  }catch (IOException e){
                      System.out.println(e);
                  }
              }
          }).start();

        }


    }
}
