import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        
        // 1. Declare and initialize an array directly (Array Literal)
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        
        // 2. Access elements using an index (Indices start at 0)
        System.out.println("First car: " + cars[0]); // Outputs: Volvo
        
        // 3. Find the length of the array
        System.out.println("Array size: " + cars.length); // Outputs: 4
        
        // 4. Change the value of a specific element
        cars[0] = "Opel";
        System.out.println("Updated first car: " + cars[0]); // Outputs: Opel
        
        // 5. Loop through the array using a standard for loop
        System.out.println("\nIterating using a standard for loop:");
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Index " + i + ": " + cars[i]);
        }
        
        // 6. Loop through the array using an enhanced for loop (for-each)
        System.out.println("\nIterating using an enhanced for loop:");
        for (String car : cars) {
            System.out.println(car);
        }
        
        // 7. Alternative way: Declare size first, then assign values
        int[] numbers = new int[3]; // Allocates memory for 3 integers
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        
        // Quickly print array contents using the Arrays utility class
        System.out.println("\nNumbers array: " + Arrays.toString(numbers));
    }
}
Use code with caution.
