public class Destinacija {
    private String naziv;
    private String drzava;
    private double cijena;

    public Destinacija(String naziv, String drzava, double cijena) {
        this.naziv = naziv;
        this.drzava = drzava;
        this.cijena = cijena;

    }

    public Destinacija(){
        this.naziv= "";
        this.drzava = "";
        this.cijena= 0;
    }

    public double getCijena() {
        return cijena;
    }

    @Override

    public String toString() {
        return "Destinacija: " + naziv + " (" + drzava + ") ,Cijena: " + cijena + " KM";
    }

}
