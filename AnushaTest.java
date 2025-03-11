import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnushaTest {
    
    @Test
    void testAdd() {
        // Test positive numbers
        assertEquals(10, Anusha.add(4, 6), "4 + 6 should be 10");
        
        // Test negative numbers
        assertEquals(-10, Anusha.add(-4, -6), "-4 + -6 should be -10");
        
        // Test mix of positive and negative numbers
        assertEquals(2, Anusha.add(5, -3), "5 + (-3) should be 2");
        
        // Test adding zero
        assertEquals(7, Anusha.add(7, 0), "7 + 0 should be 7");
        assertEquals(0, Anusha.add(0, 0), "0 + 0 should be 0");
    }
}