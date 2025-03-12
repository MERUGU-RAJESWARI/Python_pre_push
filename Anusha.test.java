import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class AnushaTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testAdd() {
        // Test with positive numbers
        assertEquals(10, Anusha.add(4, 6), "4 + 6 should be 10");

        // Test with negative numbers
        assertEquals(-10, Anusha.add(-4, -6), "-4 + -6 should be -10");

        // Test with mix of positive and negative numbers
        assertEquals(2, Anusha.add(5, -3), "5 + (-3) should be 2");

        // Test with zero
        assertEquals(7, Anusha.add(7, 0), "7 + 0 should be 7");
        assertEquals(0, Anusha.add(0, 0), "0 + 0 should be 0");
    }

    @Test
    void testMainMethod() {
        // Simulate user input: "4\n6\n"
        String simulatedInput = "4\n6\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        // Run main method
        Anusha.main(new String[]{});

        // Verify output
        String expectedOutput = "Enter first number: Enter second number: Sum: 10";
        assertTrue(outputStream.toString().replaceAll("\\r\\n", "").replaceAll("\\n", "").contains(expectedOutput),
                "Main method output mismatch");
    }
}
