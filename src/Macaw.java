import java.awt.*;

public class Macaw extends Bird {
    private static String name;
    private static int kit = 0;
    static int maxX = 0;
    static int maxY = 0;
    static int minX = MyWindow.width + 50;
    static int minY = MyWindow.height + 50;

    Macaw(String name, int x, int y) {
        color = Color.green;
        Size = 65;
        Macaw.name = name;
        System.out.println("Я попугай " + name + "!");
        kit++;
        System.out.println("Я попугай № " + kit);
        this.x=x;
        this.y=y;
    }

    public void draw(Graphics w) {
        w.setColor(color);
        w.fillOval(x, y, Size, Size);
    }
}