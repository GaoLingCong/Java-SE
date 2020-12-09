package awt基本主件实现;

import javax.swing.*;
import java.awt.*;

public class BasicComponentDemo {
    Frame frame         = new Frame("测试基本组件");
    TextArea ta         = new TextArea(5,10);//文本框
   Choice colorChoice   = new Choice();//下拉选择框
    CheckboxGroup cbg   = new CheckboxGroup();//单选框
    Checkbox male       = new Checkbox("男",cbg,true);//默认勾选男
    Checkbox famale     = new Checkbox("女",cbg,false);//默认勾选男
    Checkbox isMarried  = new Checkbox("是否已婚？");
    TextField tf        = new TextField(50);//文本框
    Button ok           = new Button("确认");
    List colorList      = new List(6,true);//加个true就是多选




    public void init(){
        //组装界面


        //组装底部
        Box bBox1 = Box.createHorizontalBox();//水平箱容器
        bBox1.add(tf);//底部文本框
        bBox1.add(ok);//底部确认按钮


        frame.add(bBox1,BorderLayout.SOUTH);//把上面两个放到南，上北下南左西右东

        //组装选择部分选择部分用水平
        Box bBox2 = Box.createHorizontalBox();//水平箱容器
        colorChoice.add("红色");
        colorChoice.add("绿色");
        colorChoice.add("黑色");
        colorChoice.add("黄色");
        bBox2.add(colorChoice);
        bBox2.add(male);
        bBox2.add(famale);
        bBox2.add(isMarried);

        //选择部分加文本域垂直
        Box topleft = Box.createVerticalBox();
        topleft.add(ta);
        topleft.add(bBox2);

       //组装左边和列表框
        Box topRight = Box.createHorizontalBox();
        colorChoice.add("绿色");
        colorChoice.add("白色");
        colorChoice.add("黑色");
        topRight.add(topleft);
        topRight.add(colorList);
        frame.add(topRight);


        //设置frame为最佳大小，并且可见
       frame.pack();
        frame.setVisible(true);










    }


    public static void main(String[] args) {
        BasicComponentDemo B = new BasicComponentDemo();
        B.init();

    }



}





