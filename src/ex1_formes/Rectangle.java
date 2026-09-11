package ex1_formes;

public class Rectangle extends Forme {
    private double largeur, hauteur;

    public Rectangle(String couleur, double largeur, double hauteur) {
        super(couleur);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public void dessiner() {
        System.out.println("Dessiner un rectangle de couleur " + couleur + ", largeur=" + largeur + ", hauteur=" + hauteur);
    }
}