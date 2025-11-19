package g1290;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Horloge implements Observable {
    private List<Observateur> observateurs;
    Calendar cal;

    private String hour = "";

    public Horloge() {
        this.cal = Calendar.getInstance();
        this.observateurs = new ArrayList<>();
    }

    public void run() {
        while (true) {
//
            System.out.println("heure en debut de loop run: "+hour);
            this.hour = this.cal.get(Calendar.HOUR_OF_DAY) + " : "
                     + (this.cal.get(Calendar.MINUTE) < 10 ?
                         "0" + this.cal.get(Calendar.MINUTE)
                         : this.cal.get(Calendar.MINUTE)) + ":"
                            + ((this.cal.get(Calendar.SECOND) < 10) ?
                         "0" + this.cal.get(Calendar.SECOND)
                         : this.cal.get(Calendar.SECOND));
            System.out.println("heure avant try dans loop run: "+hour);
            try {
                Thread.sleep(1000);
                System.out.println("heure apres sleep dans loop run: "+this.hour);
                updateObservateur();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void addObservateur(Observateur obs) {
        this.observateurs.add(obs);
        System.out.println("observateur ajouté");
    }

    @Override
    public void updateObservateur() {
        System.out.println("update fonctionne");
        for (Observateur obs : this.observateurs) {
            obs.update(this.hour);
            System.out.println("update for "+obs);
        }
    }

    @Override
    public void delObservateur(Observateur obs) {
        this.observateurs.remove(obs);
        System.out.println("observateur supprimé");
    }

    public List<Observateur> getObservateurs() {
        return observateurs;
    }

}
