package dziedziczenie;

public class main extends dziedziczenieJEDNAKLASA {
    public static void main(String... args){
        main osoba = new main();
        osoba.imie = "jan";
        osoba.nazwisko="kowalski";
        osoba.obecnosc();

        dziedziczenieJEDNAKLASA osoba1 = new dziedziczenieJEDNAKLASA();
        osoba1.imie = "JAN";
        osoba1.nazwisko = "KOWALSKI";
        osoba1.obecnosc();

        System.out.println(osoba.imie + " " + osoba.nazwisko + "     " + osoba1.imie + " " + osoba1.nazwisko + "   ");


        System.out.println(); System.out.println();


        studentDzienny sd = new studentDzienny();
        sd.imie = "JAN";
        sd.nazwisko = "Dzienny";
        sd.obecnosc();

        studentZaoczny sz = new studentZaoczny();
        sz.imie = "JAN";
        sz.nazwisko = "Zaoczny";
        sz.obecnosc();

        studentOnline so = new studentOnline();
        so.imie = "JAN";
        so.nazwisko = "Online";
        so.obecnosc();


    }
}
