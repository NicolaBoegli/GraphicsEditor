import GUI.Papier;
import GUI.Zeichenbrett;
import figuren.Figur;
import figuren.Kreis;
import figuren.Linie;
import figuren.Rechteck;
import handler.FigurHandler;
import handler.FileHandler;
import zeichnen.Zeichnung;

import javax.xml.bind.JAXBException;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vmadmin on 19.08.2014.
 */
public class Test {

    public static void main(String[] args) throws JAXBException {

        List<Figur> list = new ArrayList<Figur>();

        Kreis k1 = new Kreis(10, 50, 50);
        Rechteck r1 = new Rechteck(12, 7, 100, 150);
        Linie l1 = new Linie(65, 164, 19);

        /*System.out.println(k1.getRadius());
        System.out.println(k1.calcFlaeche());
        System.out.println(r1.calcUmfang());
        System.out.println(l1.getLenght());*/

        list.add(k1);
        list.add(r1);
        list.add(l1);

        Zeichenbrett zb = new Zeichenbrett();
        Zeichnung z = new Zeichnung(list);

        zb.zeige(z);

    }


}
