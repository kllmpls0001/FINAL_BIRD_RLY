import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
class Flock {
    private ArrayList<Bird> flock;
    void draw(Graphics g){
        int k = 100;
        int ff = 100;
        g.setColor(Color.CYAN);
        g.drawRect(k, ff, 500, 500);
        for(int p=0; p< flock.size();p++){
            flock.get(p).draw(g);
            if (Macaw.maxX!=0 && Macaw.maxY!=0) {
                g.setColor(Color.green);
                g.drawRect(Macaw.minX, Macaw.minY, Macaw.maxX - Macaw.minX + 65, Macaw.maxY - Macaw.minY + 65);
            }
            if (Penguin.maxX!=0 && Penguin.maxY!=0) {
                g.setColor(Color.black);
                g.drawRect(Penguin.minX, Penguin.minY, Penguin.maxX - Penguin.minX + 100, Penguin.maxY - Penguin.minY + 100);
            }
            if (Sparrow.maxX!=0 && Sparrow.maxY!=0) {
                g.setColor(Color.red);
                g.drawRect(Sparrow.minX, Sparrow.minY, Sparrow.maxX - Sparrow.minX + 30, Sparrow.maxY - Sparrow.minY + 30);
            }
        }
    }
    Flock(int n){
        flock=new ArrayList<>(n);
        int otstyp = 20;
        Scanner s=new Scanner(System.in);
        int x,y;
        int k = 100;
        int ff = 100;
        int kk = k + 500;
        int fff = ff + 500;
        int num = 0;
        System.out.println("1 - name Macow, 2 - name Penguin, 3 - Sparrow, 4 - exit");
        for (int p=0; ;p++ ){
            System.out.println("1 or 2 or 3 or 4");
            p = s.nextInt();
            do {
                x = (int)((Math.random() * (MyWindow.width-4*otstyp))+otstyp);
                y = (int)((Math.random() * (MyWindow.height-4*otstyp))+otstyp);
            } while (localXY(x, y));
            if (p==1) {
                flock.add(new Macaw((ID.nameMacaw.id[(int)(( Math.random() * 6))]),x,y));
                if(Macaw.maxX < x) Macaw.maxX = x;
                if(Macaw.maxY < y) Macaw.maxY = y;
                if(Macaw.minX > x) Macaw.minX = x;
                if(Macaw.minY > y) Macaw.minY = y;
                if (x>k && (x+65)<kk && y>ff && (y+65)<fff) num++;
            }
            if (p==2) {
                flock.add(new Penguin((ID.namePenguin.id[(int)(( Math.random() * 6))]),x,y));
                if(Penguin.maxX<x) Penguin.maxX=x;
                if(Penguin.maxY<y) Penguin.maxY=y;
                if(Penguin.minX>x) Penguin.minX=x;
                if(Penguin.minY>y) Penguin.minY=y;
                if (x>k && (x+100)<kk && y>ff && (y+100)<fff) num++;
            }
            if (p==3){
                flock.add(new Sparrow((ID.nameSparrow.id[(int)(( Math.random() * 6))]),x,y));
                if(Sparrow.maxX<x) Sparrow.maxX=x;
                if(Sparrow.maxY<y) Sparrow.maxY=y;
                if(Sparrow.minX>x) Sparrow.minX=x;
                if(Sparrow.minY>y) Sparrow.minY=y;
                if (x>k && (x+30)<kk && y>ff && (y+30)<fff) num++;
            }
            if (p==4){
                break;
            }
        }
            System.out.println("Количество птиц в клетке: " + num);
    }


    private boolean localXY(int x, int y){
        for (int p = 0; p < flock.size(); p++) {
            if(x >= flock.get(p).x  && x <= flock.get(p).x  && y >= flock.get(p).y  && y <= flock.get(p).y ) return true;
        }
        return false;
    }
}