import javax.swing.*;
import java.awt.*;

public class 在组件中显示信息 {
    public static void main(String[] args) {

        EventQueue.invokeLater(()->
        {   
            var frame =  new NOtHelloWorldFrame();
            frame.setTitle("GLC Hellow World");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

        });
    }
}
    class NOtHelloWorldFrame extends JFrame
        {
            public NOtHelloWorldFrame()
            {
                add(new NotehlloWorldComponent());
                pack();
            }

        }
    class NotehlloWorldComponent extends  JComponent
    {
        public static final  int MESSAGE_x =75;
        public static final  int MESSAGE_Y =100;

        private static final int DEFAULT_WIDTH = 300;
        private static final int DEFAULT_HEIGHT =200;

        public void paintComponent(Graphics g)
        {
            g.drawString("6666666666666666666666666666",MESSAGE_x,MESSAGE_Y);
        }
        public Dimension getPreferredSize()
        {
            return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
        }

    }

