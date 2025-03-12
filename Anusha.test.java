import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class AnushaMainTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testMainMethod() {
        String simulatedInput = "3\n5\n"; // Simulate user input: 3 + 5
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        Anusha.main(new String[]{});

        assertTrue(outputStream.toString().contains("Sum: 8"));
    }
}
