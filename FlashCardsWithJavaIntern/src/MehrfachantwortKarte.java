public class MehrfachantwortKarte extends Lernkarte{
    private String[] moeglicheAntworten;
    private int[] richtigeAntworten;

    public MehrfachantwortKarte(String kategorie, String titel, String frage, String[] moeglicheAntworten, int[] richtigeAntworten){
        super(kategorie,titel,frage);
        this.moeglicheAntworten = moeglicheAntworten;
        this.richtigeAntworten = richtigeAntworten;
    }

    @Override
    public void zeigeRueckzeite() {
        for(int i = 0 ; i<richtigeAntworten.length ; i++){
            System.out.println((richtigeAntworten[i]+1) +": "+ moeglicheAntworten[richtigeAntworten[i]]);
        }
    }

    @Override
    public void zeigeVorderseite() {
        super.zeigeVorderseite();
        for(int i = 0; i< moeglicheAntworten.length ; i++){
            System.out.println((i+1) + ": " + moeglicheAntworten[i]);
        }
    }
}
