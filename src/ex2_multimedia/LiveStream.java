package ex2_multimedia;

public class LiveStream extends Media {
    private String url;

    public LiveStream(String titre, String url) {
        super(titre);
        this.url = url;
    }

    @Override
    public void lire() {
        System.out.println("Démarrage du flux en direct : " + titre + " – " + url);
    }

    @Override
    public int getDuree() {
        return -1;
    }
}