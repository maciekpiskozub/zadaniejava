public class Rezervation extends FlightBookingSystem{
    private String imie;
    private String nazwisko;
    private String pesel;
    private String numerTelefonu;
    private final float cenaBiletu;

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public String getNumerTelefonu() {
        return numerTelefonu;
    }


    public float getCenaBiletu() {
        return cenaBiletu;
    }

    public Rezervation(String imie, String nazwisko, String pesel, String numerTelefonu, float cenaBiletu) {
        super();
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.numerTelefonu = numerTelefonu;
        this.cenaBiletu = cenaBiletu;
    }
    @Override
    public String toString() {
        return "Rezerwacja{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                ", numerTelefonu='" + numerTelefonu + '\'' +
                ", cenaBiletu=" + cenaBiletu +
                '}';
    }
}