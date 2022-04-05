public class Rechteck {

    private double laenge;
    private double breite;

    public double flaeche (double laenge, double breite) {
        double flaeche = laenge * breite;

        return flaeche;
    }

    public double[] skaliere (double laenge, double breite, double faktor) {
        laenge = laenge * faktor;
        breite = breite * faktor;

        //um mehrere Doubles zurückgeben zu können, wird ein Array gebraucht
        double[] array = new double[2];
        array[0] = laenge;
        array[1] = breite;

        return array;
    }

}
//    Erstellen Sie eine Klasse Rechteck mit den beiden Eigenschaften laenge und breite. (jeweils
//        double) Erstellen Sie eine Methode flaeche die die Fläche des Rechtecks berechnet. (Länger
//        multipliziert mit Breite) Erstellen Sie eine Methode skaliere, die alle Eigenschaften um einen Faktor
//        (gegeben durch Parameter) vergrößert/verkleinert.
//        Testen Sie die Klasse in main Methode in RechteckApp Klasse.
