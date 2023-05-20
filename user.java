import java.util.Scanner;

public class user{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Electricity Billing System");
        System.out.println("-----------------------------------------");

        // Read customer details
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter customer ID: ");
        String customerId = scanner.nextLine();

        System.out.print("Enter previous meter reading: ");
        int previousReading = scanner.nextInt();

        System.out.print("Enter current meter reading: ");
        int currentReading = scanner.nextInt();

        // Calculate electricity consumption and total amount
        int unitsConsumed = currentReading - previousReading;
        double totalAmount = calculateBill(unitsConsumed);

        // Display the bill
        System.out.println("\n--- Bill Details ---");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Previous Reading: " + previousReading + " units");
        System.out.println("Current Reading: " + currentReading + " units");
        System.out.println("Units Consumed: " + unitsConsumed + " units");
        System.out.println("Total Amount: $" + totalAmount);

        scanner.close();
    }

    // Calculate the bill amount based on units consumed
    public static double calculateBill(int unitsConsumed) {
        double ratePerUnit = 0.12; // Adjust this rate as per your requirements
        return unitsConsumed * ratePerUnit;
    }
}
