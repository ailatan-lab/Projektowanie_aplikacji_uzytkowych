import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testFindMedianOddLength() {
        int[] num1 = {1, 3};
        int[] num2 = {2};
        double expected = 2.0;
        assertEquals(expected, Main.findMedian(num1, num2));
    }

    @Test
    public void testFindMedianEvenLength() {
        int[] num1 = {1, 2};
        int[] num2 = {3, 4};
        double expected = 2.5;
        assertEquals(expected, Main.findMedian(num1, num2));
    }

    @Test
    public void testFindMedianFirstArrayEmpty() {
        int[] num1 = {};
        int[] num2 = {2, 3};
        double expected = 2.5;
        assertEquals(expected, Main.findMedian(num1, num2));
    }

    @Test
    public void testFindMedianSecondArrayEmpty() {
        int[] num1 = {1, 2, 3};
        int[] num2 = {};
        double expected = 2.0;
        assertEquals(expected, Main.findMedian(num1, num2));
    }


}
