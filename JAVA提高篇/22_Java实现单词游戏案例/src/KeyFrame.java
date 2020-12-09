import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;


public class KeyFrame {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {
            var frame = new SimpleFrame();
            frame.setTitle("键盘单词练习");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}


class SimpleFrame extends JFrame {
    private JLabel lbChar;//用于短文本字符串或图像或二者的显示区
    private Random ran;
    private int sw; //屏幕宽度和高度
    private int sh; //屏幕宽度和高度
    private String ch;





    public SimpleFrame() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        ran = new Random();
        sw = dim.width;
        sh = dim.height;
        initializeComponents();
    }

    private class KeyHanbler extends KeyAdapter {
        @Override
        public void keyReleased(KeyEvent e) {
         Font font = new Font("Times new roman", Font.BOLD, 30);
         lbChar.setFont(font);
        ch = lbChar.getText();
        ch = RandomWords();
        lbChar.setText(String.valueOf(ch));
        lbChar.setLocation(ran.nextInt(300), ran.nextInt(300));
        }
    }


    private void initializeComponents() {
        this.setLayout(null);//使用绝对布局，才能制定随机位置
        lbChar = new JLabel();//用于短文本字符串或图像或二者的显示区

//      BOLD 粗体样式常量。
//      新罗马字体Times new roman

        Font font = new Font("Times new roman", Font.BOLD, 30);
        lbChar.setFont(font);
        lbChar.setSize(300, 300);
        ch =RandomWords();
        lbChar.setText(ch);
        lbChar.setLocation(ran.nextInt(300), ran.nextInt(300));

        this.add(lbChar);
//        this.setExtendedState(MAXIMIZED_BOTH);//窗口最大化
        this.setSize(1000,1000);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


   private String RandomWords(){//产生随机单词
        String[] s = {"good","cheer","strive","optimistic","hello", "word","tercher", "student",
        "book","genius","handsome","beautiful","health","happy","exercice","computer",
        "english","jspanese","eat","me"};
        int b =ran.nextInt(21);//随机数区间[0,20]
        return s[b];
    }

}


