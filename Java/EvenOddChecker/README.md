
## 🔢 Even Odd Checker

A simple console program to determine whether a given number is **Even** or **Odd**.

### Features
- Accepts **whole numbers**, including positive, negative, and zero.
- Handles **invalid input** (letters, decimals, or empty input) gracefully.
- Allows the user to **repeat** the check as many times as needed.
- Uses **modulus operator (%)** to check parity.
- Input is **case-insensitive** for repeat option (`Y`/`N`).

### How It Works
1. The program asks the user to input a number.
2. It checks if the number is even or odd using `number % 2`.
3. Displays the result in a formatted message.
4. Prompts the user if they want to repeat the program.
5. Validates the user’s response for `Y` or `N`.

### Sample Output
-----------------
Even Odd Checker
-----------------

Enter a number: 12
The number 12 is EVEN.

Do you want to repeat? (Y/N): y

Enter a number: 37
The number 37 is ODD.

Do you want to repeat? (Y/N): n
Program closed.

---
