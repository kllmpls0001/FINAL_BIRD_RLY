import java.awt.*;

class Sparrow extends Bird {
    private static String name;
    private static int kat = 0;
    static int maxX = 0;
    static int maxY = 0;
    static int minX = MyWindow.width+50;
    static int minY = MyWindow.height+50;


    Sparrow(String name, int x, int y) {
        color = Color.red;
        Size = 30;
        Sparrow.name = name;
        System.out.println("Я воробей " + name + "!");
        kat++;
        System.out.println("Я воробей № " + kat);
        this.x=x;
        this.y=y;
    }
}