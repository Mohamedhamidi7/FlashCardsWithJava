//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EinzelantwortKarte karteE1 = new EinzelantwortKarte("sport","title1","frage 1","antwort 1");
        EinzelantwortKarte karteE2 = new EinzelantwortKarte("sport","title2","frage 2","antwort 2");
        String[] test = {"antwort 1", "antwort 2"};
        int[] testindex = {0};
        MehrfachantwortKarte karteM1 =  new MehrfachantwortKarte("studies","title1","frage 1",test, testindex );
        String[] test2 = {"antwort 1", "antwort 2", "antwort 3", "antwort 4",};
        int[] test2index = {1,3};
        MehrfachantwortKarte karteM2 =  new MehrfachantwortKarte("studies","title1","frage 1",test2, test2index );

        Lernkartei lernkartei = new Lernkartei();

        lernkartei.hinzufuegen(karteE1);
        lernkartei.hinzufuegen(karteE2);
        lernkartei.hinzufuegen(karteM1);
        lernkartei.hinzufuegen(karteM2);

        lernkartei.druckeAlleKarten();
        System.out.println("#############################");
        lernkartei.gibAnzahlKarten();
        System.out.println("#############################");
        for (Lernkarte e :lernkartei.gibKartenZuKategorie("sport")){
            if (e==null)return;
            e.druckeKarte();
        }

    }
}