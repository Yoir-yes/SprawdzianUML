public class Uczen extends Osoba{
    private String klasa;
    private boolean czyZdaje;

    public Uczen(String imie, String nazwisko, String PESEL, String klasa) {
        super(imie, nazwisko, PESEL);
        this.klasa = klasa;
    }

    public String getKlasa() {
        return klasa;
    }

    public void setKlasa(String klasa) {
        this.klasa = klasa;
    }

    public boolean isCzyZdaje() {
        return czyZdaje;
    }

    public void setCzyZdaje(boolean czyZdaje) {
        this.czyZdaje = czyZdaje;
    }
}
