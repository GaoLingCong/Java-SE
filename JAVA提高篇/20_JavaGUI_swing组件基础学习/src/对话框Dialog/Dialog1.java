package 对话框Dialog;
/*public void setBounds(int x,
int y,
int width,
int height)移动并调整此组件的大小。 左上角的新位置由x和y ，新尺寸由width和height 。
该方法更改布局相关信息，因此使组件层次结构无效。

参数
x - 这个组件的新的 x -coordinate
y - 这个组件的新 y-坐标
width -新 width这个组件的
height -新 height这个组件的
*/
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dialog1 {
    public static void main(String[] args) {
        Frame frame = new Frame("对话框练习");
//创建两个对话框，一个模式的，一个非模式
        Dialog d1 = new Dialog(frame,"模式对话框",true);
        Dialog d2 = new Dialog(frame,"非模式对话框",true);
//通过setBounds方法设置Dialog位置大小
        d1.setBounds(20,30,300,200);
        d2.setBounds(20,30,300,200);

//创建两个按钮
        Button b1 = new Button("打开模式对话框");
        Button b2 = new Button("打开非模式对话框");
//给两个按钮加事件
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d1.setVisible(true);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d2.setVisible(true);
            }
        });
//把按钮添加到frame
        frame.add(b1,BorderLayout.NORTH);
        frame.add(b2);
        frame.pack();
        frame.setVisible(true);


    }
}
