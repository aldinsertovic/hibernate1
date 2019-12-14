
package hibernateassignment.database;


public class Zaposleni {
    public int id;
   public String  ime;
   public int broj_godina;
   public String adresa_stanovanja;
   public double visina_dohotka;

    @Override
    public String toString() {
        return id + "\t" + ime + "\t" + broj_godina + "\t" + adresa_stanovanja + "\t" + visina_dohotka;
    }
   
   
   
}
