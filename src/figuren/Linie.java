package figuren;

import handler.FileHandler;

import java.awt.*;
import java.util.List;


public class Linie extends Figur {

    private int lenght;

    public Linie() {
        super();
    }

    public Linie(int lenght, int x, int y) {
        super();
        this.lenght = lenght;
        this.x = x;
        this.y = y;
    }

    @Override
    public void zeichne(Graphics g){
        g.drawLine(this.getX(), this.getX(), this.getY(), this.getY());
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

}
