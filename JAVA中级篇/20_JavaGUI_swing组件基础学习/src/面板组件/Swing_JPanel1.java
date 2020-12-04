package 面板组件;/*JPanel：面板组件，非顶层容器，默认为流式布局。
一个界面只可以有一个JFrame顶层容器，但是可以有多个JPanel面板组件，
而JPanel上也可以使用FlowLayout，BorderLayout，GridLayout等各种布局管理器，
这样可以组合使用达到较为复杂的布局效果。
面板组件可以设置布局模式，实现多模式布局，但默认为流式布局。
面板组件里可以添加其他组件。*/
import java.awt.*;        //导包
import javax.swing.*;
public class Swing_JPanel1 extends JFrame {    //继承JFrame顶层容器

    //定义组件
    JPanel jp1, jp2;        //定义面板
    JButton jb[] = new JButton[6];    //定义按钮

    public static void main(String[] args) {
        Swing_JPanel1 a = new Swing_JPanel1();    //实现界面
    }

    //构造函数
    public Swing_JPanel1() {
        //创建组件
        jp1 = new JPanel();    //创建面板
        jp2 = new JPanel();
        jb[0] = new JButton("苹果");    //创建按钮
        jb[1] = new JButton("荔枝");
        jb[2] = new JButton("葡萄");
        jb[3] = new JButton("香蕉");
        jb[4] = new JButton("草莓");
        jb[5] = new JButton("西瓜");

        //设置布局管理器（因为默认让它就是边界布局，所以不用设置）

        //添加组件，我喜欢整体到局部，也可以局部到整体
        this.add(jp1, BorderLayout.NORTH);    //把面板1添加到北部
        this.add(jb[5], BorderLayout.CENTER);    //把按钮6添加到中部
        this.add(jp2, BorderLayout.SOUTH);    //把面板2添加到南部

        jp1.add(jb[0]);        //添加面板1的按钮组件
        jp1.add(jb[1]);
        jp2.add(jb[2]);        //添加面板2的按钮组件
        jp2.add(jb[3]);
        jp2.add(jb[4]);

        //设置窗体属性
        this.setTitle("组合布局案例");        //设置窗体标题
        this.setSize(300, 200);                //设置窗体大小
        this.setLocation(200, 200);            //设置窗体初始位置
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     //这个很重要！！！设置关闭窗体后虚拟机一同关闭，不设置的
        this.setVisible(true);                //设置可以显示
    }
}