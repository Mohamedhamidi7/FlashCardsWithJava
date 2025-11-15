public class Lernkarte {
    private static int currId = 0;
    private int id;
    private String kategorie;
    private String titel;
    private String frage;
    private String antwort;

    Lernkartei lernkartei = new Lernkartei();

    public Lernkarte(String kategorie, String titel, String frage, String antwort) {
        this.id = currId++;

        this.kategorie = kategorie;
        this.titel = titel;
        this.frage = frage;
        this.antwort = antwort;
    }

    public String getKategorie() {
        return kategorie;
    }

    public void zeigeVorderseite(){
        System.out.println("[" + id + ", " + kategorie + "] " + titel + ":" + "\n" + frage);
    }
    public void zeigeRueckzeite(){
        System.out.println(antwort);
    }
    public void druckeKarte(){
        zeigeVorderseite();
        zeigeRueckzeite();
    }


}
