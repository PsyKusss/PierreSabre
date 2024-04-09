package personnages;

public class Ronin extends Humain {
    private int honneur;

    public Ronin(String nom, String boissonFavorite, int argent) {
        super(nom, boissonFavorite, argent);
        this.honneur = 1;
    }

    public void donner(Commercant beneficiaire) {
        int argentDonne = (int) (getArgent() * 0.1); 
        parler(getNom(), beneficiaire.getNom() + " prend ces " + argentDonne + " sous."); 
        beneficiaire.gagnerArgent(argentDonne);
    }
    
    public void provoquer(Yakuza adversaire) {
    	parler(getNom(), "Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
        int force = honneur * 2;
        if (force >= adversaire.getReputation()) {
            int argentPris = adversaire.perdre();
            gagnerArgent(argentPris);
            honneur++;
            parler(getNom(), "Je t’ai eu petit yakusa!");
            parler(adversaire.getNom(), "J’ai perdu mon duel et mes "+ argentPris+" sous, snif... J'ai déshonoré le clan de Warsong.");
        } else {
            honneur--;
            int argentPris = getArgent();
            perdreArgent(getArgent());
            parler(getNom(), "J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
            parler(getNom(), "Ce ronin pensait vraiment battre Yaku Le Noir du clan de Warsong ? Je l'ai dépouillé de ses " + argentPris + " sous.");
        }
    }
}
