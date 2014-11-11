package zeichnen;

import GUI.Papier;
import figuren.Figur;
import figuren.Kreis;
import figuren.Linie;
import figuren.Rechteck;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vmadmin on 21.10.2014.
 */
public class Zeichnung {

    List<Figur> figuren = new ArrayList<Figur>();

    public Zeichnung(List<Figur> figuren) {
        this.figuren = figuren;
    }

    public void zeichneFiguren(Graphics g) {
        for (Figur figur : figuren) {
            figur.zeichne(g);
        }

    }
}
