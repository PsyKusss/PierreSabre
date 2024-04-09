package personnages;

public class Samourai extends Ronin {
    private String seigneur;

    public Samourai(String seigneur, String nom, String boissonFavorite, int argent) {
        super(nom, boissonFavorite, argent);
        this.seigneur = seigneur;
    }

    @Override
    public void direBonjour() {
        super.direBonjour(); 
        parler(getNom()," - Je suis fier de servir le seigneur " + seigneur + ".");
    }

    public void boire(String boisson) {
    	parler(getNom(), " - Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du " + boisson + ".");
    }
}

