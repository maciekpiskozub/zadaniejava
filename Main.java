import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> loty = new ArrayList<>();

        FlightBookingSystem szukajlot = new FlightBookingSystem();
        Flight pierwszyLot = new Flight("Warszawa", "Los Angeles", "15/04/2024", 240, 120);
        Flight drugiLot = new Flight("Wrocław", "Sydney", "30/09/2023", 760, 0);
        Flight trzecilot = new Flight("Tokyo", "Berlin", "30/07/20235", 60, 40);
        Flight czwartylot = new Flight("Rzym", "Amsterdam", "11/12/2021", 60, 90);
        Flight piatylot = new Flight("Wrocław", "Katowice", "17/04/2022", 60, 80);
        Rezervation maciek = new Rezervation("Maciek","Piskozub","97658493029","092837465",150);
        Rezervation adrian = new Rezervation("Adrian","Czeluśniak","87648395746","195847365",160);


        loty.add(pierwszyLot);
        loty.add(drugiLot);
        loty.add(trzecilot);
        loty.add(czwartylot);
        loty.add(piatylot);

        maciek.rezerwacja(pierwszyLot);
        pierwszyLot.wyswietl();
        maciek.anulowanieRezerwacji(pierwszyLot);

        szukajlot.wyszukiwanieLotow(loty);

    }
}