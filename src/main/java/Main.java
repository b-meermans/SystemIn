import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define where System.in will be streaming from.

        System.setIn(new CustomInputStream());

        // Demonstrating getting input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a number: ");
        int a = scanner.nextInt();
        System.out.println("Value is: " + a);

        System.out.println("Type in a number: ");
        int b = scanner.nextInt();

        System.out.println("Type in a boolean: ");
        boolean c = scanner.nextBoolean();

        System.out.println(a + " " + b);

        System.out.println(c);
        for (int i = 1; i < 5; i++) {
            System.out.printf("%d) Enter any text: ", i);
            String input = scanner.next(); // This will call bar() method because of the custom InputStream
            System.out.println("Java final result: " + input);
        }
    }
}
