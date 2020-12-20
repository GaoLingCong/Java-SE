package 客户端与服务器交互;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*  服务器的实现步骤:
        1.创建服务器ServerSocket对象和系统要指定的端口号
        2.使用ServerSocket对象中的方法accept,获取到请求的客户端对象Socket
        3.使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
        4.使用网络字节输入流InputStream对象中的方法read,读取客户端发送的数据
        5.使用Socket对象中的方法getOutputStream()获取网络字节输出流OutputStream对象
        6.使用网络字节输出流OutputStream对象中的方法write,给客户端回写数据
        7.释放资源(Socket,ServerSocket)

        输出就是发送的意思 用write发送getOutputStream()
        输入就是接收的意思 用read来接收getInputStream()*/
public class 练习2 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        InputStream IS = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = IS.read(bytes);
        System.out.println(new String(bytes,0,len));
        OutputStream OS = socket.getOutputStream();
        OS.write("收到谢谢".getBytes());
        socket.close();
        serverSocket.close();
    }
}
