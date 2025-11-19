package g1290;

public class Main {
    public static void main(String[] args) {
        Fenetre fen = new Fenetre();
        Horloge h = new Horloge();
        fen.setVisible(true);

        h.addObservateur(fen);

        for(Observateur o: h.getObservateurs())
            System.out.println("liste d'observateurs de l'horloge: \n\t"+ o+"\n");

        h.run();

    }
}