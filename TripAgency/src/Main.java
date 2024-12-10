import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Putovanje putovanje1 = new Putovanje(2000);

        putovanje1.dodajDestinaciju(new Destinacija("Tivat", "Albanija", 400 ));
        putovanje1.dodajDestinaciju(new Destinacija("Lyon", "Francuska", 500 ));
        putovanje1.dodajDestinaciju(new Destinacija("ImaSeMožeSe","Maldivi",100));


        putovanje1.dodajPutnik(new Putnik("Napoleon", "Bonaparte", 29));
        putovanje1.dodajPutnik(new Putnik("Napoleona", "Bonaparte", 20));


        putovanje1.ispisiInformacije();

    }
}