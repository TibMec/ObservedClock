package g1290;

public interface Observable {
    public void addObservateur(Observateur obs);
    public void updateObservateur();
    public void delObservateur(Observateur obs);
}