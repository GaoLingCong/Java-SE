package 拆分窗格JSpliPane;
/*
拆分窗格必须填满每个拆分区，不填满会报错。
        在每个拆分区里还可以继续拆分。
        拆分窗格可以设置是否展开收起。
        拆分窗格的分频器可以设置初始位置和大小。
*/


import java.awt.*;
import javax.swing.*;
public class Swing_exercise1 extends JFrame {    //继承JFrame顶层容器类
    //定义组件
    //容器组件
    JSplitPane jsp1;    //定义拆分窗格
    //左部组件
    JList jlist1;    //定义列表框
    JScrollPane jspane;     //定义滚动窗格
    //右组件
    JLabel jlb1;        //定义标签

    public static void main(String[] args) {    //主函数
        Swing_exercise1 a = new Swing_exercise1();    //显示界面
    }

    public Swing_exercise1()    //构造函数
    {
        //创建组件
        //左部组件
        String[] words = {"friction", "freelance", "fraud", "franchise", "framework", "fragrant", "fragment",
                "fragile", "fracture", "fountain", "foul", "fossil", "forwoard", "fortunate", "fornight", "forthcoming",
                "formidable", "formation", "forest", "fore", "foam"};
        jlist1 = new JList(words);//把单词转进列表框里面
        jspane = new JScrollPane(jlist1);//定义滚动表格
        //右组件
        jlb1 = new JLabel(new ImageIcon("image/dictionary.gif"));
        //建议在工程里新建一个文件夹存图，斜杠前面的是文件夹名，后面的是图片名
        //添加到容器类组件拆分窗格中


//        ！！！！！
        jsp1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, jspane, jlb1);
        //设置水平拆分，添加左边组件，添加右边组件
        //设置布局

        //添加组件
        this.add(jsp1);

        //设置窗体实行
        this.setTitle("词典");        //设置界面标题
        this.setSize(400, 350);                //设置界面像素
        this.setLocation(200, 200);            //设置界面初始位置
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //设置虚拟机和界面一同关闭
        this.setVisible(true);                //设置界面可视化
    }
}