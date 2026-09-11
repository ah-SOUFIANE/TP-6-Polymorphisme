package ex1_formes;

public class Cercle extends Forme {
    private double rayon;

    public Cercle(String couleur, double rayon) {
        super(couleur);
        this.rayon = rayon;
    }

    @Override
    public void dessiner() {
        System.out.println("Dessiner un cercle de couleur " + couleur + " et de rayon " + rayon);
    }
}