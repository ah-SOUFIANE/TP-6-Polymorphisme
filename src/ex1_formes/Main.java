package ex1_formes;

public class Main {
    public static void main(String[] args) {
        Forme[] formes = new Forme[] {
            new Cercle("Rouge", 5.0),
            new Rectangle("Bleu", 4.0, 3.0),
            new Triangle("Vert", 6.0, 2.5),
            new Forme("Noir")
        };

        for (Forme f : formes) {
            f.dessiner();
        }
    }
}