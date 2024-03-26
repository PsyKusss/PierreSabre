package personnages;

public class Yakuza extends Humain {
    private String clan;
    private int reputation;

    public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
        super(nom, boissonFavorite, argent);
        this.clan = clan;
        this.reputation = 0;
    }

    public void extorquer(Commercant victime) {
        int argentVictime = victime.seFaireExtorquer();
        argent += argentVictime; 
        reputation++; 
        parler("(" + getNom() + ") - J'ai extorqué le commerçant du clan " + victime.getClan() + " et pris " + argentVictime + " sous !");
    }

    public String getClan() {
        return clan;
    }
}

