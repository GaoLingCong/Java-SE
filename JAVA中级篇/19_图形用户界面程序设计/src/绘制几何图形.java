import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class 绘制几何图形 {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->
                {
                var frame = new DrawFrame();
                frame.setTitle("绘制几何图形");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);

    });
        //上面这几个照写
}
static class DrawFrame extends JFrame
{
    public DrawFrame()
    {
        add(new DrawComponent());//DrawComponent()只要应用的某个部分需要重新绘制，就会自动调用这个方法
        pack();//调整窗口大小
    }

    }
}
class DrawComponent extends JComponent//JComponent：组件    DrawComponent：画的组成
{
    private  static final int DEFAUlT_WIDTH = 400;    //宽度和高度
    private  static final int DEFAULT_WEIGHT = 400;

    public void paintComponent(Graphics g)//paintComponent会自动接收一个Graphics2D类对象只需使用一个类型强制转换
    {
        var g2 = (Graphics2D) g;//需要获得Graphics2D类的一个对象是Graphics的子类
        //画出一个矩形
        double leftX = 100;
        double topY  = 100;
        double width =200;
        double height =150;
        var rect = new Rectangle2D.Double(leftX,topY,width,height);//Rectangle2D.Double：double数值的矩形加它的属性

        //也可以使用三色的分量来 红绿蓝 0-255
        g2.setPaint(new Color(0,128,128));//设置上下文绘制的属性
        g2.drawString("66666",75,125);
        g2.fill(rect);//fill用当前颜料填充图形
        //画出封闭的椭圆

        var ellipse = new Ellipse2D.Double();
        ellipse.setFrame(rect);
        //要想修改颜色只需加在图形里面g2.setPaint(Color.red);在把下面draw替换为fill
        g2.setPaint(Color.red);
        g2.fill(ellipse);

        //画出一条直线

        g2.draw(new Line2D.Double(leftX,topY,leftX+width,topY+height) );
        //用同样的圆心画一个圆
        double centerX = rect.getCenterX();
        double centerY = rect.getCenterY();
        double radius = 150;
        var circle = new Ellipse2D.Double();
        circle.setFrameFromCenter(centerX,centerY,centerX+radius,centerY+radius);
        //也可以使用三色的分量来 红绿蓝 0-255
        g2.draw(circle);

        //要想设置背景颜色 使用Component类中的setBacnkGround方法 Component类是JComponent类的祖先
        /*
        var component = new MyComponent();
        component.setBacnkground(Color.PINK);

        setForegrounD方法，用来指定在组件上绘制时使用的默认颜色

        */
    }
    public Dimension getPreferredSize()
    {
        return  new Dimension(DEFAUlT_WIDTH,DEFAULT_WEIGHT);
    }
}
