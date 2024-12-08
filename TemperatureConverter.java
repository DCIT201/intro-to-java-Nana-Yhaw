import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Temperature Converter!");

        int choice = 0;

        // Prompt user until valid choice is entered
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Convert Fahrenheit to Celsius");
            System.out.print("Enter your choice (1 or 2): ");
            
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2) {
                    break; // Exit loop if valid choice
                } else {
                    System.out.println("Invalid choice. Please select 1 or 2.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }

        // Prompt for temperature value
        double temperature = 0.0;
        while (true) {
            System.out.print("Enter the temperature value: ");
            if (scanner.hasNextDouble()) {
                temperature = scanner.nextDouble();
                break; // Exit loop if valid temperature is entered
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear invalid input
            }
        }

        // Perform conversion based on user choice
        switch (choice) {
            case 1: // Celsius to Fahrenheit
                double fahrenheit = (temperature * 9 / 5) + 32;
                System.out.printf("%.2f°C is equal to %.2f°F%n", temperature, fahrenheit);
                break;

            case 2: // Fahrenheit to Celsius
                double celsius = (temperature - 32) * 5 / 9;
                System.out.printf("%.2f°F is equal to %.2f°C%n", temperature, celsius);
                break;

            default:
                System.out.println("Unexpected error occurred.");
        }

        System.out.println("Thank you for using the Temperature Converter!");
        scanner.close();
    }
}