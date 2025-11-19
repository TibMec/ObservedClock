package g1290;

public class Main {
    public static void main(String[] args) {
        Fenetre fen = new Fenetre();
        Fenetre fen2 = new Fenetre();
        Fenetre fen3 = new Fenetre();

        Horloge h = new Horloge();
        fen.setVisible(true);

        h.addObservateur(fen);
        h.addObservateur(fen2);
        h.addObservateur(fen3);

        h.delObservateur(fen3);

        System.out.println("liste d'observateurs de l'horloge:");
        for(Observateur o: h.getObservateurs())
            System.out.println( "\t - "+o);
        h.run();

    }
}