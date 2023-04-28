package src.finestre;

import src.finestre.gestori.GestoreFinestraFN;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {

    private class GestorePulsante implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            username = jtfUsername.getText().replaceAll(" ", "");
            if (!isUsernameValid(username)) {
                JOptionPane.showMessageDialog(jf,
                    "Lo username deve essere di almeno 5 caratteri [A-Za-z0-9_]",
                    "Attenzione",
                    JOptionPane.WARNING_MESSAGE);
                    jtfUsername.setText("");
            } else {
                // Apre la finestra del menu principale
                Menu m = new Menu(jtfUsername.getText());
                jf.dispose();
            }
        }
    }

    private final byte PANELS = 3;
    
    private String username = new String();
    private JFrame jf = new JFrame(UtilitiesFinestra.TITOLO);
    private JPanel[] jp = new JPanel[PANELS];
    private JLabel jlTitolo = new JLabel("LOGIN", JLabel.CENTER);
    private JLabel jlUsername = new JLabel("Username ", JLabel.CENTER);
    private JButton jbLogin = new JButton("Login");
    private JTextField jtfUsername = new JTextField(15);

    public Login() {
        jlTitolo.setFont(new Font("Sans-Serif", Font.BOLD, 24));
        jlUsername.setFont(new Font("Sans-Serif", Font.BOLD, 16));
        jtfUsername.setFont(new Font("Sans-Serif", Font.PLAIN, 16));

        for (int i = 0; i < PANELS; i++) {
            jp[i] = new JPanel();
        }

        jp[1].setLayout(new GridBagLayout());

        jp[0].add(jlTitolo);
        jp[1].add(jlUsername);
        jp[1].add(jtfUsername);
        jp[2].add(jbLogin);
        
        jbLogin.addActionListener(new GestorePulsante());

        // Frame
        jf.addWindowListener(new GestoreFinestraFN(jf));
        jf.setLayout(new BorderLayout());
        jf.add(jp[0], BorderLayout.NORTH);
        jf.add(jp[1], BorderLayout.CENTER);
        jf.add(jp[2], BorderLayout.SOUTH);
        jf.setLocation(UtilitiesFinestra.LOCATIONX, UtilitiesFinestra.LOCATIONY);
        jf.setSize(UtilitiesFinestra.WIDTH, UtilitiesFinestra.HEIGHT);
        jf.setVisible(true);
        jf.setIconImage(UtilitiesFinestra.icon.getImage());
        jf.getContentPane();
    }

    public String getUsername() {
        return username;
    }

    private boolean isUsernameValid(String username) {
        if (username.length() < 5) {
            return false;
        }
        
        String appoggio = username.toLowerCase();
        for (int i = 0; i < username.length(); i++) {
            if (!((appoggio.charAt(i) >= 'a' && appoggio.charAt(i) <= 'z') || (appoggio.charAt(i) >= '0' && appoggio.charAt(i) <= '9') || (appoggio.charAt(i) >= '_'))) {
                return false;
            }
        }
        
        return true;
    }
}