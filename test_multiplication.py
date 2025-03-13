import unittest
from multiplication import calculate_multiplication

class TestMultiplication(unittest.TestCase):
    def test_valid_multiplication(self):
        self.assertEqual(calculate_multiplication(2, 3), 6)
        self.assertEqual(calculate_multiplication(-1, 5), -5)

    def test_invalid_inputs(self):
        with self.assertRaises(TypeError):
            calculate_multiplication("a", 2)
        with self.assertRaises(TypeError):
            calculate_multiplication(3, "b")

    

if __name__ == "__main__":
    unittest.main()