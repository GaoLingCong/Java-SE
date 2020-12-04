import javax.swing.*;    //导包
import java.awt.*;
public class 单词游戏 extends JFrame {    //继承JFrame顶层容器类

    //定义组件
    JPanel jp1,jp2,jp3;    //定义面板
    JTextField jtf1;        //定义文本框
    JLabel jlb1;        //定义标签
    JButton jb1,jb2;
    private int sw; //屏幕宽度和高度
    private int sh; //屏幕宽度和高度//定义按钮

    public static void main(String[] args) {    //主函数
        单词游戏 a= new 单词游戏();    //显示界面

    }

    public 单词游戏(){
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();//获取用户界面
        sw = dim.width;
        sh = dim.height;

        //创建组件
        jp1=new JPanel();    //创建三个面板
        jp2=new JPanel();
        jp3=new JPanel();
        jlb1=new JLabel("输入单词");    //创建两个标签
        jb1=new JButton("确定");    //创建两个按钮
        jb2=new JButton("取消");
        jtf1=new JTextField(10);     //创建文本框
        //设置布局管理器

        //添加组件
        this.add(jp1);    //添加面板
        this.add(jp2);
        this.add(jp3);
        jp1.add(jlb1);    //添加面板1的标签和文本框
        jp1.add(jtf1);      //文本框
        jp3.add(jb1);    //添加面板3的按钮
        jp3.add(jb2);   //添加面板3的按钮
        //设置窗口属性
        this.setTitle("单词练习小游戏");    //创建界面标题
        this.setSize(sw, sh);        //设置界面像素
//        this.setLocation(100,100);    //设置界面初始位置
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //设置界面和虚拟机一起关闭
        this.setVisible(true);    //设置界面可显示


    }



    }
