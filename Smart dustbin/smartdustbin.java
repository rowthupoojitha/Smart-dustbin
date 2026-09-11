```java
import java.util.Scanner;

public class SmartDustbin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("       SMART DUSTBIN SYSTEM       ");
        System.out.println("=================================");

        System.out.print("Enter dustbin capacity (%): ");
        int capacity = scanner.nextInt();

        // Validate input
        if (capacity < 0 || capacity > 100) {
            System.out.println("Invalid input! Enter a value between 0 and 100.");
        } else {

            System.out.println("\nDustbin Fill Level: " + capacity + "%");

            // Simulate smart dustbin sensor
            if (capacity >= 90) {
                System.out.println("Status: FULL");
                System.out.println("Alert: Dustbin is almost full!");
                System.out.println("Action: Please empty the dustbin.");
            } else if (capacity >= 70) {
                System.out.println("Status: NEARLY FULL");
                System.out.println("Warning: Dustbin needs attention soon.");
            } else if (capacity >= 30) {
                System.out.println("Status: HALF FILLED");
                System.out.println("Dustbin is working normally.");
            } else {
                System.out.println("Status: LOW");
                System.out.println("Dustbin has enough space.");
            }
        }

        scanner.close();
    }
}
```