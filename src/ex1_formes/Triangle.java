package ex1_formes;

public class Triangle extends Forme {
    private double base, hauteur;

    public Triangle(String couleur, double base, double hauteur) {
        super(couleur);
        this.base = base;
        this.hauteur = hauteur;
    }

    @Override
    public void dessiner() {
        System.out.println("Dessiner un triangle de couleur " + couleur + ", base=" + base + ", hauteur=" + hauteur);
    }
}