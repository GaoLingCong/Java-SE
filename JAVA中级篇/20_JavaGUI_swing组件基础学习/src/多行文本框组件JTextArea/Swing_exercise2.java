package 多行文本框组件JTextArea;
/*文本框JTextField是单行输入，而多行文本框（JTextArea）可以实现多行输入。
* 看到上部占了大部分空间，决定使用边界布局。

下部的最下部很像边界布局的SOUTH部分，在这部分中有两种组件，一种按钮组件JButton，一种下拉列表JComboBox，并且采用流式布局的右对齐。

上部采用拆分窗格将两个多行文本框放在窗格两侧*/
import java.awt.*;			//导包
import javax.swing.*;
public class Swing_exercise2 extends JFrame {	//继承JFrame顶层框架

    //定义组件
    //上部组件
    JPanel jp1;		//定义面板
    JSplitPane jsp;	//定义拆分窗格
    JTextArea jta1;	//定义文本域
    JScrollPane jspane1;	//定义滚动窗格
    JTextArea jta2;//定义文本域
    JScrollPane jspane2;//定义滚动窗格
    //下部组件
    JPanel jp2;//定义面板
    JButton jb1,jb2;	//定义按钮
    JComboBox jcb1;		//定义下拉框

    public static void main(String[] args)  {
        Swing_exercise2 a=new Swing_exercise2();	//显示界面
    }
    public Swing_exercise2()		//构造函数
    {
        //创建组件
        //上部组件
        jp1=new JPanel();	//创建面板
        jta1=new JTextArea();	//创建多行文本框
        jta1.setLineWrap(true);	//设置多行文本框自动换行
        jspane1=new JScrollPane(jta1);	//创建滚动窗格
        jta2=new JTextArea();//创建多行文本框
        jta2.setLineWrap(true);//设置多行文本框自动换行
        jspane2=new JScrollPane(jta2);//创建滚动窗格
        jsp=new JSplitPane(JSplitPane.VERTICAL_SPLIT,jspane1,jspane2); //创建拆分窗格
        jsp.setDividerLocation(200);	//设置拆分窗格分频器初始位置
        jsp.setDividerSize(1);			//设置分频器大小
        //下部组件
        jp2=new JPanel();
        jb1=new JButton("返回");		//创建按钮
        jb2=new JButton("发送");
        String [] name= {"周卫国","白子画","陆雪琪","金正恩","本·拉登"};
        jcb1=new JComboBox(name);	//创建下拉框

        //设置布局管理
        jp1.setLayout(new BorderLayout());	//设置面板布局
        jp2.setLayout(new FlowLayout(FlowLayout.RIGHT));

        //添加组件
        jp1.add(jsp);
        jp2.add(jcb1);
        jp2.add(jb1);
        jp2.add(jb2);

        this.add(jp1,BorderLayout.CENTER);
        this.add(jp2,BorderLayout.SOUTH);

        //设置窗体实行
        this.setTitle("聊天界面");		//设置界面标题
        this.setIconImage(new ImageIcon("image/qq.gif").getImage());    //设置标题图片，就是上面的小企鹅
        this.setSize(400, 350);				//设置界面像素
        this.setLocation(200, 200);			//设置界面初始位置
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//设置虚拟机和界面一同关闭
        this.setVisible(true);				//设置界面可视化
    }
}