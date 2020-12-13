

import java.awt.*;			//导包
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
public class Swing_exercise2 extends JFrame {    //继承JFrame顶层框架

    //定义面板
    JPanel jp1;
    JPanel jp2;
    JPanel jp3;

    //定义拆分窗格
    JSplitPane jsp;
    JSplitPane jsp1;

    //定义文本域
    JTextArea jta1;
    TextField jta2;
    JTextArea jta3;

    //定义滚动窗格
    JScrollPane jspane1;
    JScrollPane jspane2;
    JScrollPane jspane3;


    //定义按钮
    JButton jb2;
    JButton jb3;
    JButton jb1;

    //定义菜单组件
    JMenuBar jmb;//主菜单栏
    JMenu jm1,jm2,jm3,jm4,jm5,jm6;;//菜单
    JMenuItem jmi1,jmi2,jmi3,jmi4,jmi5,jmi6,jmi7,jmi8,jmi9;



    //定义显示区域
    JLabel jla1;

    //定义随机函数
    Random ran;
    private String ch;//随机单词
    private int sw;  //屏幕宽度和高度
    private int sh;  //屏幕宽度和高度
    private int  Fen;//记录分数
    private int  z;//记录正确题数
    private int  x;//记录错误题数
    private int  sun;//记录总题数

    public static void main(String[] args) {
        Swing_exercise2 a = new Swing_exercise2();    //显示界面
    }

    public Swing_exercise2()        //构造函数
    {
        //字体初始化 Times new roman：罗马字样 加粗
        Font font = new Font("Times new roman", Font.BOLD, 50);
        Font font2 = new Font("Times new roman", Font.BOLD, 30);
        Font font1 = new Font("宋体", Font.BOLD, 20);
        Font font4 = new Font("宋体", Font.BOLD, 70);


        //创建随机函数
        ran = new Random();

        //创建面板
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();

        //创建多行文本框
        jta1 = new JTextArea();
        jta3 = new JTextArea();

        //创建单行文本框
        jta2 = new TextField(16);

        //设置多行文本框自动换行
        jta1.setLineWrap(true);
        jta3.setLineWrap(true);


        //创建滚动窗格
        jspane1 = new JScrollPane(jta1);
        jspane2 = new JScrollPane(jta2);
        jspane3 = new JScrollPane(jta3);

        //菜单栏属性设置
        //主菜单栏
        jmb = new JMenuBar();
        jm1 = new JMenu("设置");
        jm2 = new JMenu("属性");
        jm3 = new JMenu("查看");
        jm4 = new JMenu("游戏难度");
        jm5 = new JMenu("单词颜色");
        jm6 = new JMenu("单词大小");
        jmi1 = new JMenuItem("英语单词");
        jmi3 = new JMenuItem("英语句子");
        jmi2 = new JMenuItem("汉字成语");
        jmi4 = new JMenuItem("黑色");
        jmi5 = new JMenuItem("绿色");
        jmi6 = new JMenuItem("粉色");
        jmi7 = new JMenuItem("一号");
        jmi8 = new JMenuItem("二号");
        jmi9 = new JMenuItem("三号");
        //主菜单添加组件
        jmb.add(jm1);
        jmb.add(jm2);
        jmb.add(jm3);
        //设置栏
        jm1.add(jm4);
        jm1.add(jm5);
        jm1.add(jm6);
        //游戏难度栏
        jm4.addSeparator();
        jm4.add(jmi1);
        jm4.add(jmi2);
        jm4.add(jmi3);
        //单词颜色栏
        jm5.addSeparator();
        jm5.add(jmi4);
        jm5.add(jmi5);
        jm5.add(jmi6);
        //单词大小栏
         jm6.addSeparator();
        jm6.add(jmi7);
        jm6.add(jmi8);
        jm6.add(jmi9);



        //设置字体样式
        jta3.setFont(font1);
        jta2.setFont(font2);
        jta1.setFont(font);


        //创建拆分窗格
        jsp = new JSplitPane(JSplitPane.VERTICAL_SPLIT, jspane1, jspane2);
        jsp1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, jspane3, jsp);

