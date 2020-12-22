import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class geme extends JFrame {

    JPanel P1;
    JPanel P2;
    JPanel P3;

    JSplitPane Jsp1;
    JSplitPane Jsp2;

    JTextArea Jt1;
    TextField Jt2;

    JScrollPane Jspane01;
    JScrollPane Jsp;

    JButton j2;
    JButton j3;

    JLabel Ja1;

    Random ran;
    private int sw;  //屏幕宽度和高度
    private int sh;  //屏幕宽度和高度
    private String ch;//随机单词

    public static void main(String[] args) {
        geme a= new geme();    //显示界面
    }

    public geme()
    {
        Font font = new Font("Times new roman", Font.BOLD, 50);
        Font font2 = new Font("Times new roman", Font.BOLD, 30);

        ran = new Random();

        //创建面板
        P1 = new JPanel();
        P2 = new JPanel();
        P3 = new JPanel();

        //创建多行文本框
        Jt1 = new JTextArea();

        //创建单行文本框
        Jt2 = new TextField(10);

        //设置多行文本框自动换行
        Jt1.setLineWrap(true);

        //创建滚动窗格
        Jspane01 = new JScrollPane(Jt1);
        Jsp = new JScrollPane(Jt2);

        //设置字体样式
        Jt2.setFont(font2);
        Jt1.setFont(font);

        //创建拆分窗格
        Jsp1 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, Jspane01, Jsp);

        Jsp1.setDividerLocation(700);        //设置拆分窗格分频器初始位置
        Jsp1.setDividerSize(10);             //设置分频器大小

        //设置调整单词显示区
        Ja1 = new JLabel();
        Ja1.setFont(font);

        //初始化显示页面
        ch = RandomWords();
        Ja1.setText(ch);
        Ja1.setSize(sw, sh);
        Ja1.setSize(500, 500);
        Ja1.setLocation(ran.nextInt(300), ran.nextInt(200));

        //设置颜色
        Ja1.setForeground(Color.orange);

        //创建按钮
        j2 = new JButton("Yes");
        j3 = new JButton("Exit");

        //设置布局管理
        P1.setLayout(new BorderLayout());
        P2.setLayout(new FlowLayout(FlowLayout.CENTER));
        P3.setLayout(new BorderLayout());

        //添加组件
        P1.add(Jsp1);
        P2.add(j2);
        P2.add(j3);
        Jt1.add(Ja1);

        //初始化得分数据
        //布置整体面板布局
        this.add(P1, BorderLayout.CENTER);
        this.add(P2, BorderLayout.SOUTH);
        this.add(P3, BorderLayout.WEST);

        //设置窗体属性
        this.setTitle("单词游戏");                                    //设置界面标题
        this.setExtendedState(MAXIMIZED_BOTH);                      //窗口最大化
        this.setLocation(800, 200);                           //设置界面初始位置
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        //空格加鼠标确定事件监听
        j2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Jt2.getText().equals(ch)) {
                    Correctanswer();
                }else {
                    Ja1.setForeground(Color.red);
                    Wronganswer();
                }
            }
        });

        j3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private String RandomWords() {
        String[] s = {"public", "protected", "default", "private", "byte", "short", "int", "long",
                "float", "double", "boolean", "char", "extends", "implements", "super", "this",
                "constructor", "override", "overload", "eclipse","class","void","main","out","print"};
        int b = ran.nextInt(21);
        return s[b];
    }

    private void SimpleFrame() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        sw = dim.width;
        sh = dim.height;
    }

    private void Correctanswer(){
        Jt2.setText("");
        Ja1.setForeground(Color.cyan);

        ch = RandomWords();
        Ja1.setText(ch);

        //更改位置
        Ja1.setLocation(ran.nextInt(700), ran.nextInt(300));
    }

    //回答错误
    private void Wronganswer(){
        //改变颜色
        Ja1.setForeground(Color.red);
    }

}

