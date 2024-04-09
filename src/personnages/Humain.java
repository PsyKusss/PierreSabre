package personnages;

import java.util.Arrays;


public class Humain {
    private String nom;
    private String boissonFavorite;
    private int argent;
    private String[] memoire;
    private int indexMemoire;

    public Humain(String nom, String boissonFavorite, int argent) {
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
        this.argent = argent;
        this.memoire = new String[30];
        this.indexMemoire = 0;
    }
    
    public static void parler(String nom, String texte) {
        System.out.println("(" + nom + ") " + texte);
    }

    public void direBonjour() {
        parler(nom, "- Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonFavorite + ".");
    }

    public void boire() {
        parler(nom, "Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
    }

    public void acheter(String bien, int prix) {
        if (argent >= prix) {
            argent -= prix;
            parler(nom,"J'ai " + argent +" sous en poche. "+ "Je viens d'acheter " + bien + " pour " + prix + " euros.");
        } else {
            parler(nom, "J'ai que " + argent +" sous en poche. " + "Désolé, je n'ai pas assez d'argent pour acheter " + bien + " pour " + prix + " euros.");
        }
    }

    public void gagnerArgent(int gain) {
        argent += gain;
        parler(nom, "J'ai gagné " + gain + " euros !");
    }

    public void perdreArgent(int perte) {
        argent -= perte;
        parler(nom, "J'ai perdu " + perte + " euros...");
    }

    public String getNom() {
        return nom;
    }

    public int getArgent() {
        return argent;
    }
    
    public void faireConnaissanceAvec(Humain autreHumain) {
    	direBonjour();
    	autreHumain.direBonjour();
    	this.memoire(autreHumain.nom);
        autreHumain.memoire(this.nom);
    }

    private void memoire(String nom) {
        if (indexMemoire >= 30) {
            memoire[0] = nom;
        } else {
            memoire[indexMemoire++] = nom;
        }
    }

    public void listerConnaissances() {
        System.out.print("(" + this.nom + ") - Je connais beaucoup de monde dont : ");
        for (int i = 0; i < indexMemoire; i++) {
            System.out.print(memoire[i]);
            if (i < indexMemoire - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
