package GUI布局管理器;
/*概念：组件在容器（比如JFrame）中的位置和大小是由布局管理器来决定的。所以的容器都会使用一个布局管理器，通过它来自动进行组件的布局管理。
种类：Java共提供了五种布局管理器：流式布局管理器（FlowLayout）、边界布局管理器（BorderLayout）、网格布局管理器（GridLayout）、卡片布局管理器（CardLayout）、网格包布局管理器（GridBagLayout）。其中前三种是最常见的布局管理器。
边界布局介绍：
边界布局将容器简单的划分为东南西北中五个区域，中间区域最大。

JFrame窗体，JDialog对话框组件默认布局方法。*/

import javax.swing.*;    //导入swing包
import java.awt.*;       //导入awt包
public class 边界布局 extends JFrame {    //在类中继承JFrame顶级容器类（容器就是用来添加组件的，可以理解为一整个界面就是一个容器）

    //定义组件
    JButton jb1, jb2, jb3, jb4, jb5;

    public static void main(String[] args) {    //主函数
        边界布局 a = new 边界布局();            //创建界面
    }

    public 边界布局()            //创建swing_2类的构造函数，在构造函数中用this调用JFrame的方法，因为继承了
    {
        //创建组件
        jb1 = new JButton("中部");
        jb2 = new JButton("北部");
        jb3 = new JButton("东部");
        jb4 = new JButton("南部");
        jb5 = new JButton("西部");

        //添加组件
        this.add(jb1, BorderLayout.CENTER);  //中      //注意！！！！必须标明添加位置才行，不然全部按中部添加！！
        this.add(jb2, BorderLayout.NORTH);//北
        this.add(jb3, BorderLayout.EAST);//东部
        this.add(jb4, BorderLayout.SOUTH);//南部
        this.add(jb5, BorderLayout.WEST);//西部

        //设置窗体
        this.setTitle("边界布局案例");    //设置窗体标题
        this.setSize(300, 200);          //设置窗体大小
        this.setLocation(200, 200);      //设置窗体初始位置
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //这个很重要！！！设置关闭窗体后虚拟机一同关闭，不设置的话，关闭窗体虚拟机不关闭，一直占用内存。
        this.setVisible(true);           //设置可以显示
    }
}