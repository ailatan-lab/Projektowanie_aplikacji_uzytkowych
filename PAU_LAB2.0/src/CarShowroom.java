import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarShowroom{
    private String nazwaSalonu;
    private List<Vehicle> samochody = new ArrayList<Vehicle>();
    private int max_car = 10;
    private double pojemnoscSalonu;
    public int getMax_car() {return max_car;}
    public void setMax_car(int newMaxCar) {max_car = newMaxCar;}
    public double getPojemnoscSalonu() {return pojemnoscSalonu;}
    public void setPojemnoscSalonu(double newPojemnoscSalonu) {pojemnoscSalonu = newPojemnoscSalonu;}

    public int getSize() {return samochody.size();}
    public boolean addProduct(Vehicle newVehicle) {
        if (samochody.size() == max_car)
            return false;
        if(samochody.contains(newVehicle))
            samochody.get(samochody.indexOf(newVehicle)).setIloscAut(samochody.get(samochody.indexOf(newVehicle)).getIloscAut()+1);
        else
        samochody.add(newVehicle);
        return true;

    }
    public Vehicle getProduct(Vehicle v) {
        if(!samochody.contains(v))
            return null;
        Vehicle v1 = samochody.get(samochody.indexOf(v));
        v1.setIloscAut(v1.getIloscAut()-1);
        if(v1.getIloscAut() <= 0)
            samochody.remove(v1);
        return v1;
    }
    public boolean removeProduct(Vehicle v) {
        if(!samochody.contains(v))
            return false;
        samochody.remove(v);
        return  true;
    }
    public Vehicle search(String marka)
    {
        for(Vehicle samochod : samochody) {
            if( samochod.getMarka().compareTo(marka) == 0 )
                return samochod;
        }
        System.out.println("nie znaleziono "+marka+"\n");
        return null;
    }
    public List<Vehicle> searchPartial(String fraza)
    {
        List<Vehicle> output = new ArrayList<Vehicle>();
        for (Vehicle samochod : samochody) {
            if (samochod.getMarka().contains(fraza) || samochod.getModel().contains(fraza))
                output.add(samochod);
        }

        return output;
    }
    public int countByCondition(ItemCondition it)
    {
        int n = 0;
        for(Vehicle samochod : samochody)
            if(samochod.getStanSamochodu() == it)
                n++;
        return n;
    }
    public void summary()
    {
        for(Vehicle samochod : samochody)
            samochod.Print();
    }
    public List<Vehicle> sortByName()
    {
        List<Vehicle> output = new ArrayList<Vehicle>(samochody);
        Collections.sort(output);

        return output;
    }
    public List<Vehicle> sortByAmount()
    {
        List<Vehicle> output = new ArrayList<Vehicle>(samochody);
        Collections.sort(output, Vehicle.amountComparator.reversed());

        return output;
    }
    public Vehicle Max()
    {
        return Collections.max(samochody, Vehicle.amountComparator);
    }
}