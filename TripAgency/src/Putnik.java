public class Putnik {
    private String ime;
    private String prezime;
    private int starost;

    public Putnik(String ime, String prezime, int starost) {

        this.ime=ime;
        this.prezime=prezime;
        this.starost=starost;

    }

    public Putnik(){
        this.ime="";
        this.prezime="";
        this.starost=0;
    }


    @Override
    public String toString(){
        return ime + " " + prezime + " " + starost + "\n";

    }



}
