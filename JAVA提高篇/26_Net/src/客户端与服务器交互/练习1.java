package 客户端与服务器交互;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*   1.创建一个客户端对象Socket,构造方法绑定服务器的IP地址和端口号
        2.使用Socket对象中的方法getOutputStream()获取网络字节输出流OutputStream对象
        3.使用网络字节输出流OutputStream对象中的方法write,给服务器发送数据
        4.使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
        5.使用网络字节输入流InputStream对象中的方法read,读取服务器回写的数据
        6.释放资源(Socket)
            输出就是发送的意思 用write发送getOutputStream()
        输入就是接收的意思 用read来接收getInputStream()*/


public class 练习1 {
    public static void main(String[] args)  throws IOException {
        Socket socket = new Socket("127.0.0.1",8888);
        OutputStream os = socket.getOutputStream();
        os.write("哈哈哈哈".getBytes());
        InputStream IS  = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = IS.read(bytes);
        System.out.println(new String(bytes,0,len));

        socket.close();


    }
}
