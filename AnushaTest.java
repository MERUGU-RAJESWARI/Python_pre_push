import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AnushaTest {

    @Test
    void testAdditionPositiveNumbers() {
        assertEquals(5, Anusha.add(2, 3), "2 + 3 should be 5");
    }

    @Test
    void testAdditionNegativeNumbers() {
        assertEquals(-5, Anusha.add(-2, -3), "-2 + -3 should be -5");
    }

    @Test
    void testAdditionWithZero() {
        assertEquals(7, Anusha.add(7, 0), "7 + 0 should be 7");
        assertEquals(0, Anusha.add(0, 0), "0 + 0 should be 0");
    }

    @Test
    void testAdditionLargeNumbers() {
        assertEquals(1000000, Anusha.add(500000, 500000), "500000 + 500000 should be 1000000");
    }
}
