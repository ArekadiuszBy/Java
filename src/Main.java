class Pracownik
        {
            private int id;
            private String imie;
            private String nazwisko;
            private int zarobek;

            public Pracownik(int id, String imie, String nazwisko, int zarobek) {
                this.id = id;
                this.imie=imie;
                this.nazwisko=nazwisko;
                this.zarobek=zarobek;
            }
            String getImie(){return imie;}
            String getNazwisko(){return nazwisko;}
            int getId(){return id;}
            int getZarobek(){return zarobek;}
        }

class Lekarz extends Pracownik {

    private int staż;

    public Lekarz(int id, String imie, String nazwisko, int zarobek) {
        super(id, imie, nazwisko, zarobek);
        staż = 5;
    }
    public int getstaż(){return staż;}
    public void setstaż(int n){
        staż+=n;
    }
}


public class Main {
    public static void main(String[] args)
    {

        Pracownik pracownik = new Pracownik(1,"arek","waw",5000 );
        System.out.println( pracownik.getId());
        System.out.println(pracownik.getImie());
        System.out.println(pracownik.getNazwisko());
        System.out.println(pracownik.getZarobek());

        System.out.println(); System.out.println("KLASA LEKARZ"); System.out.println();

        Lekarz lekarz = new Lekarz(2, "Monika", "Ż.", 2000);
        System.out.println(lekarz.getstaż());
        System.out.println(lekarz.getImie());



    }
}
