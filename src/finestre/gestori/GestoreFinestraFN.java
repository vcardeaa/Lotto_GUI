package src.finestre.gestori;

import javax.swing.JFrame;

import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;


/**
 * Classe per la gestione della chiusura
 * del programma
 * 
 * @author Vincenzo Cardea
 * @author Francesco Rizzello
 * @author Matteo De Vito
 * @author Alessandro Serio
 * 
 * @since 1.0.0
 */
public class GestoreFinestraFN implements WindowListener {
	private JFrame jf = new JFrame();

	/**
	 * Costruttore.
	 * 
	 * @param jf jframe della finestra
	 */
	public GestoreFinestraFN(JFrame jf) {
		this.jf = jf;
	}

	/**
	 * Riduce a icona la finestra
	 * 
	 * @param we evento verificatosi
	 */
	public void windowIconified(WindowEvent we) {
	}

	/**
	 * Ripristina la finestra
	 * 
	 * @param we evento verificatosi
	 */
	public void windowDeiconified(WindowEvent we) {
	}

	/**
	 * Finestra attivata
	 * 
	 * @param we evento verificatosi
	 */
	public void windowActivated(WindowEvent we) {
	}

	/**
	 * Finestra disattivata
	 * 
	 * @param we evento verificatosi
	 */
	public void windowDeactivated(WindowEvent we) {
	}

	/**
	 * Finestra aperta
	 * 
	 * @param we evento verificatosi
	 */
	public void windowOpened(WindowEvent we) {
	}

	/**
	 * Finestra chiusa
	 * 
	 * @param we evento verificatosi
	 */
	public void windowClosed(WindowEvent we) {
	}

	/**
	 * Finestra in chiusura
	 * 
	 * @param we evento verificatosi
	 */
	public void windowClosing(WindowEvent we) {
		jf.dispose();
        System.exit(0);
	}
}