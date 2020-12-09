import javax.swing.*;
import java.awt.*;import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

public class KeyDemo extends JFrame {
    private JLabel lbChar;//用于短文本字符串或图像或二者的显示区
    private Random ran;
    private int sw,sh; //屏幕宽度和高度

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new KeyDemo();
                frame.setVisible(true);
            }
        });
    }

public KeyDemo(){
        ran = new Random();
    //创建一个新的随机数生成器
    // Toolkit:将各种组件绑定到特定本机工具包实现。
    // getDefaultToolkit(): 获取默认工具包
    // getScreenSize:获取屏幕的大小。
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    sw=dim.width;
    sh=dim.height;
    initializeComponents();
}
//键盘事件处理，继承KeyAdapter，只处理KeyReleased方法
//KeyAdapter:接收键盘事件的抽象适配器类。此类中的方法为空。此类存在的目的是方便创建侦听器对象。
//  void  keyPressed(KeyEvent e)
//    按下某个键时调用此方法
//  void  keyReleased(KeyEvent e)
//    释放某个键时调用此方法。
//  void keyTyped(KeyEvent e)
//    键入某个键时调用此方法。
    private class KeyHanbler extends KeyAdapter{
    @Override
    public void keyReleased(KeyEvent e) {
//     lbChar    用于短文本字符串或图像或二者的显示区
//       getText() 返回该标签所显示的文本字符串。
        char ch = lbChar.getText().charAt(0);
//     getKeyCode() 方法可以获取键盘的键值返回与此事件中的键关联的整数
        if(ch==e.getKeyCode()){
          midifyLabel();
        }
    }
}
private void initializeComponents(){
        this.setLayout(null);//使用绝对布局，才能制定随机位置
        lbChar = new JLabel();//用于短文本字符串或图像或二者的显示区
//        BOLD 粗体样式常量。
//     新罗马字体Times new roman
        Font font = new Font("Times new roman",Font.BOLD,36);
        lbChar.setFont(font);
        lbChar.setSize(font.getSize(),font.getSize());
        midifyLabel();
        this.add(lbChar);

     this.setTitle("键盘练习程序");
     this.setExtendedState(MAXIMIZED_BOTH);//窗口最大化
     this.setLocationRelativeTo(null);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
     this.addKeyListener(new KeyHanbler());
}
private void midifyLabel(){
    char ch = (char)(ran.nextInt(26)+0x41);//随机产生大写字母
    lbChar.setText(String.valueOf(ch));
//    lbChar.setLocation(ran.nextInt(sw - getFont().getSize()),ran.nextInt(sh- getFont().getSize()-30));
}
}
