package ex3_entreprise;

import java.util.List;

public class Utils {
    public static void listerPersonnes(List<? extends Personne> personnes) {
        for (Personne p : personnes) {
            p.affiche();
        }
    }
}