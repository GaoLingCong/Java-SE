import javax.swing.*;

public class 图形 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new 图形2();
                frame.setVisible(true);
            }
        });
    }
}
