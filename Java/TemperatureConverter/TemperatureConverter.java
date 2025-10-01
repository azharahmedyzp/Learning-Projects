import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double temp;
        double convertedTemp;
        int option;
        char repeat = 'y';

        System.out.println("=====================\nTEMPERATURE CONVERTER\n=====================");

        do {

            System.out.println("\nSelect one of the options below:");
            System.out.println("1. Convert Celsius into Fahrenheit");
            System.out.println("2. Convert Fahrenheit into Celsius");
            System.out.print("\nEnter the option number: ");

            if (in.hasNextInt()) {
                option = in.nextInt();

                if (option == 1) {
                    System.out.print("Enter the temperature in Celsius: ");
                    if (in.hasNextDouble()) {
                        temp = in.nextDouble();
                        convertedTemp = ( 9.0 / 5.0 ) * temp + 32;
                        System.out.printf("%.2f°C is equal to %.2f°F.%n%n", temp, convertedTemp);
                    } else {
                        System.out.println("INVALID INPUT! Please try again.");
                        in.next();
                    }
                } else if (option == 2) {
                    System.out.print("Enter the temperature in Fahrenheit: ");
                    if (in.hasNextDouble()) {
                        temp = in.nextDouble();
                        convertedTemp = ((temp - 32) * (5.0 / 9.0));
                        System.out.printf("%.2f°F is equal to %.2f°C.%n%n", temp, convertedTemp);
                    } else {
                        System.out.println("INVALID INPUT! Please try again.");
                        in.next();
                    }
                } else {
                    System.out.println("INVALID OPTION! Please choose option 1 or 2.");
                }
            } else {
                System.out.println("INVALID OPTION! Please enter a number.");
                in.next();
            }

            System.out.print("Do you want to continue the program? (Y/N): ");
            repeat = Character.toLowerCase(in.next().charAt(0));

            while (repeat != 'y' && repeat != 'n') {
                System.out.print("Only 'Y' or 'N' are acceptable. Try again: ");
                repeat = Character.toLowerCase(in.next().charAt(0));
            }

        }while (repeat == 'y') ;

        System.out.println("\nThanks for using Temperature Converter.");
        System.out.println("Program Closed.");
        in.close();
    }
}
