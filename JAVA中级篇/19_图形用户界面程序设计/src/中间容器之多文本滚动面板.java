import javax.swing.*;
@SuppressWarnings("serial")
public class 中间容器之多文本滚动面板 extends  JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                        JFrame frame = new 中间容器之多文本滚动面板();
                        frame.setVisible(true);
            }
        });
    }
    public 中间容器之多文本滚动面板() {
        initializeComporents();

    }
    private void initializeComporents(){
        JScrollPane spane  = new JScrollPane();//带滚动的面板
        spane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);//垂直
        spane.setVerticalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);//按需出现

        JTextArea txt = new JTextArea();//多行文本组件
        spane.setViewportView(txt);

        this.add(spane);
        this.setTitle("滚动面板演示");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);//居中
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
