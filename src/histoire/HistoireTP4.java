package histoire;
import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;

public class HistoireTP4 {
	
    public static void main(String[] args) {
        Humain prof = new Humain("Prof", "kombucha", 54);
        prof.direBonjour();
        prof.boire();
        prof.acheter("boisson", 12);
        prof.acheter("jeu", 2);
        prof.acheter("kimono", 50);
        
        Commercant marco = new Commercant("Marco", 20);
        marco.direBonjour();
        marco.seFaireExtorquer();
        marco.recevoir(15);
        marco.boire();
        
        Yakuza yakuLeNoir = new Yakuza ("Yaku le Noir", "Whisky", 30, "Warsong");
        yakuLeNoir.direBonjour();
        System.out.println("(" + yakuLeNoir.getNom() + ") - Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
        yakuLeNoir.extorquer(marco);
        System.out.println("(" + yakuLeNoir.getNom() + ") - J'ai piqué les 15 sous de Marco, ce qui me fait " + yakuLeNoir.getArgent() + " sous dans ma poche. Hi ! Hi !");
        
    }
}
