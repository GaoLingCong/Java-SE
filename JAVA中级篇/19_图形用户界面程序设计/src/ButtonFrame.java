import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame extends JFrame {
    //设置边框
    private JPanel buttonPannel;
    private static final  int DEFAULT_WIDTH = 300;
    private static final  int DEFAULT_HEIGHT = 400;

    public ButtonFrame()
    {
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);

        //创建按钮
        var yellowButton = new JButton("Yellow");
        var blueButton   = new JButton("Blue");
        var redButton    = new JButton("Red");
        var blackButton  = new JButton("black");
        var greenButton  = new JButton("green");
        var WhiteButton  = new JButton("white");
        var magentaButton =new JButton("magenta");



        buttonPannel =  new JPanel();//创建按钮面板

        buttonPannel.add(yellowButton);
        buttonPannel.add(blueButton);
        buttonPannel.add(redButton);
        buttonPannel.add(blackButton);
        buttonPannel.add(greenButton);
        buttonPannel.add(WhiteButton);
        buttonPannel.add(magentaButton);

        //添加面板到frme
        add(buttonPannel);

        //创建按钮操作

        var yellowAction = new ColorAction(Color.yellow);
        var blueAction = new ColorAction(Color.BLUE);
        var redAction = new ColorAction(Color.RED);
        var blackAction = new ColorAction(Color.black);
        var greenAction =new ColorAction(Color.GREEN);
        var whiteAction = new ColorAction(Color.WHITE);
        var magentAction = new ColorAction(Color.MAGENTA);


        //将操作与按钮关联
        yellowButton.addActionListener(yellowAction);
        blueButton.addActionListener(blueAction);
        redButton.addActionListener(redAction);
        blackButton.addActionListener(blackAction);
        greenButton.addActionListener(greenAction);
        WhiteButton.addActionListener(whiteAction);
        magentaButton.addActionListener(magentAction);

    }
    //将面板的背景颜色设置为指定颜色，所以把需的颜色存储在监听器类
    private class ColorAction implements ActionListener
    {

        private Color backgroundColor;//背景颜色对象
        public ColorAction(Color c) //背景为参数
        {
            backgroundColor = c;//改变参数
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            //接收一个ActionEvent类型的对象作为参数，这个事件对象包含所发生事件的相关信息
            buttonPannel.setBackground(backgroundColor);
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(()->
        {
            var frame = new ButtonFrame();//改成按钮对象
            frame.setTitle("变色");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

        });


    }
}


