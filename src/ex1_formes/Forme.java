package ex1_formes;

public class Forme {
    protected String couleur;

    public Forme(String couleur) {
        this.couleur = couleur;
    }

    public void dessiner() {
        System.out.println("Dessiner une forme de couleur " + couleur);
    }
}