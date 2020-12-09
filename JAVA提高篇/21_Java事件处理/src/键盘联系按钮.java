import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class 键盘联系按钮 {
    public static void main(String[] args) {
        JFrame frame =new JFrame("hello world");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(300,400);
        JButton jButton1 = new JButton("空格联系按钮");
        frame.add(jButton1);
        jButton1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.getExtendedKeyCodeForChar(KeyEvent.VK_SPACE)){
                    System.exit(0);
                }
            }
        });

    }
}
