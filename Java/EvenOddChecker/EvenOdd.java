import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        char repeat;


        System.out.println("-----------------\nEven Odd Checker\n-----------------");

        do{
            System.out.print("\nEnter a number: ");
            if (inputNumber.hasNextLong()) {
                long number = inputNumber.nextLong();
                System.out.printf("The number %d is %s.%n", number, (number % 2 == 0) ? "EVEN" : "ODD");
            }
            else {
                System.out.println("Invalid input! Please enter a valid whole number.");
                inputNumber.next();
            }

            System.out.print("\nDo you want to repeat? (Y/N): ");
            repeat = Character.toLowerCase(inputNumber.next().charAt(0));

            while (!(repeat == 'y' || repeat == 'n')) {
                System.out.print("Only 'Y' or 'N' are acceptable: ");
                repeat = Character.toLowerCase(inputNumber.next().charAt(0));
            }

        } while(repeat == 'y');

        System.out.println("Program closed.");
        inputNumber.close();
    }
}
