# TP 6 - Polymorphisme

Cours : Fondamentaux et Concepts Avancés de la Programmation Java

Ce TP contient 3 exercices sur le polymorphisme en Java : redéfinition de méthodes, liaison dynamique, classes abstraites et génériques appliqués à des hiérarchies de classes.

## Objectifs

- Définir une super-classe et des sous-classes qui redéfinissent ses méthodes
- Stocker des objets hétérogènes dans un même tableau ou une même liste
- Comprendre la liaison dynamique (dynamic binding)
- Utiliser une classe abstraite pour imposer un contrat aux sous-classes
- Manipuler une collection générique via une interface commune

## Prérequis

- JDK installé (version 8 ou supérieure)
- Un IDE (Eclipse, IntelliJ, VS Code) ou un terminal avec `javac` et `java`
- Notions de base : classes, héritage, méthodes, tableaux

## Compilation et exécution

Chaque exercice est regroupé dans son propre package, avec une classe `Main` (ou `TestPersonnes`) servant de programme de test.

```bash
cd src
javac com/example/tp/*.java
java com.example.tp.Main
```

## Exercice 1 : Système de dessin de formes

Créer une super-classe `Forme` et des sous-classes (`Cercle`, `Rectangle`, `Triangle`) qui redéfinissent la méthode `dessiner()`. Ces objets sont stockés dans un même tableau `Forme[]`, et l'appel à `dessiner()` déclenche à l'exécution la version propre à chaque sous-classe.

```java
public class Forme {
    protected String couleur;

    public Forme(String couleur) {
        this.couleur = couleur;
    }

    public void dessiner() {
        System.out.println("Dessiner une forme de couleur " + couleur);
    }
}
```

Résultat attendu :

```
Dessiner un cercle de couleur Rouge et de rayon 5.0
Dessiner un rectangle de couleur Bleu, largeur=4.0, hauteur=3.0
Dessiner un triangle de couleur Vert, base=6.0, hauteur=2.5
Dessiner une forme de couleur Noir
```

Classes : `Forme.java`, `Cercle.java`, `Rectangle.java`, `Triangle.java`, `Main.java`

Package : `com.example.tp`

## Exercice 2 : Gestion d'une bibliothèque multimédia

Créer une hiérarchie `Media` avec des sous-classes `Audio`, `Video` et `LiveStream`, chacune redéfinissant `lire()` et `getDuree()`. Un gestionnaire `MediaLibrary` stocke ces objets dans un tableau dynamique et les manipule de façon uniforme.

```java
public class Media {
    protected String titre;

    public Media(String titre) {
        this.titre = titre;
    }

    public void lire() {
        System.out.println("Lecture de : " + titre);
    }

    public int getDuree() {
        return 0;
    }
}
```

Résultat attendu :

```
=== Lecture de la bibliothèque ===
Lecture audio : Podcast Java
Lecture vidéo : Tutoriel UML [1080p]
Démarrage du flux en direct : Concert en direct – http://live.example.com
Lecture audio : Musique Classique

Durée totale (sec) : 4200
```

Classes : `Media.java`, `Audio.java`, `Video.java`, `LiveStream.java`, `MediaLibrary.java`, `Main.java`

Package : `com.example.tp`

## Exercice 3 : Personne, Développeur et Manager

Concevoir une classe abstraite `Personne` avec une méthode abstraite `calculerSalaire()`, puis deux sous-classes `Developpeur` (prime de 10%) et `Manager` (prime de 30%). Une méthode générique parcourt une `List<? extends Personne>` et affiche chaque élément via le polymorphisme.

```java
public abstract class Personne {
    protected final String nom;
    protected final double salaireBase;

    public Personne(String nom, double salaireBase) {
        this.nom = nom;
        this.salaireBase = salaireBase;
    }

    public abstract double calculerSalaire();

    public void affiche() {
        System.out.printf("Je suis %s, salaire = %.2f%n", nom, calculerSalaire());
    }
}
```

Classes : `Personne.java`, `Developpeur.java`, `Manager.java`, `Utils.java`, `TestPersonnes.java`

Packages : `ma.projet`, `ma.projet.bean`

## Structure du projet

```
TP6_Polymorphisme/
├── src/
│   ├── com/example/tp/
│   │   ├── Forme.java
│   │   ├── Cercle.java
│   │   ├── Rectangle.java
│   │   ├── Triangle.java
│   │   ├── Media.java
│   │   ├── Audio.java
│   │   ├── Video.java
│   │   ├── LiveStream.java
│   │   ├── MediaLibrary.java
│   │   └── Main.java
│   ├── ma/projet/
│   │   ├── Personne.java
│   │   ├── Utils.java
│   │   └── TestPersonnes.java
│   └── ma/projet/bean/
│       ├── Developpeur.java
│       └── Manager.java
├── README.md
└── videos/
    └── demo.mp4
```

## Concepts mobilisés

- Redéfinition de méthodes (@Override) et liaison dynamique
- Tableaux et listes d'objets hétérogènes manipulés via une classe commune
- Classe abstraite définissant un contrat pour ses sous-classes
- Génériques (`List<? extends Personne>`) pour la sécurité de type
- Extension du code sans modification du programme principal

## Démo vidéo

Une seule vidéo montre l'exécution des 3 exercices, dans l'ordre.

[Voir la démo vidéo](videos/demo.mp4)

## Auteur

Soufiane Ait Hmad — TP6 Java, ENS Marrakech
