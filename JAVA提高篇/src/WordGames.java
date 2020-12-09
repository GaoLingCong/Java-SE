import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class WordGames {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {
            SimpleFrame simp = new SimpleFrame();
            simp.initializeComponents();

        });
    }
}
class SimpleFrame extends JFrame{
    private JFrame frame;//主窗口
    private TextField tf;//文本框
    private JLabel lbchar;//显示区域
    private int sw; //屏幕宽度和高度
    private int sh; //屏幕宽度和高度
    private Random ran;//随机数
    private  JLabel jlb1;//请输入单词标签
    private String ch;


    void initializeComponents(){
        MAX();
        frame =new JFrame();
        lbchar = new JLabel();//用于短文本字符串或图像或二者的显示区
        //tf = new TextField(10);//10行文本框
        jlb1=new JLabel("请输入单词");//标签
        frame.pack();
        frame.setTitle("单词游戏");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        this.setLayout(null);//使用绝对布局，才能制定随机位置
         //    BOLD 粗体样式常量。
        //   新罗马字体Times new roman
        Font font = new Font("Times new roman", Font.BOLD, 36);
        lbchar.setFont(font);
        lbchar.setSize(500, 700);
        //整体布局
        Box box2 =  Box.createHorizontalBox();//创建一个水平箱容器用来布局
        frame.add(lbchar);
        box2.add(jlb1);
      //  box2.add(tf);
        this.add(lbchar,BorderLayout.NORTH);
        this.add(box2,BorderLayout.SOUTH);
        frame.add(box2);
        frame.setSize(sw,sh);
        ch=RandomWords();
        lbchar.setText(ch);
        lbchar.setLocation(ran.nextInt(sw - font.getSize()), ran.nextInt(sh - font.getSize() - 30));
        this.setExtendedState(MAXIMIZED_BOTH);//窗口最大化
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    void  MAX(){//获取用户屏幕宽高
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        ran = new Random();
        sw = dim.width;
        sh = dim.height;
    }
    String RandomWords(){//产生随机单词
        String[] s = {"good","cheer","strive","optimistic","hello", "word","tercher", "student",
                "book","genius","handsome","beautiful","health","happy","exercice","computer",
        "english","jspanese","eat","me"};
        int b =ran.nextInt(21);//随机数区间[0,20]
        return s[b];
    }
    private class KeyHanbler extends KeyAdapter{

        @Override
        public void keyReleased(KeyEvent e) {
            ch = lbchar.getText();
            ch=RandomWords();
            lbchar.setText(ch);
            Font font = new Font("Times new roman", Font.BOLD, 36);
            lbchar.setLocation(ran.nextInt(sw - font.getSize()), ran.nextInt(sh - font.getSize() - 30));
        }
    }



    }



