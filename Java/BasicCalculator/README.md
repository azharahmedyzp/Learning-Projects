# Basic Calculator

A simple Java command-line calculator that performs basic arithmetic operations with user input validation.

## Features

- **Basic Operations**: Addition, subtraction, multiplication, division, and modulus
- **Input Validation**: Ensures all numeric inputs are valid numbers
- **Division Protection**: Prevents division by zero errors
- **Continue Prompt**: Allows users to perform multiple calculations in one session
- **Formatted Output**: Displays results with two decimal places for consistency

## How to Use

1. Compile the program:
   ```bash
   javac BasicCalculator.java
   ```

2. Run the program:
   ```bash
   java BasicCalculator
   ```

3. Follow the prompts:
   - Enter two numbers when requested
   - Choose an operator (+, -, *, /, %)
   - Decide whether to continue with another calculation

## Supported Operations

| Operator | Operation | Example Input |
|----------|-----------|---------------|
| +        | Addition | 5 + 3 = 8 |
| -        | Subtraction | 5 - 3 = 2 |
| *        | Multiplication | 5 * 3 = 15 |
| /        | Division | 6 / 3 = 2 |
| %        | Modulus | 7 % 3 = 1 |

## Example Usage

```
Enter First Number: 10
Enter Second Number: 3
Choose operator (+, -, *, /, %): /
10.0 / 3.0 = 3.33
Do you want to continue? (Y/N): Y
Enter First Number: 7
Enter Second Number: 4
Choose operator (+, -, *, /, %): %
7.0 % 4.0 = 3.00
Do you want to continue? (Y/N): N
Calculator closed.
```

## Error Handling

- Invalid numeric inputs are caught with appropriate error messages
- Division by zero is prevented with a clear error message
- Only valid operators are accepted
- Continue prompt only accepts Y/y/N/n responses

## Notes

- Results are displayed with two decimal places for consistency
- The program will continue running until the user explicitly chooses to exit
- All inputs are validated to ensure the calculator operates correctly

## License

This project is open source and available under the MIT License.
