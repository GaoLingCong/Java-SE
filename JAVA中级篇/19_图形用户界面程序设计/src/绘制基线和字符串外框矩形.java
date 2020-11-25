import javax.swing.*;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class 绘制基线和字符串外框矩形 {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->
                {
                    var frame = new FontFrame();
                    frame.setTitle("Fonttest");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);


                });
    }
}
class FontFrame extends JFrame
{
    public FontFrame()
    {
        add(new FontComponent());
        pack();

    }
}
class FontComponent extends  JComponent
{
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;
    public void painComponent(Graphics g)
    {
        var g2 = (Graphics2D) g;
        var message = "Hello,World";
        var f = new Font("Serif",Font.BOLD,36);
        g2.setFont(f);

        FontRenderContext context = g2.getFontRenderContext();
        Rectangle2D bounds = f.getStringBounds(message,context);

        double x = (getWidth()-bounds.getWidth())/2;
        double y = (getHeight()-bounds.getHeight())/2;
        double ascent = -bounds.getY();
        double basey = y+ascent;


        g2.drawString(message,(int)x,(int)basey);
        g2.setPaint(Color.LIGHT_GRAY);

        g2.draw(new Line2D.Double(x,basey,x+bounds.getWidth(),basey));

        var rect = new Rectangle2D.Double(x,y,bounds.getWidth(),bounds.getHeight());
        g2.draw(rect);

    }
    public Dimension getPreferredSize(){
        return  new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }

}
