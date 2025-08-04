import java.util.HashMap;
import java.util.Map;

public class CarShowroomContainer {
    private Map<String, CarShowroom> kontenery = new HashMap();

    public void addCenter(String nazwa, int ilosc) {
        if (!kontenery.containsKey(nazwa)) {
            CarShowroom salon = new CarShowroom();
            salon.setMax_car(ilosc);
            kontenery.put(nazwa, salon);
        } else {
            System.out.println("Samochód o nazwie " + nazwa + " już istnieje.");
        }
    }
    public void removeCenter(String nazwa) {
        if(kontenery.containsKey(nazwa))
            kontenery.remove(nazwa);
    }
    public void findEmpty()
    {
        kontenery.forEach((groupName, group) -> {
            if (group.getSize() == 0)
                System.out.println(groupName);
        });
    }
    public void summary()
    {
        kontenery.forEach((groupName, group) -> {
            System.out.println(groupName + ":");
            group.summary();
            System.out.println();
        });
    }

    public void addCarToShowroom(Vehicle v, String name) {
        kontenery.get(name).addProduct(v);
    }
}