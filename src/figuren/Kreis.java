package figuren;

import java.awt.*;

/**
 * Created by vmadmin on 19.08.2014.
 */

public class Kreis extends Figur {

    private int breite;
    private int hoehe;

    public Kreis() {
        super();
    }

    public Kreis(int breite,int hoehe, int x, int y) {
        this.breite = breite;
        this.hoehe = hoehe;
        this.x = x;
        this.y = y;
    }

    @Override
    public void zeichne(Graphics g){
        g.drawOval(this.getX(), this.getY(), this.breite, this.hoehe);
    }

    /*public double calcUmfang(){
        return radius * 3.141;
    }

    public double calcFlaeche(){
        return 2*radius * 3.141;
    }
        */


}
