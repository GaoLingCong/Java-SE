
/*FlowLayout布局，
按照组件的添加次序将按钮组件（当然也可以是别的组件）从左到右放置在容器中。
当到达容器的边界时，组件将放置在下一行中。FlowLayout可以以左对齐，居中对齐、以右对齐的方式排列组件。*/
package GUI布局管理器;
import java.awt.*;
import javax.swing.*;
public class 流式布局FlowLayout extends JFrame{

    //定义需要的组件
    JButton jb1,jb2,jb3,jb4,jb5,jb6;

    public static void main(String[] args) {        //主函数

        流式布局FlowLayout a=new 流式布局FlowLayout();      //实现界面

    }
    public 流式布局FlowLayout()                //swing_3的构造函数
    {
        //创建组件
        jb1=new JButton("关羽");
        jb2=new JButton("张飞");
        jb3=new JButton("赵云");
        jb4=new JButton("马超");
        jb5=new JButton("黄忠");
        jb6=new JButton("魏延");

        //添加组件
        this.add(jb1);			       //流式布局是流动的，所以可以直接添加
        this.add(jb2);
        this.add(jb3);
        this.add(jb4);
        this.add(jb5);
        this.add(jb6);

        //设置布局管理器
        this.setLayout(new FlowLayout());	//如果你不设置的话，JFrame默认的是BorderLayout边界布局管理器

        //设置窗体
        this.setTitle("流式布局案例");		//设置窗体标题
        this.setSize(300, 200);				//设置窗体大小
        this.setLocation(200, 200);			//设置窗体初始位置
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	 //这个很重要！！！设置关闭窗体后虚拟机一同关闭，不设置的
        this.setVisible(true);				//设置可以显示
    }
}