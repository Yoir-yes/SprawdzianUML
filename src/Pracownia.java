import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Pracownia {
    private Map<Osoba,Komputer> przypisania = new HashMap<>();

    public void dodajKomputerDoUcznia(Osoba osoba,Komputer komputer){
        przypisania.put(osoba,komputer);
    }
    public void wyswitelPracownie(){
        Set<Map.Entry<Osoba, Komputer>> mapa = przypisania.entrySet();
        for(Map.Entry<Osoba,Komputer> x : mapa){
            Osoba osoba = x.getKey();
            Komputer komputer = x.getValue();
            System.out.println(osoba.getImie()+" "+osoba.getNazwisko() + " => " + komputer.getNumer());
        }
    }
}
