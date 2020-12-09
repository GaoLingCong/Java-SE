import javax.swing.*;
import java.awt.*;import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

public class Word_games extends JFrame {
    private JLabel lbChar;//用于短文本字符串或图像或二者的显示区
    private Random ran;
    private int sw,sh; //屏幕宽度和高度

    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {
            var frame = new Word_games();
            frame.setTitle("键盘单词练习");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }

    public Word_games() {
      JLabel Bottom_input_box = new JLabel("请输入单词",JLabel.BOTTOM);//底部输入框
//        JTextField Bottom = new JTextField(10);//单词输入文本框
//        JButton Confirm = new JButton("确定");//确定按钮
//        this.getContentPane().setLayout(new BorderLayout());//设置窗体内置面板布局格式边界布局




//主体全屏框
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        sw = dim.width;
        sh = dim.height;
        this.setTitle("键盘练习程序");
        this.setExtendedState(MAXIMIZED_BOTH);//窗口最大化
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
     
    }
    }

