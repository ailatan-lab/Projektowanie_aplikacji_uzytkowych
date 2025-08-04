import java.util.Arrays;
import java.util.ArrayList;
import  java.util.Collections;

public class Main {

    public static double findMedian(int[] num1, int[] num2) {
        int[] tab = new int[num1.length + num2.length];
        System.arraycopy(num1, 0, tab, 0, num1.length);
        System.arraycopy(num2, 0, tab, num1.length, num2.length);
        Arrays.sort(tab);
        if (tab.length % 2 != 0) {
            return tab[(tab.length - 1) / 2];
        } else {
            int mid = tab.length / 2;
            return (tab[mid] + tab[mid - 1]) / 2.0;
        }
    }

    public static void main(String[] args) {
        int[] num1 = {1, 3};
        int[] num2 = {2};
        double median = findMedian(num1, num2);
        System.out.println(median);
    }
}
