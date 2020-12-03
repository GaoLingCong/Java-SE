import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Scanner;


public class 键盘单词练习 {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {
            SimpleFrames frame;
            frame = new SimpleFrames();
            frame.setTitle("键盘单词练习");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭形式
            frame.setVisible(true);
        });
    }
}



class SimpleFrames extends JFrame {
    private JLabel lbChar;//用于短文本字符串或图像或二者的显示区
    private Random ran;
    private int sw; //屏幕宽度和高度
    private int sh; //屏幕宽度和高度
     private     String ch;
     private     String ce;
     private     char cw;

    /*
    创建一个新的随机数生成器
    Toolkit:将各种组件绑定到特定本机工具包实现。
     getDefaultToolkit(): 获取默认工具包
    getScreenSize:获取屏幕的大小。
     */
    public SimpleFrames() {


      Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        ran = new Random();
        sw = dim.width;
       sh = dim.height;
        initializeComponents();
    }

    /*
    键盘事件处理，继承KeyAdapter，只处理KeyReleased方法
    KeyAdapter:接收键盘事件的抽象适配器类。此类中的方法为空。此类存在的目的是方便创建侦听器对象。
    void  keyPressed(KeyEvent e)
    按下某个键时调用此方法
    void  keyReleased(KeyEvent e)
    释放某个键时调用此方法。
    void keyTyped(KeyEvent e)
    键入某个键时调用此方法。
    */
    private class KeyHanbler extends KeyAdapter {
        @Override
        public void keyReleased(KeyEvent e) {
           Scanner sc = new Scanner(System.in);
              ch=sc.next();
             cw = e.getKeyChar();
             ce=String.valueOf(cw);

            if(ch==ce)
            {
                String a = randomWord();
                lbChar.setText(a);
                Font font = new Font("Times new roman", Font.BOLD, 30);
//              设置坐标
                lbChar.setLocation(ran.nextInt( 500), ran.nextInt( 500));
            }


            }
        }

    private void initializeComponents() {

        this.setLayout(null);//使用绝对布局，才能制定随机位置
        lbChar = new JLabel();//用于短文本字符串或图像或二者的显示区
//     BOLD 粗体样式常量。
//   新罗马字体Times new roman
        Font font = new Font("Times new roman", Font.BOLD, 30);
        lbChar.setFont(font);
        lbChar.setSize(500, 500);
        String S = randomWord();
        lbChar.setText(S);
        lbChar.setLocation(ran.nextInt(500), ran.nextInt(500));
        this.add(lbChar);
        this.setSize(sw,sh);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.addKeyListener(new KeyHanbler());
    }
    private  String randomWord() {
        int length = 2 + (int) (Math.random() * 9);
        String word = "";
        for (int i = 0; i < length; i++) {
            word += (char) randomChar();
        }
        return word;
    }

    private byte randomChar() {
        int flag = (int) (Math.random() * 2);// 0小写字母1大写字母
        byte resultBt;
        if (flag == 0) {
            byte bt = (byte) (Math.random() * 26);// 0 <= bt < 26
            resultBt = (byte) (65 + bt);
        } else {
            byte bt = (byte) (Math.random() * 26);// 0 <= bt < 26
            resultBt = (byte) (97 + bt);
        }
        return resultBt;
    }



}


