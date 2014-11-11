package figuren;


import java.awt.*;
/**
 * Created by vmadmin on 19.08.2014.
 */


public class Rechteck extends Figur implements calcInterface {

    private int width;
    private int height;

    public Rechteck() {
        super();
    }

    public Rechteck(int width, int height, int x, int y) {
        super();
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    @Override
    public void zeichne(Graphics g){
        g.drawRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }

    public double calcUmfang(){
        return (2 * height) + (2 * width);
    }

    public double calcFlaeche(){
        return height * width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}
