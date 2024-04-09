package personnages;

public class Yakuza extends Humain {
    private String clan;
    private int argent;
    private int reputation;

    public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
        super(nom, boissonFavorite, argent);
        this.clan = clan;
        this.argent = getArgent();
        this.reputation = 0; 
    }

    public void extorquer(Commercant victime) {
    	parler(getNom(),"Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
    	parler(getNom(), victime.getNom() +" , si tu tiens à la vie donne moi ta bourse !");
        int argentVictime = victime.getArgent(); 
        victime.perdreArgent(argentVictime); 
        reputation++; 
        int argentTotal = argentVictime + getArgent(); 
        parler(getNom(),"Je viens d'extorquer " + victime.getNom() + ". J'ai pris " + argentVictime + " sous. Maintenant j'ai " + argentTotal + " sous dans ma poche. Hi! Hi!");
    }
    
    public int perdre() {
        System.out.println("(" + getNom() + ") - J’ai perdu mon duel et mes " + argent + " sous, snif... J'ai déshonoré le clan de Warsong.");
        int argentPerdu = argent;
        argent = 0;
        reputation--; 
        return argentPerdu;
    }
    
    public void gagner(int gain) {
        argent += gain;
        reputation++; 
        System.out.println("(" + getNom() + ") - Ce ronin pensait vraiment battre " + getNom() + " du clan de Warsong ? Je l'ai dépouillé de ses " + gain + " sous.");
    }
    
    public int getReputation() {
        return reputation;
    }
    
    @Override
    public void direBonjour() {
        super.direBonjour();
        parler(getNom() , " - Mon clan est celui de " + clan + ".");
    }
}
