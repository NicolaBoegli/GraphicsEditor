package figuren;

import java.awt.*;

/**
 * Created by vmadmin on 19.08.2014.
 */

public abstract class Figur {

    int x;
    int y;
    double umfang;
    double flaeche;

    public void move(int dx, int dy){
        x = dx;
        y = dy;
    }

    public abstract void zeichne(Graphics g);

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
