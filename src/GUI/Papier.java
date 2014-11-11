package GUI;

import figuren.Rechteck;
import zeichnen.Zeichnung;

import java.awt.Graphics;
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
public class Papier extends JPanel implements MouseListener {

    private int x, y;

    public Papier() {
        addMouseListener(this);
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
        // Erzeugen ein neues Rechteckobjekt und speichern dieses
        // in der Zeichnung. Anschliessend alles neu zeichnen.
        Rechteck figur = new Rechteck(x, y, breite, hoehe);
        zeichnung.addFigur(figur);
        repaint();

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
