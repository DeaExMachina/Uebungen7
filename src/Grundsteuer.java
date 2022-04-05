public class Grundsteuer {

    public int[] grundsteuerBerechnen(int[][] steuer){
        double typ1 = 3.20;
        double typ2 = 2.10;
        double typ3 = 0.90;
        double laenge;
        double breite;


        for (int i = 0; i < steuer.length; i++){
            for (int j = 0; j < steuer[i].length; j++){
                if (steuer[i][j] == typ1) {
                    double steuerSumme = typ1 * laenge * breite;
                }
                else if (steuer[i][j] == typ2) {
                    double steuerSumme = typ2 * laenge * breite;
                }
                else if (steuer[i][j] == typ3){
                    double steuerSumme = typ3 * laenge * breite;
                }
                else {
                    return null;
                }
                steuer[0][0] = typ1;
                steuer[0][1] = typ2;
                steuer[0][2] = typ3;


            }
        }
        return steuerSumme;
    }

    public static void main(String[] args) {

        Grundsteuer hansi = new Grundsteuer();
    }

}
//    Erstellen Sie eine Methode grundsteuerBerechnen in der Klasse Grundsteuer. Übergeben Sie ein
//        zweidimensionales int Array welches mehrere Zeilen und 3 Spalten aufweist:
//        [1, 30, 40] Die drei Spalten sind Typ, Länge und Breite eines Grundstücks
//        Für jeden Quadratmeter Fläche muss eine gewisse Steuer bezahlt werden – die Höhe der Steuer ist
//        weiters vom Typ der Fläche abhängig:
//        Typ 1: 3,20 Euro Steuer pro m2
//        Typ2: 2,10 Euro Steuer pro m2
//        Typ 3: 0,90 Euro Steuer pro m2
//        Liefern Sie als Rückgabewert die Summe der zu bezahlenden Steuer zurück