        //分频器布局
        jsp.setDividerLocation(700);        //设置拆分窗格分频器初始位置
        jsp.setDividerSize(10);             //设置分频器大小
        jsp1.setDividerLocation(0.5);       //设置拆分窗格分频器初始位置
        jsp1.setDividerSize(10);            //设置分频器大小

        //设置调整单词显示区
        jla1 = new JLabel();
        jla1.setFont(font);

        //初始化显示页面
        ch = RandomWordsA();
        jla1.setText(ch);
        jta3.setText("欢迎加入单词游戏         游戏规则答对+5分答错-2分");
        jla1.setSize(sw, sh);
        jla1.setSize(500, 500);
        jla1.setLocation(ran.nextInt(300), ran.nextInt(200));

        //设置颜色
        jla1.setForeground(Color.green);


        //创建按钮
        jb2 = new JButton("确定");
        jb3 = new JButton("退出");
        jb1 = new JButton("重置");


        //设置布局管理
        jp1.setLayout(new BorderLayout());
        jp2.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp3.setLayout(new BorderLayout());


        //添加组件
        jp1.add(jsp);
        jp2.add(jb2);
        jp2.add(jb1);
        jp2.add(jb3);
        jp3.add(jsp1);
        jta1.add(jla1);


        //初始化得分数据
        Fen=0;
        z=0;
        x=0;
        sun=0;


        //布置整体面板布局
        this.add(jp1, BorderLayout.CENTER);
        this.add(jp2, BorderLayout.SOUTH);
        this.add(jp3, BorderLayout.WEST);

        //设置菜单布局
        this.add(jmb,BorderLayout.NORTH);

        //设置窗体属性
        this.setTitle("单词游戏");                                    //设置界面标题
        this.setExtendedState(MAXIMIZED_BOTH);                      //窗口最大化
        this.setLocation(1000, 200);                           //设置界面初始位置
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       //设置虚拟机和界面一同关闭
        this.setVisible(true);                                     //设置界面可视化

        //事件监听处理

