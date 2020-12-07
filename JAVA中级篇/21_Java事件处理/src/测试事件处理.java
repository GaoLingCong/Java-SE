import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class 测试事件处理 {

TextField tf = new TextField(30);
TextField tf1 = new TextField(30);
 Button bu = new Button("确定");//事件源
 Button bu1 = new Button("取消");//事件源

 public void  init(){
//组装视图

     MyListener myListener = new MyListener();//监听器
     bu.addActionListener(myListener);//注册监听 然后监听器与按钮就有关系了

     //可以用匿名对象直接如果一个事件的话
     bu1.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             System.out.println("按钮被点击了");
             tf1.setText("如果一个按钮建议使用匿名对象");
         }
     });

    JFrame frame = new JFrame("测试");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    Box cz = Box.createVerticalBox();
    cz.add(tf);
    cz.add(bu);
    cz.add(tf1);
    cz.add(bu1);
    frame.add(cz);
    frame.pack();
    frame.setVisible(true);/**/
    frame.setLocationRelativeTo(null);


 }
 private class MyListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
             tf.setText("哈哈哈，成功了");
        }
    }


    public static void main(String[] args) {
     JFrame frame = new JFrame("测试");
new 测试事件处理().init();

    }
}
