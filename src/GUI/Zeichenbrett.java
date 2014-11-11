package GUI;

import zeichnen.Zeichnung;

import javax.swing.JFrame;

/**
 * Die Klasse Zeichenbrett erm�glicht die Darstellung von Zeichnungen.
 * Sie �ffnet ein Fenster auf dem Desktop, welches als einzige Komponente
 * ein Papierobjekt enth�lt.
 * 
 * @author Andres Scheidegger
 */
@SuppressWarnings("serial")
public class Zeichenbrett extends JFrame{

	/**
	 * Das Papier, auf welchem gezeichnet wird.
	 */
	private final Papier papier = new Papier();
	
	/**
	 * Konstruktor.
	 * Setzt den Titel, Ort, Gr�sse und Verhalten beim Schliessen
	 * des Zeichenbretts. Erzeugt ein Papierobjekt und f�gt dieses
	 * in das Zeichnbrett ein. Zeigt das Zeichenbrett auf dem Desktop an.
	 */
	public Zeichenbrett() {
		super("Zeichenbrett f�r Figuren");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setLocation(200, 200);
		setContentPane(papier);
		setVisible(true);
	}
	
	/**
	 * Zeigt eine Zeichnung auf dem Zeichenbrett an, indem die Zeichnung
	 * auf das Papier "gesetzt" wird.
	 * 
	 * @param zeichnung Die zu zeigende Zeichnung.
	 */
	public void zeige(Zeichnung zeichnung) {
		papier.setZeichnung(zeichnung);
		// Aufruf von repaint() bewirkt, dass das Fenster des Zeichenbrett
		// auf dem Dektop neu aufgebaut wird.
		repaint();
	}
}
