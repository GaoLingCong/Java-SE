import javax.swing.*;
import java.awt.*;

public class  图形2 extends JFrame {
    public 图形2() {
        initializeComponents();
    }

    private void initializeComponents() {
        this.setTitle("基本窗口");
        this.setSize(400,300);
        this.setBackground(Color.red);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
