import java.awt.*;

public class Bird {
    int x;
    int y;
    Color color;
    int Size = 10;

    Bird(){
        System.out.println(" Я птица! ");
    }

    public void draw(Graphics g){
        g.fillOval(x,y,Size,Size);
    }
}