public class Grundsteuer {

    public int[] grundsteuerBerechnen(int[][] steuer){
        for (int i = 0; i < steuer.length; i++){
            for (int j = 0; j < steuer[i].length; j++){
                steuer[0][0] = double typ1; //typ1


            }
        }
        return sum;
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
