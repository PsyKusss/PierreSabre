package histoire;
import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
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
        yakuLeNoir.extorquer(marco);
        
        Ronin roro = new Ronin ("Roro", "shochu", 60);
        roro.direBonjour();
        roro.donner(marco);
        
        roro.provoquer(yakuLeNoir);
    }
}
