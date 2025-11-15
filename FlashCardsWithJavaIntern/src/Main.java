//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Lernkartei lernkartei = new Lernkartei();

        Lernkarte karte1 = new Lernkarte("kategorie 1",
                                      "title 1",
                                      "frage 1",
                                   "antwort 1");
        Lernkarte karte2 = new Lernkarte("kategorie 2",
                "title 2",
                "frage 2",
                "antwort 2");
        Lernkarte karte3 = new Lernkarte("kategorie 2",
                "title 3",
                "frage 3",
                "antwort 3");

        lernkartei.hinzufuegen(karte1);
        lernkartei.hinzufuegen(karte2);
        lernkartei.hinzufuegen(karte3);
        for(Lernkarte e : lernkartei.gibKartenZuKategorie("kategorie 2")){
            if(e == null){continue;}
            e.druckeKarte();
        }


    }
}