public class Flight extends FlightBookingSystem {
    protected String miejsceDocelowe;
    protected String miejsceWylotu;
    protected String dataWylotu;
    protected double czasTrwaniaLotu;
    protected int liczbaMiejsc;

    public Flight(String tokyo, String berlin, String s, int i, int i1) {
        super();
    }

    public String getMiejsceDocelowe() {
        return miejsceDocelowe;
    }
    public String getMiejsceWylotu() {
        return miejsceWylotu;
    }
    public String getDataWylotu() {
        return dataWylotu;
    }
    public double getCzasTrwaniaLotu() {
        return czasTrwaniaLotu;
    }
    public int getLiczbaMiejsc() {
        return liczbaMiejsc;
    }
    public void setLiczbaMiejsc(int liczbaMiejsc) {
        this.liczbaMiejsc = liczbaMiejsc;
    }


    public void Flight(String miejsceDocelowe,String miejsceWylotu, String dataWylotu, double czasTrwaniaLotu, int liczbaMiejsc) {
        this.miejsceDocelowe = miejsceDocelowe;
        this.miejsceWylotu = miejsceWylotu;
        this.dataWylotu = dataWylotu;
        this.czasTrwaniaLotu = czasTrwaniaLotu;
        this.liczbaMiejsc = liczbaMiejsc;
    }

    @Override
    public String toString() {
        return String.format("Miejsce docelowe %s, Miejsce Wylotu %s, DataWylotu %s, CzasTrwania %f, LiczbaMiejsc %d,", miejsceDocelowe, miejsceWylotu, dataWylotu, czasTrwaniaLotu, liczbaMiejsc);
    }

}

