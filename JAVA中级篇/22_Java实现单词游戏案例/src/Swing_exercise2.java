

import java.awt.*;			//导包
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
public class Swing_exercise2 extends JFrame {    //继承JFrame顶层框架


    JPanel jp1;        //定义面板
    JPanel jp2;      //定义面板
    JPanel jp3;     //定义面板

    JSplitPane jsp;    //定义拆分窗格
    JSplitPane jsp1;    //定义拆分窗格

    JTextArea jta1;    //定义文本域
    TextField jta2;     //定义文本域
    JTextArea jta3;     //定义文本域

    JScrollPane jspane1;    //定义滚动窗格
    JScrollPane jspane2;//定义滚动窗格
    JScrollPane jspane3;//定义滚动窗格
    //下部组件

    JButton jb2;    //定义按钮

    JLabel jla1;    //定义显示区域

    Random ran;
    private int sw; //屏幕宽度和高度
    private int sh; //屏幕宽度和高度
    private String ch;//随机单词

    public static void main(String[] args) {
        Swing_exercise2 a = new Swing_exercise2();    //显示界面

    }

    public Swing_exercise2()        //构造函数

    {
        //设置字体
        Font font = new Font("Times new roman", Font.BOLD, 30);
        Font font1 = new Font("宋体", Font.BOLD, 20);
        ran = new Random();    //创建随机数
        jp1 = new JPanel();    //创建面板
        jp2 = new JPanel();
        jp3 = new JPanel();    //创建面板

        jta1 = new JTextArea();     //创建多行文本框
        jta2 = new TextField(10);     //创建多行文本框
        jta3 = new JTextArea();    //创建多行文本框

        jta1.setLineWrap(true);    //设置多行文本框自动换行
        jta3.setLineWrap(true);    //设置多行文本框自动换行
        jta3.setText("游戏得分：");


        jspane1 = new JScrollPane(jta1);    //创建滚动窗格
        jspane2 = new JScrollPane(jta2);    //创建滚动窗格
        jspane3 = new JScrollPane(jta3);    //创建滚动窗格

        jta3.setFont(font1);                //设置字体
        jta2.setFont(font1);               //设置字体
        jta1.setFont(font);               //设置字体







        jsp = new JSplitPane(JSplitPane.VERTICAL_SPLIT, jspane1, jspane2); //创建拆分窗格
        jsp1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, jspane3, jsp); //创建拆分窗格

        //分频器布局
        jsp.setDividerLocation(900);    //设置拆分窗格分频器初始位置
        jsp.setDividerSize(10);            //设置分频器大小 jsp.setDividerLocation(700);	//设置拆分窗格分频器初始位置
        jsp1.setDividerLocation(0.5);
        jsp1.setDividerSize(10);            //设置分频器尺寸大小

        //设置调整单词显示区
        jla1 = new JLabel();
        jla1.setFont(font);//设置字体


        ch = RandomWords();
        jla1.setText(ch);
        jla1.setSize(sw, sh);
        jla1.setSize(500, 500);
        jla1.setLocation(ran.nextInt(300), ran.nextInt(200));


        //创建按钮
        jb2 = new JButton("确定");


        //设置布局管理
        jp1.setLayout(new BorderLayout());    //设置面板布局
        jp2.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp3.setLayout(new BorderLayout());


        //添加组件
        jp1.add(jsp);
        jp2.add(jb2);
        jp3.add(jsp1);
        jta1.add(jla1);

        this.add(jp1, BorderLayout.CENTER);
        this.add(jp2, BorderLayout.SOUTH);
        this.add(jp3, BorderLayout.WEST);

        //设置窗体实行
        this.setTitle("单词游戏");        //设置界面标题
        this.setExtendedState(MAXIMIZED_BOTH);//窗口最大化
        this.setLocation(1000, 200);            //设置界面初始位置
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //设置虚拟机和界面一同关闭
        this.setVisible(true);//设置界面可视化
//        this.addKeyListener(new KeyHandler());

        //设置事件监听

      /*  jta2.addTextListener(new TextListener()
        {
            @Override
            public void textValueChanged(TextEvent e) {
                String txt =jta2.getText();
                if(ch == txt)
                {
                    jta2.setFont(font);
                    ch = jla1.getText();
                    ch = RandomWords();
                    jla1.setText(ch);
                    jla1.setLocation(ran.nextInt(1200), ran.nextInt(500));
                }
            }
        });*/
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    ch = jla1.getText();
                    ch = RandomWords();
                    jla1.setText(ch);
                    jla1.setLocation(ran.nextInt(1200), ran.nextInt(500));


            }
        });



    }

    private String RandomWords() {//产生随机单词
        String[] s = {"good", "cheer", "strive", "optimistic", "hello", "word", "tercher", "student",
                "book", "genius", "handsome", "beautiful", "health", "happy", "exercice", "computer",
                "english", "jspanese", "eat", "me"};
        int b = ran.nextInt(21);//随机数区间[0,20]
        return s[b];
    }

    private void SimpleFrame() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        sw = dim.width;
        sh = dim.height;

    }
 /*   private class KeyHandler extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            Font font = new Font("Times new roman", Font.BOLD, 30);
            jla1.setFont(font);
            ch = jla1.getText();
            ch = RandomWords();
            jla1.setText(ch);
            jla1.setLocation(ran.nextInt(800), ran.nextInt(500));

        }
    }*/

}