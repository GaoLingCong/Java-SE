import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class 监听Window关闭按钮 {
    public static void main(String[] args) {
        Frame frame = new Frame("这次测试WindowListent");
        frame.setBounds(200,200,500,300);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println(" 用户选择退出");
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }
}
