public class Main {
    public static void main(String[] args) {
        Uczen uczen = new Uczen("Ernest", "Sapijaszko","53462176523","3TP");
        Osoba osoba = new Osoba("Darek", "Kaniewski", "56276578224");
        Komputer komputer = new Komputer();
        Komputer komputer2 = new Komputer();
        komputer.setNumer(3);
        komputer2.setNumer(1);
        komputer.setCzyDziala(false);
        Pracownia pracownia = new Pracownia();
        pracownia.dodajKomputerDoUcznia(uczen,komputer);
        pracownia.dodajKomputerDoUcznia(osoba,komputer2);
        pracownia.wyswitelPracownie();
    }
}