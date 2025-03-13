import unittest
from add_numbers import add_numbers

class TestAddNumbers(unittest.TestCase):
    
    def test_valid_addition(self):
        self.assertEqual(add_numbers(2, 3), 5)
        self.assertEqual(add_numbers(-1, 1), 0)
        self.assertEqual(add_numbers(0, 0), 0)
        self.assertEqual(add_numbers(10.5, 2.5), 13.0)

    def test_invalid_inputs(self):
        with self.assertRaises(TypeError):
            add_numbers("a", 2)
        with self.assertRaises(TypeError):
            add_numbers(3, "b")
        with self.assertRaises(TypeError):
            add_numbers(None, 5)

if __name__ == "__main__":
    unittest.main()
