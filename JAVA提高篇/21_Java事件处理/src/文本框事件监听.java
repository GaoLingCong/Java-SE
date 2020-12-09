import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//-Dfile.encoding=gbk
public class 文本框事件监听 {


    public static void main(String[] args) {
        Frame Frame = new Frame("文本框监听");
        //创建组件（事件源）
        TextField tf = new TextField(30);//文本框
        Choice ch =  new Choice();//下拉框
        ch.add("高灵聪");
        ch.add("大帅哥");
        ch.add("小帅哥");

        //给文本域TextField添加监听内容的变化
        tf.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent e) {
               String text =  tf.getText();
                System.out.println("当前文本框的内容为"+text);
            }
        });
        //给下拉框选择器添加ItemListener,监听条目选项的变化
        ch.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
             Object item =  e.getItem();
                System.out.println("当前选中的条目为"+item);
            }
        });
        //给frame注册ContainListener监听器，监听容器中组件的添加
       Frame.addContainerListener(new ContainerListener() {
           @Override
           public void componentAdded(ContainerEvent e) {
               Component chi = e.getChild();
               System.out.println("frame中添加了："+chi);
           }

           @Override
           public void componentRemoved(ContainerEvent e) {
                Component chi1 = e.getChild();
               System.out.println("当前删除的东西是"+chi1);
           }
       });

        Box box1 = Box.createHorizontalBox();
        box1.add(ch);
        box1.add(tf);
        Frame.add(box1);
        Frame.pack();
        Frame.setVisible(true);

    }


}


