import java.util.Scanner;

public class BasicCalculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char run = 'Y';

        while(run !='N' && run != 'n') {
            double numberOne = 0, numberTwo = 0;
            boolean valid = false;
            boolean validAnswer = false;

            while(!valid){
                System.out.print("Enter First Number: ");
                if (input.hasNextDouble()){
                    numberOne = input.nextDouble();
                    valid = true;
                }
                else {
                    System.out.println("Invalid input! Please enter a number.");
                    input.next();
                }
            }

            valid = false;
            while(!valid) {
                System.out.print("Enter Second Number: ");
                if (input.hasNextDouble()) {
                    numberTwo = input.nextDouble();
                    valid = true;
                }
                else{
                    System.out.println("Invalid input! Please enter a number.");
                    input.next();
                }
            }

            System.out.print("Choose operator (+, -, *, /, %): ");
            String operator = input.next().trim();

            switch (operator) {
                case "+":
                    System.out.printf("%s + %s = %.2f%n", numberOne, numberTwo, (numberOne + numberTwo));
                    break;

                case "-":
                    System.out.printf("%s - %s = %.2f%n", numberOne, numberTwo, (numberOne - numberTwo));
                    break;

                case "*":
                    System.out.printf("%s * %s = %.2f%n", numberOne, numberTwo, (numberOne * numberTwo));
                    break;

                case "/":
                    if (numberTwo != 0)
                        System.out.printf("%s / %s = %.2f%n", numberOne, numberTwo, (numberOne / numberTwo));
                    else
                        System.out.println("Error: Division by zero!");
                    break;

                case "%":
                    if (numberTwo != 0)
                        System.out.printf("%s %% %s = %.2f%n", numberOne, numberTwo, (numberOne % numberTwo));
                    else
                        System.out.println("Error: Division by zero!");
                    break;

                default:
                    System.out.println("Invalid operator! Try again.");
            }

            while (!validAnswer) {
                System.out.print("Do you want to continue? (Y/N): ");
                String answer = input.next().trim();

                if (answer.length() == 1) {
                    run = answer.charAt(0);
                    if (run == 'Y' || run == 'y' || run == 'N' || run == 'n') {
                        validAnswer = true;
                    } else {
                        System.out.println("Invalid choice! Please enter Y or N.");
                    }
                } else {
                    System.out.println("Invalid input! Please enter a single character (Y/N).");
                }
            }
        }
        System.out.println("Calculator closed.");
        input.close();
    }
}
