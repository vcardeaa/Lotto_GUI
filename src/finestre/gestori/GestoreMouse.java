package src.finestre.gestori;

import src.finestre.UtilFinestra;

import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Classe per la gestione dei movimenti del mouse
 * sui pulsanti.
 * 
 * @author Vincenzo Cardea
 * @author Francesco Rizzello
 * @author Matteo De Vito
 * @author Alessandro Serio
 * 
 * @since 1.1.0
 */
public class GestoreMouse extends MouseAdapter {

    private JButton jb = new JButton();

    /**
     * Costruttore
     * 
     * @param jb sul quale gestire il cursore
     */
    public GestoreMouse(JButton jb) {
        this.jb = jb;
    }

    /**
     * Invocato quando il pulsante è stato premuto
     * (premuto e rilasciato)
     * 
     * @param e evento del mouse
     */
    public void mouseClicked(MouseEvent e) {

    }

    /**
     * Invocato quando il mouse preme sul pulsante e poi
     * viene trascinato
     * 
     * @param e evento del mouse
     */
    public void mouseDragged(MouseEvent e) {

    }

    /**
     * Invocato quando il cursore del mouse si posiziona
     * al di sopra di un pulsante
     * 
     * @param e evento del mouse
     */
    public void mouseEntered(MouseEvent e) {
        jb.setBackground(UtilFinestra.BLUCHIARO);
    }

    /**
     * Invocato quando il cursore del mouse non è più
     * al di sopra di un pulsante
     * 
     * @param e evento del mouse
     */
    public void mouseExited(MouseEvent e) {
        jb.setBackground(UtilFinestra.BIANCO);
    }

    /**
     * Invocato quando il cursore è stato spostato
     * su un componente, ma nessun pulsante è stato premuto
     * 
     * @param e evento del mouse
     */
    public void mouseMoved(MouseEvent e) {
        
    }
    
    /**
     * Invocato quando un pulsante viene premuto
     * 
     * @param e evento del mouse
     */
    public void mousePressed(MouseEvent e) {
        
    }

    /**
     * Invocato quando un pulsante viene rilasciato
     * 
     * @param e evento del mouse
     */
    public void mouseReleased(MouseEvent e) {

    }

    /**
     * Invocato quando la rotellina del pulsante viene
     * ruotata
     * 
     * @param e evento del mouse
     */
    public void mouseWheelMoved(MouseEvent e) {

    }
}