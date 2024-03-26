package personnages;

public class Commercant extends Humain {
    public Commercant(String nom, int argent) {
        super(nom, "thé", argent);
    }

    public int seFaireExtorquer() {
        int argentPerdu = getArgent();
        perdreArgent(argentPerdu);
        parler(getNom(),"Le monde est vraiment trop injuste !");
        return argentPerdu;
    }

    public void recevoir(int argent) {
        gagnerArgent(argent);
        parler(getNom(),"Je te remercie généreux donateur!");
    }

    public static void main(String[] args) {
        Commercant commercant = new Commercant("Marchand", 100);
        int argentExtorque = commercant.seFaireExtorquer();
        System.out.println("Le commerçant s'est fait extorquer de " + argentExtorque + " euros.");
        commercant.recevoir(50);
    }
}

