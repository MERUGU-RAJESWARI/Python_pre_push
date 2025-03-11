#Rajeswari
#tyuiolkjhgvcv
def print_multiplication_table(number: int) -> None:
    for i in range(1, 11):
        print(f"{number} x {i} = {number * i}")

def calculate_multiplication(number: int, multiplier: int) -> int:
    if not isinstance(number, (int, float)) or not isinstance(multiplier, (int, float)):
        raise TypeError("Both number and multiplier must be integers or floats.")
    return number * multiplier

if __name__ == "__main__":
    print_multiplication_table(2)

