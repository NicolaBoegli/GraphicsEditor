package figuren;

import java.awt.*;
import java.util.List;


public class Linie extends Figur {

    private int x2;
    private int y2;


    public Linie() {
        super();
    }

    public Linie(int x, int y, int x2, int y2) {
        super();
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void zeichne(Graphics g){
        g.drawLine(this.x, this.y, this.x2, this.y2);
    }
/*

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
*/

}
