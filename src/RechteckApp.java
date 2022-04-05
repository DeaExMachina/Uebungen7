import java.util.Arrays;

public class RechteckApp {
    public static void main(String[] args) {

        Rechteck hansi = new Rechteck();
        System.out.println(hansi.flaeche(12, 10));
        System.out.println(Arrays.toString(hansi.skaliere(12, 10, 2)));

    }
}
