import java.util.ArrayList;
import java.util.List;

public class FlightBookingSystem implements FlightRezervationSystem  {
    List<FlightBookingSystem> rezerwacje = new ArrayList<>();
    public void rezerwacja(Flight lot) {
        if (lot.getLiczbaMiejsc()!=0){
            rezerwacje.add(this);
            lot.setLiczbaMiejsc(lot.getLiczbaMiejsc()-1);
        }
        else {
            throw new ArrayIndexOutOfBoundsException("Brak miejsc");
        }
    }

    public void anulowanieRezerwacji(Flight lot) {
        if (rezerwacje.contains(this)) {
            rezerwacje.remove(this);
            lot.setLiczbaMiejsc(lot.getLiczbaMiejsc()+1);
        }
        else {
            throw new IllegalArgumentException("Nie znaleziono rezerwacji");
        }
    }


    public void wyszukiwanieLotow(List<Flight> loty) {
        System.out.println("Dostępne loty: ");
        for (Flight lot:loty){
            if (lot.getLiczbaMiejsc()>0){
                System.out.println(lot);
            }
        }
    }

    @Override
    public void wyswietl() {
        System.out.println(this.toString());
    }

}
