import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

public class 定时代码 {
    public static void main(String[] args) {

        var listener = new TimePrinter();
        var timer = new Timer(1000,listener);
        timer.start();

        JOptionPane.showMessageDialog(null,"Ouit progrm?");
        System.exit(0);


    }
}
class TimePrinter implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent event) {
         System.out.println("At the tome,the time is"+ Instant.ofEpochMilli(event.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}

