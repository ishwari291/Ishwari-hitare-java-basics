import java.util.Scanner; // Import the Scanner class

public class Main {
    public static void main(String[] args) {
        // 1. Create a Scanner object to read standard input (keyboard)
        Scanner scanner = new Scanner(System.in);

        // 2. Output a prompt and read a String
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // 3. Output a prompt and read an Integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // 4. Output a prompt and read a Double
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        // 5. Print the collected data back to the console
        System.out.println("\n--- User Profile ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);

        // 6. Close the scanner to release system resources
        scanner.close();
    }
}
