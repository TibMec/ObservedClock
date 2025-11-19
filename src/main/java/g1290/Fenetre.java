package g1290;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Fenetre extends JFrame implements Observateur {

    private JLabel label = new JLabel();
    private Horloge horloge;
    private static int AUTO_GEN = 0;
    private String name = "Fenetre Observatrice de clock" + AUTO_GEN++;


    public Fenetre() {
//
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setSize(200, 80);
//
        this.horloge = new Horloge();
//
        Font police = new Font("DS-digital", Font.TYPE1_FONT, 30);
        this.label.setFont(police);
        this.label.setHorizontalAlignment(JLabel.CENTER);

        this.label.setText("----");
        this.getContentPane().add(this.label, BorderLayout.CENTER);
    }

    @Override
    public void update(String hour) {
        if (hour.isEmpty())
            System.out.println("\tIl n'y a pas d'heure encore enristrée");
        else
            System.out.println("\tIl est actuellement " + hour);
        this.label.setText(hour);
    }

    @Override
    public String toString() {
        return name;
    }

    //
}




