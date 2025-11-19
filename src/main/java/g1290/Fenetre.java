package g1290;

import java.awt.*;
import java.util.Observer;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Fenetre extends JFrame implements Observateur {

    private JLabel label = new JLabel();
    private Horloge horloge;
    private String name = "Fenetre Observatrice de clock";


    public Fenetre() {
//
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setSize(200, 80);
//
        this.horloge = new Horloge();
//      horloge.run();
        Font police = new Font("DS-digital", Font.TYPE1_FONT, 30);
        this.label.setFont(police);
        this.label.setHorizontalAlignment(JLabel.CENTER);

        this.label.setText("----");
        this.getContentPane().add(this.label, BorderLayout.CENTER);
    }

    @Override
    public void update(String hour) {
        System.out.println("Il est actuellement " + hour);
        this.label.setText(hour);
    }

    @Override
    public String toString() {
        return name;
    }

    //
}




