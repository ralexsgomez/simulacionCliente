package simulacionatencioncliente;

import java.awt.Color;
import java.awt.Label;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ralexs
 */
public class Servidor extends JPanel{
    private JLabel labelIcon;
//    private JPanel panelPrincipal;
    private JPanel constendorDespacho;

    public Servidor() {

        labelIcon = new JLabel();
        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/servidor.jpeg"))); // NOI18N
        constendorDespacho = new JPanel();
        constendorDespacho.setBackground(Color.red);
        this.add(constendorDespacho);
        this.add(labelIcon);
        this.setBackground(Color.red);
        this.setVisible(true);
    }

    public JPanel getConstendorDespacho() {
        return constendorDespacho;
    }
    
}

