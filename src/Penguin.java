import java.awt.*;

public class Penguin extends Bird {
    private static String name;
    private static int kot = 0;
    static int maxX = 0;
    static int maxY = 0;
    static int minX = MyWindow.width+50;
    static int minY = MyWindow.height+50;

    Penguin(String name, int x, int y) {
        color = Color.black;
        Size = 100;
        Penguin.name = name;
        System.out.println("Я пингвин " + name + "!");
        kot++;
        System.out.println("Я пингвин № " + kot);
        this.x=x;
        this.y=y;
    }

    public void draw(Graphics w){
        w.setColor(color);
        w.fillOval(x,y,Size,Size);
        w.setColor(Color.yellow);
        w.fillOval(x+20,y+20,10,10);
    }
}