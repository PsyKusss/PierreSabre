package personnages;


public class Humain {
    private String nom;
    private String boissonFavorite;
    private int argent;

    public Humain(String nom, String boissonFavorite, int argent) {
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
        this.argent = argent;
    }
    
    public static void parler(String nom, String texte) {
        System.out.println("(" + nom + ") " + texte);
    }

    public void direBonjour() {
        parler(nom, "Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonFavorite + ".");
    }

    public void boire() {
        parler(nom, "Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
    }

    public void acheter(String bien, int prix) {
        if (argent >= prix) {
            argent -= prix;
            parler(nom, "Je viens d'acheter " + bien + " pour " + prix + " euros.");
        } else {
            parler(nom, "Désolé, je n'ai pas assez d'argent pour acheter " + bien + ".");
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
}
