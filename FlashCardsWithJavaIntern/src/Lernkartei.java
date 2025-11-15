 import java.util.Random;
public class Lernkartei {
    Lernkarte[] lernkartes = new Lernkarte[100];
    public int lernkartesAnz = 0;

    public void  hinzufuegen(Lernkarte karte){
        if(lernkartesAnz>lernkartes.length) {
            System.out.println("Kein Platz mehr");
            return;
        }
        lernkartes[lernkartesAnz] = karte;
        lernkartesAnz++;
    }
    public void druckeAlleKarten(){
        if (lernkartesAnz == 0) return;
        for(int i = 0 ; i<lernkartesAnz ; i++){
            lernkartes[i].druckeKarte();
        }
    }
    public int gibAnzahlKarten() {
        return lernkartesAnz;
    }
    public Lernkarte[] gibKartenZuKategorie(String kategorie){
        Lernkarte[] output = new Lernkarte[gibAnzahlKarten()];
        int outputAnz = 0;
        for(int i = 0 ; i<lernkartesAnz ; i++){
            if (lernkartes[i].getKategorie().equals(kategorie)){
                output[outputAnz++] = lernkartes[i];
            }
        }
        return output;
    }
    public Lernkarte[] erzeugeDeck(int anzahlKarten){
        Random rnd = new Random();
        Lernkarte[] output = new Lernkarte[anzahlKarten];
        for (int i = 0 ;i<anzahlKarten; i++){
            output[i] = lernkartes[rnd.nextInt(gibAnzahlKarten())];
        }
        return output;
    }
}
