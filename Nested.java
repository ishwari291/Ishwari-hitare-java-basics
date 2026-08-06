public class NestedLoopExample {
    public static void main(String[] args) {
        // Outer loop
        for (int i = 1; i <= 3; i++) {
            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println(); // Moves to next line after inner loop completes
        }
    }
}
