import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting up!");


        // Define where System.in will be streaming from.
        System.setIn(new CustomInputStream());

        // Demonstrating getting input
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 5; i++) {
            System.out.printf("%d) Enter any text: ", i);
            String input = scanner.nextLine(); // This will call bar() method because of the custom InputStream
            System.out.println("Java final result: " + input);
        }
    }
}
