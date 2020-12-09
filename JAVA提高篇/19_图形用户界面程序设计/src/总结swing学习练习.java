import java.awt.*;        //导包
import javax.swing.*;

public class 总结swing学习练习 extends JFrame {//继承JFrame顶层容器
    //定义组件
    JPanel 面板1;
    JPanel 面板2;
    JPanel 面板3;
    JPanel 面板4;
    JButton 按钮1;
    JButton 按钮2;
    JButton 按钮3;
    JCheckBox 多选框1,多选框2,多选框3;
    JRadioButton 单选框1;
    JRadioButton 单选框2;
    JTextField 文本框1;
    JLabel 标签1;
    JLabel 标签2;
    JLabel 标签3;
    JComboBox 下拉框1;
    JScrollPane 滚动窗条;
    JList 列表框1;
    ButtonGroup bg;//按钮组（注意这个不是组件，它是个作用域，我只是把它定义在这里而已）男女

    public static void main(String[] args) {
        总结swing学习练习 B = new 总结swing学习练习();
    }

    //构造函数
    public 总结swing学习练习(){
        //创建组件
        面板1 = new JPanel();//创建面板
        面板2 = new JPanel();//创建面板
        面板3 = new JPanel();
        面板4 = new JPanel();
        按钮1 = new JButton("确定");
        按钮2 = new JButton("注册");
        按钮3 = new JButton("取消");
        标签1 = new JLabel("请输入单词");
        标签2 = new JLabel("你累了吗？");
        标签3 = new JLabel("你想干嘛？");
        多选框1 = new JCheckBox("我好累我不想做了");
        多选框2 = new JCheckBox("我相信我可以");
        多选框3 = new JCheckBox("我想继续睡觉打游戏");
        单选框1 = new JRadioButton("只管向前");
        单选框1 = new JRadioButton("玩物丧志");

        String []ct = {"七天都完成不了？","今天起那么晚？","看来你就是个废物","天天无所事事"};
        下拉框1 = new JComboBox(ct);
        String []ca = {"废物","你怎么懒","还想成功","天天爱睡觉","比你厉害的人还在努力"};
        列表框1 = new JList(ca);
        列表框1.setVisibleRowCount(4);
        滚动窗条=new JScrollPane(列表框1);


        bg = new ButtonGroup();
        文本框1 = new JTextField(10);
        //创建文本框 10是能输入的字符个数
        //设置布局管理器（因为默认让它就是边界布局，所以不用设置）
        this.setLayout(new GridLayout(5,1));

        //添加组件，我喜欢整体到局部，也可以局部到整体
        this.add(面板1);
        this.add(面板2);
        this.add(面板3);
        this.add(面板4);
        面板1.add(按钮1);
        面板2.add(标签1);
        面板2.add(文本框1);
        面板3.add(标签2);
        面板3.add(多选框1);
        面板3.add(多选框2);
        面板3.add(多选框3);
        面板4.add(单选框1);
 //       面板4.add(单选框2);
        面板4.add(按钮2);
        面板4.add(按钮3);
        面板4.add(标签3);
        bg.add(单选框1);
        bg.add(单选框2);
        面板2.add(下拉框1);
        面板2.add(列表框1);
        面板2.add(滚动窗条);





        //设置窗体属性
        this.setTitle("练习最近所学Swing");//标题
        this.setSize(400,500);//设置窗口大小
        this.setLocation(200,200);//设置窗体初始位置
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置和虚拟机一样的关闭界面
        this.setVisible(true);//设置可以显示











    }
}
