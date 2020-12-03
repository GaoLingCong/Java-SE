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
    private char ch;
    private char[] chs;


/*
创建一个新的随机数生成器
Toolkit:将各种组件绑定到特定本机工具包实现。
 getDefaultToolkit(): 获取默认工具包
getScreenSize:获取屏幕的大小。
 */
    public SimpleFrame() {
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

            ch = lbChar.getText().charAt(0);
            if (ch == e.getKeyCode()) {
                ch = (char) (ran.nextInt(26) + 0x41);//随机产生大写字母`65
                lbChar.setText(String.valueOf(ch));
                Font font = new Font("Times new roman", Font.BOLD, 36);
                lbChar.setLocation(ran.nextInt(sw - font.getSize()), ran.nextInt(sh - font.getSize() - 30));
            }
        }
    }


    private void initializeComponents() {
        this.setLayout(null);//使用绝对布局，才能制定随机位置
        lbChar = new JLabel();//用于短文本字符串或图像或二者的显示区
//     BOLD 粗体样式常量。
//   新罗马字体Times new roman
        Font font = new Font("Times new roman", Font.BOLD, 36);
        lbChar.setFont(font);
        lbChar.setSize(font.getSize(), font.getSize());
        ch = (char) (ran.nextInt(26) + 0x41);//随机产生大写字母`

        lbChar.setText(String.valueOf(ch));
        lbChar.setLocation(ran.nextInt(sw - font.getSize()), ran.nextInt(sh - font.getSize() - 30));
        this.add(lbChar);
        this.setExtendedState(MAXIMIZED_BOTH);//窗口最大化
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.addKeyListener(new KeyHanbler());
    }

}


