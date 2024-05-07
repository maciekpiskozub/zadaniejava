import java.util.List;


public interface FlightRezervationSystem {

    void rezerwacja(Flight lot);
    void anulowanieRezerwacji(Flight lot);
    void wyszukiwanieLotow(List<Flight> loty);
    void wyswietl();

}

