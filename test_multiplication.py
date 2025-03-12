# #Rajeswari
# import unittest
# from multiplication import calculate_multiplication

# class TestMultiplication(unittest.TestCase):
#     def test_valid_multiplication(self):
#         self.assertEqual(calculate_multiplication(2, 3), 6)
#         self.assertEqual(calculate_multiplication(-1, 5), -5)

#     def test_invalid_inputs(self):
#         with self.assertRaises(TypeError):
#             calculate_multiplication("a", 2)
#         with self.assertRaises(TypeError):
#             calculate_multiplication(3, "b")

# if __name__ == "__main__":
#     unittest.main()


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