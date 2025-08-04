public class Main {
    public static void main(String[] args) {
        int[][] tab = {
                { 1, 2, 3, 4, 5},
                { 6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        printClockwise(tab);
    }

    public static void printClockwise(int[][] tab) {
        int m = tab.length; //wiersz
        int n = tab[0].length; //kolumna
        int top = 0, bottom = m - 1, left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            // Wypisz lewą kolumnę (przeciwnie do kierunku zegara)
            for (int i = top; i <= bottom; i++) {
                System.out.println(tab[i][left]);
            }
            left++;

            // Wypisz górny wiersz (przeciwnie do kierunku zegara)
            for (int i = left; i <= right; i++) {
                System.out.println(tab[bottom][i]);
            }
            bottom--;

            // Wypisz prawą kolumnę (przeciwnie do kierunku zegara)
            for (int i = bottom; i >= top; i--) {
                System.out.println(tab[i][right]);
            }
            right--;

            // Wypisz dolny wiersz (przeciwnie do kierunku zegara)
            for (int i = right; i >= left; i--) {
                System.out.println(tab[top][i]);
            }
            top++;
        }
    }
}