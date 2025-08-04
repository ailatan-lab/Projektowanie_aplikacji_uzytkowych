import java.util.List;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {


        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setVisible(true);

        
        //Utworzenie samochodow
        Vehicle auto1 = new Vehicle("Toyota", "Corolla", ItemCondition.NEW, 98889, 2003, 99988, 888);
        Vehicle auto2 = new Vehicle("BMW", "E36", ItemCondition.DAMAGE, 199799, 2009, 77652, 8889);
        Vehicle auto3 = new Vehicle("Audi", "90", ItemCondition.USED, 200440, 2667, 88298, 2777);
        Vehicle auto4 = new Vehicle("Honda", "Onda", ItemCondition.NEW, 1923294, 1999, 88726682, 9918);

        //Dodanie aut
        CarShowroom auta = new CarShowroom();
        auta.addProduct(auto1);
        auta.addProduct(auto2);
        auta.addProduct(auto3);
        auta.addProduct(auto4);

        //Wszystkie samochody
        System.out.println("Wszystkie samochody");
        auta.summary();
        System.out.println();

        //Szukanie po marce
        Vehicle autoToyota = auta.search("Toyota");
        if(autoToyota != null)
        {
            System.out.println("Samochód o marce Toyota");
            autoToyota.Print();
            System.out.println();
        }

        //Szukanie marki z frazą
        System.out.println("Samochody z 'Toyot' w marce lub modelu");

        List<Vehicle> autaToyt = auta.searchPartial("Toyot");
        for(Vehicle auto: autaToyt)
        {
            auto.Print();
            System.out.println();
        }

        //Sortowanie po marce
        System.out.println("Sortowanie po marce");

        List<Vehicle> posortowaniPoMarce = auta.sortByName();
        for(Vehicle auto: posortowaniPoMarce)
        {
            auto.Print();
            System.out.println();
        }

        //Sortowanie produktów po ilości malejąco
        System.out.println("Sortowanie produktów po ilości malejąco");

        List<Vehicle> posortowaniPoIlości = auta.sortByAmount();
        for(Vehicle pracownik: posortowaniPoIlości)
        {
            pracownik.Print();
            System.out.println();
        }

        //Samochód z max ilością
        System.out.println("Produkt którego jest najwięcej");

        Vehicle autoZMax = auta.Max();
        autoZMax.Print();
        System.out.println();

        //Utworzenie kontenerów salonów
        CarShowroomContainer kontener = new CarShowroomContainer();

        kontener.addCenter("Salon 1", 2);
        kontener.addCenter("Salon 2", 3);
        kontener.addCenter("Salon 3", 4);
        kontener.addCenter("Salon 0", 0);

        kontener.addCarToShowroom(autoZMax, "Salon 2");
        kontener.addCarToShowroom(autoZMax, "Salon 2");

        auta.getProduct(auto1);
        System.out.println("Wszystkie samochody");
        auta.summary();
        System.out.println();

        //Wyświetlenie kontenerów klas
        System.out.println("Wyświetlenie kontenerów salonów");
        kontener.summary();

        //Szukanie pustej klasy
        System.out.println("Szukanie pustego salonu");
        kontener.findEmpty();
        System.out.println();

        //Usunięcie klasy
        System.out.println("Usunięcie salonu");
        kontener.removeCenter("Salon 3");
        kontener.summary();

    }
}