package ex3_entreprise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Personne> equipe = new ArrayList<>();
        equipe.add(new Developpeur("Ali", 2000));
        equipe.add(new Manager("Hamid", 3000));
        equipe.add(new Developpeur("Hanane", 2200));

        Utils.listerPersonnes(equipe);
    }
}