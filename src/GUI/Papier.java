package GUI;

import figuren.Figur;
import figuren.Kreis;
import figuren.Linie;
import figuren.Rechteck;
import zeichnen.Zeichnung;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

/**
 * Papier ist eine von JPanel abgeleitete Swing-Komponente.
 * - Sie dient als "Zeichenblatt" f�r Zeichnungen.
 * - Sie speichert die Zeichnung in einer Instanzvariablen.
 * - Sie �berschreibt die Methode paintComponent der Klasse JPanel
 *   so, dass bei ihrem Aufruf die Zeichnung auf das Papier gezeichnet
 *   wird.
 * 
 * @author Andres Scheidegger
 */
@SuppressWarnings("serial")
public class Papier extends JPanel implements MouseListener, KeyListener {

    private int x, y;
    private int currentTool;

    public Papier() {
        addMouseListener(this);
        addKeyListener(this);
        this.setFocusable(true);
    }

    /**
	 * Die Zeichnung.
	 */
	private Zeichnung zeichnung;
	
	/**
	 * Die Methode paintComponent zeichnet die Zeichnung auf das Papier.
	 * Sie erh�lt dazu ein Graphics-Objekt, welches sie an die Zeichnung
	 * weitergibt.
	 * 
	 * @param g  Graphics-Objekt, welches zum zeichnen verwendet werden soll.
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	public void paintComponent(final Graphics g) {
    super.paintComponent(g);
		if (zeichnung != null) zeichnung.zeichneFiguren(g);
	}
	
	/**
	 * Setter f�r die Instanzvariable zeichnung.
	 * 
	 * @param zeichnung Die zu zeichnende Zeichnung.
	 */
	public void setZeichnung(final Zeichnung zeichnung) {
		this.zeichnung = zeichnung;
	}

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Bestimmen Breite und Hoehe des neuen Rechtecks
        int breite = e.getX() - x;
        int hoehe = e.getY() - y;
        int originalX = x;
        int originalY = y;
        System.out.println(e.getX());
        System.out.println(x);

        if(e.getX() < x) {
            breite = x - e.getX();
            x = e.getX();
        }
        if(e.getY() < y){
            hoehe = y - e.getY();
            y = e.getY();
        }

        // Erzeugen ein neues Rechteckobjekt und speichern dieses
        // in der Zeichnung. Anschliessend alles neu zeichnen.

        Figur figur;

        switch (currentTool){
            case 75:
                figur = new Kreis(breite, hoehe, x, y);
                break;
            case 76:
                figur = new Linie(originalX, originalY, e.getX(), e.getY());
                break;
            default:
                figur = new Rechteck(breite, hoehe, x, y);
        }
        zeichnung.addFigur(figur);
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //r = 82, k = 75, l = 76
        currentTool = e.getKeyCode();

    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
