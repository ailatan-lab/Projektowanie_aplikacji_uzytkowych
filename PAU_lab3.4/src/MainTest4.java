import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class MainTest {

    @Test
    public void testTrojkiExample1() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );
        assertEquals(expected, Main.trojki(nums));
    }

    @Test
    public void testTrojkiExample2() {
        int[] nums = {};
        List<List<Integer>> expected = Arrays.asList();
        assertEquals(expected, Main.trojki(nums));
    }

    @Test
    public void testTrojkiExample3() {
        int[] nums = {0};
        List<List<Integer>> expected = Arrays.asList();
        assertEquals(expected, Main.trojki(nums));
    }

    @Test
    public void testTrojkiExample4() {
        int[] nums = {0, 0, 0};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(0, 0, 0));
        assertEquals(expected, Main.trojki(nums));
    }
}
