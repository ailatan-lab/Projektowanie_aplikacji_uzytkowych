import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testConvertExample1() {
        String input = "PAYPALISHIRING";
        int numRows = 3;
        String expected = "PAHNAPLSIIGYIR";
        assertEquals(expected, Main.convert(input, numRows));
    }

    @Test
    public void testConvertExample2() {
        String input = "PAYPALISHIRING";
        int numRows = 4;
        String expected = "PINALSIGYAHRPI";
        assertEquals(expected, Main.convert(input, numRows));
    }

    @Test
    public void testConvertSingleCharacter() {
        String input = "A";
        int numRows = 1;
        String expected = "A";
        assertEquals(expected, Main.convert(input, numRows));
    }

    @Test
    public void testConvertTwoRows() {
        String input = "ABCD";
        int numRows = 2;
        String expected = "ACBD";
        assertEquals(expected, Main.convert(input, numRows));
    }

    @Test
    public void testConvertEmptyString() {
        String input = "";
        int numRows = 3;
        String expected = "";
        assertEquals(expected, Main.convert(input, numRows));
    }
}
