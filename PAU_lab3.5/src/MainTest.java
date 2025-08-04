import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest {

    @Test
    public void testPrintClockwiseExample1() {
        int[][] tab = {
                { 1, 2, 3, 4, 5},
                { 6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        List<Integer> expectedOutput = Arrays.asList(
                1, 6, 11, 16, 21, 22, 23, 24, 25, 20, 15, 10, 5, 4, 3, 2, 7, 12, 17, 18, 19, 14, 9, 8, 13
        );
        assertEquals(expectedOutput, capturePrintedOutput(() -> Main.printClockwise(tab)));
    }

    @Test
    public void testPrintClockwiseExample2() {
        int[][] tab = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> expectedOutput = Arrays.asList(1, 4, 7, 8, 9, 6, 3, 2, 5);
        assertEquals(expectedOutput, capturePrintedOutput(() -> Main.printClockwise(tab)));
    }
    

    // Metoda do przechwytywania wyjścia w konsoli
    private List<Integer> capturePrintedOutput(Runnable runnable) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        runnable.run();
        System.setOut(originalOut);
        String[] lines = outputStream.toString().split("\\r?\\n");
        List<Integer> output = new ArrayList<>();
        for (String line : lines) {
            output.add(Integer.parseInt(line.trim()));
        }
        return output;
    }
}
