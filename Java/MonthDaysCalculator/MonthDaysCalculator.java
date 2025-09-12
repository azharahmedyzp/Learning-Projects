import java.util.Scanner;

public class MonthDaysCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Month Days Calculator ===");
        System.out.println("Enter month names (full or 3-letter abbreviation)");
        System.out.println("Type \"End\" to exit the program");
        System.out.println("=============================");
        while (true) {
            System.out.print("Enter month's name: ");
            String monthName = scanner.nextLine().trim();
             if (monthName.equalsIgnoreCase("End")) {
                 System.out.println("Ending Program...");
                 break;
             }
        switch (monthName.toUpperCase()) {
            case "JANUARY", "JAN":
                System.out.println("January has 31 days.");
                break;
            case "FEBRUARY", "FEB":
                System.out.println("February has 28 or 29 days.");
                break;
            case "MARCH", "MAR":
                System.out.println("March has 31 days.");
                break;
            case "APRIL", "APR":
                System.out.println("April has 30 days.");
                break;
            case "MAY":
                System.out.println("May has 31 days.");
                break;
            case "JUNE", "JUN":
                System.out.println("June has 30 days.");
                break;
            case "JULY", "JUL":
                System.out.println("July has 31 days.");
                break;
            case "AUGUST", "AUG":
                System.out.println("August has 31 days.");
                break;
            case "SEPTEMBER", "SEP", "SEPT":
                System.out.println("September has 30 days.");
                break;
            case "OCTOBER", "OCT":
                System.out.println("October has 31 days.");
                break;
            case "NOVEMBER", "NOV":
                System.out.println("November has 30 days.");
                break;
            case "DECEMBER", "DEC":
                System.out.println("December has 31 days.");
                break;
            default:
                System.out.println("Invalid Month! Try again.");
        }
        }
        System.out.println("Program ended successfully!");
        scanner.close();
    }
}