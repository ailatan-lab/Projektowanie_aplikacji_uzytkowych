
import java.util.Comparator;

public class Vehicle implements Comparable<Vehicle>, Comparator<Vehicle>{
    private String marka;
    private String model;
    private ItemCondition stan;
    private double cena;
    private int rokProdukcji;
    private double przebieg;
    private double pojemnoscSilnika;
    private int iloscAut = 1;
    public String getMarka() {return marka;}
    public void setMarka(String newMarka) {marka = newMarka;}
    public String getModel() {return model;}
    public void setModel(String newModel) {model = newModel;}
    public ItemCondition getStanSamochodu() { return stan;}
    public void setStanSamochodu(ItemCondition newItemCondidtion) {stan = newItemCondidtion;}
    public double getCena() {return cena;}
    public void setCena(double newCena) {cena = newCena;}
    public int getRokProdukcji() {return rokProdukcji;}
    public void setRokProdukcji(int newRokProdukcji) {rokProdukcji = newRokProdukcji;}
    public double getPrzebieg() {return  przebieg;}
    public void setPrzebieg(double newPrzebieg) {przebieg = newPrzebieg;}
    public double getPojemnoscSilnika() {return pojemnoscSilnika;}
    public void setPojemnoscSilnika(double newPojemnoscSilnika) {pojemnoscSilnika = newPojemnoscSilnika;}
    public int getIloscAut() {return iloscAut;}
    public void  setIloscAut(int newIloscAut) {iloscAut = newIloscAut;}



    public Vehicle(String newMarka,
                    String newModel,
                    ItemCondition newSamochodu,
                    double newCena,
                    int newRokProdukcji,
                    double newPrzebieg,
                    double newPojemnoscSilnika)
    {
        marka = newMarka;
        model = newModel;
        stan = newSamochodu;
        cena = newCena;
        rokProdukcji = newRokProdukcji;
        przebieg = newPrzebieg;
        pojemnoscSilnika = newPojemnoscSilnika;
    }

    public void Print()
    {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Stan samochodu: " + stan);
        System.out.println("Cena " + cena);
        System.out.println("Rok produkcji: " + rokProdukcji);
        System.out.println("Przebieg: " + przebieg);
        System.out.println("Pojemność silnika: " + pojemnoscSilnika);
        System.out.println(("Ilość aut: " + iloscAut));
    }

    public int compareTo(Vehicle marka)
    {
        return this.marka.compareTo(marka.marka);
    }
    public int compare(Vehicle marka)
    {
        return this.marka.compareTo(marka.marka);
    }
    @Override
    public int compare(Vehicle v1, Vehicle v2)
    {
        return v1.getMarka().compareTo(v2.getMarka());
    }
    public static Comparator<Vehicle> amountComparator = Comparator.comparingDouble(Vehicle::getIloscAut);
}
