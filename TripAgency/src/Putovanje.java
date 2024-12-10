import java.util.ArrayList;

public class Putovanje {

    private ArrayList<Destinacija> destinacije;
    private double budzet;
    private ArrayList<Putnik> putnici;

    public Putovanje(double budzet){
         this.budzet = budzet;
         this.destinacije = new ArrayList<>();
         this.putnici = new ArrayList<>();
    }

    public void dodajDestinaciju(Destinacija destinacija){
        destinacije.add(destinacija);
    }

    public void dodajPutnik(Putnik putnik){
        putnici.add(putnik);
    }

    public double izracunajCijenu(){
        double ukupnaCijena=0;
        for (Destinacija d : destinacije){
            ukupnaCijena += d.getCijena();
        }
        return ukupnaCijena;
    }

    public void ispisiInformacije(){
        System.out.println("Putovanje: ");
        System.out.println("Destinacije: ");
        for (Destinacija d : destinacije){
            System.out.println(d);
        }
        System.out.println("Putnici: ");

            for (Putnik p : putnici){
                System.out.println(p);
            }
        System.out.println("Ukupna cijena putovanja: " + izracunajCijenu() + " KM");
        System.out.println("Budzet: " + budzet + " KM");
        if (izracunajCijenu() <= budzet){
            System.out.println("Putovanje je unutar budzeta");

        }else {
            System.out.println("Prekoračen budžet!");
        }

    }

}
