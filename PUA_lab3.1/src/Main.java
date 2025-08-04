import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int n = 50000;
        Random random = new Random();

        // Tworzenie tablicy o rozmiarze 1000
        int[] randomNumbers = new int[n];

        // Wypełnianie tablicy losowymi liczbami całkowitymi
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt();
        }

        ISortowanieStrategia sort = null;
        try {
            if(sort == null)
                throw new StrategiaNullException("Brak algorytmu sortowania!!!!!");
            long tStart = System.currentTimeMillis();
// uruchom sortowanie.
            sort.sort(randomNumbers, n);
            long tEnd = System.currentTimeMillis();
            long tDelta = tEnd - tStart;
            double elapsedSeconds = tDelta / 1000.0;
            System.out.println("Czas sortowania: " + elapsedSeconds);
        }catch(StrategiaNullException e){System.out.println(e.getMessage());}
    }
}