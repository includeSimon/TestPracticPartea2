package Model;

import java.util.List;

public class Bestellung {
    private int bestellungNummer;
    private String addresse;
    private List<Produkt> produkteList;

    public Bestellung(int bestellungNummer, String addresse, List<Produkt> produkteList) {
        this.bestellungNummer = bestellungNummer;
        this.addresse = addresse;
        this.produkteList = produkteList;
    }

    public int getBestellungNummer() {
        return bestellungNummer;
    }

    public void setBestellungNummer(int bestellungNummer) {
        this.bestellungNummer = bestellungNummer;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public List<Produkt> getProdukteList() {
        return produkteList;
    }

    public void setProdukteList(List<Produkt> produkteList) {
        this.produkteList = produkteList;
    }

    @Override
    public String toString() {
        return "Bestellung{" +
                "bestellungNummer=" + bestellungNummer +
                ", addresse='" + addresse + '\'' +
                ", produkteList=" + produkteList +
                '}';
    }

    public int gesamtPreis(){
        int preis = 0;
        for (Produkt produkt : produkteList)
            preis += produkt.getPreis();
        return preis;
    }
}
