public class EinzelantwortKarte extends Lernkarte{
    private String antwort;
     public EinzelantwortKarte(String kategorie, String titel, String frage, String antwort){
         super(kategorie,titel,frage);
         this.antwort = antwort;
     }

    @Override
    public void zeigeRueckzeite(){
        System.out.println(antwort);
    }
}
