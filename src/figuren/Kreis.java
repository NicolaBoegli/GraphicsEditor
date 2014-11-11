package figuren;

import handler.FileHandler;

import javax.xml.bind.annotation.XmlElement;
import java.awt.*;
import java.util.List;

/**
 * Created by vmadmin on 19.08.2014.
 */

public class Kreis extends Figur implements calcInterface {

    private int radius;

    public Kreis() {
        super();
    }

    public Kreis(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void zeichne(Graphics g){
        g.drawOval(this.getX(), this.getY(), this.getRadius(), this.getRadius());
    }

    public double calcUmfang(){
        return radius * 3.141;
    }

    public double calcFlaeche(){
        return 2*radius * 3.141;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

}
