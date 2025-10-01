import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        final double KGS_TO_LBS = 2.20462262;
        final double LBS_TO_KGS = 0.45359237;


        double weight;
        double convertedWeight;
        int option;
        char repeat = 'y';

        System.out.println("================\nWEIGHT CONVERTER\n================");

        do {

            System.out.println("\nPlease select an option:");
            System.out.println("1. Convert Kilograms into Pounds");
            System.out.println("2. Convert Pounds into Kilograms");
            System.out.print("\nEnter the option number: ");

            if (in.hasNextInt()) {
                option = in.nextInt();

                if (option == 1) {
                    System.out.print("Enter the weight in Kilograms: ");
                    if (in.hasNextDouble()) {
                        weight = in.nextDouble();
                        if (weight < 0) {
                            System.out.println("Weight cannot be negative.");
                            continue;
                        }
                        convertedWeight = weight * KGS_TO_LBS;
                        System.out.printf("%.2f kg is equal to %.2f lb.%n%n", weight, convertedWeight);
                    } else {
                        System.out.println("INVALID INPUT! Please try again.");
                        in.next();
                    }
                } else if (option == 2) {
                    System.out.print("Enter the weight in Pounds: ");
                    if (in.hasNextDouble()) {
                        weight = in.nextDouble();
                        if (weight < 0) {
                            System.out.println("Weight cannot be negative.");
                            continue;
                        }
                        convertedWeight = weight * LBS_TO_KGS;
                        System.out.printf("%.2f lb is equal to %.2f kg.%n%n", weight, convertedWeight);
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

            System.out.print("Do you want to convert more? (Y/N): ");
            repeat = Character.toLowerCase(in.next().charAt(0));

            while (repeat != 'y' && repeat != 'n') {
                System.out.print("Only 'Y' or 'N' are acceptable. Try again: ");
                repeat = Character.toLowerCase(in.next().charAt(0));
            }

        }while (repeat == 'y') ;

        System.out.println("\nThanks for using Weight Converter.");
        System.out.println("Program Closed.");
        in.close();
    }
}
