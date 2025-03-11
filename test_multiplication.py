#rajeswari 
import pytest
from multiplication import calculate_multiplication

@pytest.mark.parametrize("number, multiplier", [
    (num, mul) for num in range(1, 11) for mul in range(1, 11)
])
def test_multiply_numbers(number, multiplier):
    try:
        result = calculate_multiplication(number, multiplier)
        assert result == number * multiplier
    except TypeError as e:
        assert "Both number and multiplier must be integers or floats" in str(e)

@pytest.mark.parametrize("number", [
    3.14,  # Example float
    None,
    "abc",
])
def test_invalid_input(number):
    with pytest.raises(TypeError):
        calculate_multiplication(number, 10)

@pytest.mark.parametrize("number, multiplier", [
    (num, mul) for num in range(1, 11) for mul in range(1, 11) if num % mul != 0
])
def test_invalid_multiplication(number, multiplier):
    with pytest.raises(ValueError, match="Multiplier must divide the number"):
        calculate_multiplication(number, multiplier)

@pytest.mark.parametrize("number", [
    float("inf"),
    float("-inf"),
])
def test_infinity(number):
    assert calculate_multiplication(number, 1) == number

@pytest.mark.parametrize("number, multiplier", [(10, 0)])
def test_multiply_by_zero(number, multiplier):
    assert calculate_multiplication(number, multiplier) == 0