        //空格加鼠标确定事件监听
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (jta2.getText().equals(ch)) {
                    Correctanswer();

                }else {
                    jla1.setForeground(Color.red);
                    Wronganswer();

                }
            }
        });
        //退出按钮事件监听
        jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        //重置按钮事件监听
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta1.setFont(font4);
                Reset();
            }
        });
        //菜单栏黑色监听
        jmi4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jla1.setForeground(Color.black);

            }
        });
        //菜单栏绿色监听
        jmi5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jla1.setForeground(Color.green);

            }
        });
        //菜单栏粉色监听
        jmi6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jla1.setForeground(Color.magenta);

            }
        });
        //一号字体大小监听
        jmi7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font font = new Font("Times new roman", Font.BOLD, 70);
                jla1.setFont(font);

            }
        });
        //二号字体大小监听
        jmi8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font font = new Font("Times new roman", Font.BOLD, 50);
                jla1.setFont(font);

            }
        });
        //三号字体大小监听
        jmi9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Font font = new Font("Times new roman", Font.BOLD, 30);
                jla1.setFont(font);

            }
        });

        //备选空格事件处理
        /*jb2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.getExtendedKeyCodeForChar(KeyEvent.VK_SPACE)){
                    if (jta2.getText().equals(ch)) {
                        z=z+1;
                        Fen=Fen+5;
                        sun=x+z;
                        jta3.setText("回答正确    " +
                                "     得分+5         "+"  作答情况"+""+"正确："+z+" "+"错误："
                                +x+" 总答题:"+sun+"         总得分为  "+Fen+"        " +
                                "      不要骄傲");
                        ch = RandomWords();
                        jla1.setText(ch);
                        jla1.setLocation(ran.nextInt(300), ran.nextInt(500));
                    }else {
                        Fen=Fen-2;
                        x+=1;
                        sun=x+z;
                        jta3.setText("回答错误    " +
                                "     得分-2         "+"  作答情况"+""+"正确："+z+" "+"错误："
                                +x+" 总答题:"+sun+"         总得分为  "+Fen+"        " +
                                "      再接再厉");
                    }

                }
            }
        });*/
    }

    //随机产生英语单词
    private String RandomWordsA() {
        String[] s = {"good", "cheer", "strive", "jpg", "hello", "word", "tercher", "student",
                "book", "genius", "blue", "beautiful", "health", "happy", "yellow", "computer",
                "english", "reset", "eat", "me","green"};
        int b = ran.nextInt(21);//定义随机数区间[0,20]
        return s[b];
    }
    //随机产生英语句子
    private String RandomWordsB() {
        String[] s = {"Heelo word","How much","what is the name","Where are you from","Where are you going","Active learning","Are you happy"};
        int b = ran.nextInt(6);//定义随机数区间[0,6]
        return s[b];
    }
    //随机产生汉字成语
    private String RandomWordsC() {
        String[] s = {"天道酬勤","厚德载物","居安思危","坚持不懈","海纳百川","上善若水"};
        int b = ran.nextInt(5);//定义随机数区间[0,6]
        return s[b];
    }
    //随机产生汉字句子
    private String RandomWordsD() {
        String[] s = {"志当存高远。","知者乐水，仁者乐山。","读书破万卷，下笔如有神。","一寸光阴一寸金","我命由我不由天","初九潜龙勿用"};
        int b = ran.nextInt(5);//定义随机数区间[0,20]
        return s[b];
    }



    //获取用户屏幕大小
    private void SimpleFrame() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        sw = dim.width;
        sh = dim.height;
    }

    //回答正确
    private void Correctanswer(){
        //初始化数据
        z=z+1;
        Fen=Fen+5;
        sun=x+z;

        //初始化文本
        jta1.setText("");
        jta2.setText("");
        jta3.setText("回答正确    " +
                "     得分+5         "+"          作答情况 "+""+"正确："+z+" "+"错误:"
                +x+"   总答题:"+sun+"         总得分为  "+Fen+"        " +
                "      不要骄傲");


        //改变颜色
       jla1.setForeground(Color.green);
        jta3.setForeground(Color.blue);

        //产生单词
        ch = RandomWordsA();
        jla1.setText(ch);

        //更改位置
        jla1.setLocation(ran.nextInt(700), ran.nextInt(300));

    }

    //回答错误
    private void Wronganswer(){
        //修改数据
        Fen=Fen-2;
        if(Fen<0){
            Fen=0;
        }
        x+=1;
        sun=x+z;

        //初始化文本
        jta1.setText("");
        jta2.setText("");
        jta3.setText("回答错误    " +
                "     得分-2         "+"          作答情况 "+""+"正确："+z+" "+"错误:"
                +x+"   总答题:"+sun+"         总得分为  "+Fen+"        " +
                "      再接再厉");

        //改变颜色
        jla1.setForeground(Color.red);
        jta3.setForeground(Color.red);


    }

    //重置按钮
    private void Reset(){
        //修改数据
        z=0;
        sun=0;
        x=0;
        Fen=0;

        //初始化文本
        ch=RandomWordsA();
        jla1.setText(ch);
        jta1.setText("重新开始，继续努力");
        jta2.setText("");
        jta3.setText("重新答题    " +
                "             "+"作答情况"+""+"正确：0"+" "+"错误：0"
                +" 总答题:0"+"         总得分为 0 "+"        " +
                "              不忘初心 继续前行");

        //改变颜色
        jta3.setForeground(Color.GRAY);
        jta1.setForeground(Color.CYAN);
        jla1.setForeground(Color.green);


    }
}