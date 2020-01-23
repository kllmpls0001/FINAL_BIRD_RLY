import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    static int width =1600;
    static int height =1000;
    private Flock f;
    MyWindow(Flock f){
        this.f = f;
        this.setSize(width,height);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Window");
    }
    @Override
    public void paint(Graphics g){
        this.setSize(width,height);
        f.draw(g);
    }
}