package GUI布局管理器;
import javax.swing.*;        //导包
import java.awt.*;
//导包
public class 网格布局 extends JFrame{        //继承JFrame类
    int size=9;
    JButton jbs[]=new JButton[size];             //创建button数组
    public static void main(String[] args) {    //主函数

        网格布局 a= new 网格布局();        //实现界面

    }

    public void 网格布局()                //构造函数
    {
        //创建组件
        for(int i=0;i<9;i++)
        {

            jbs[i]=new JButton(String.valueOf(i));
        }

        //设置网格布局
        this.setLayout(new GridLayout(3,3));        //这里设置的是3行3列，默认是1个组件1列

        //添加组件
        for(int i=0;i<9;i++)
        {
            this.add(jbs[i]);
        }

        //设置窗体属性
        this.setTitle("网格布局案例");		//设置窗体标题
        this.setSize(300, 200);				//设置窗体大小
        this.setLocation(200, 200);			//设置窗体初始位置
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	 //这个很重要！！！设置关闭窗体后虚拟机一同关闭，不设置的
        this.setVisible(true);				//设置可以显示
    }
}