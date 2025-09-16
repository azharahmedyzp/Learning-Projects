# Month Days Calculator

A simple Java program that calculates the number of days in a given month based on user input.

## Features

- Accepts both full month names and 3-letter abbreviations
- Case-insensitive input handling
- Simple exit mechanism by typing "End"
- User-friendly interface with clear prompts

## How to Use

1. Compile the program:
   ```bash
   javac MonthDays.java
   ```

2. Run the program:
   ```bash
   java MonthDays
   ```

3. Enter month names when prompted (e.g., "January", "Jan", "FEB", "february")
4. Type "End" (case-insensitive) to exit the program

## Supported Input Formats

The program accepts:
- Full month names (e.g., "January", "February")
- 3-letter abbreviations (e.g., "Jan", "Feb")
- September can also be abbreviated as "Sept" (in addition to "Sep")

## Example Usage

```
=== Month Days Calculator ===
Enter month names (full or 3-letter abbreviation)
Type "End" to exit the program
=============================
Enter month's name: January
January has 31 days.
Enter month's name: feb
February has 28 or 29 days.
Enter month's name: apr
April has 30 days.
Enter month's name: End
Ending Program...
Program ended successfully!
```

## Notes

- February displays "28 or 29 days" to account for leap years
- The program handles invalid inputs by displaying an error message and prompting again

##
