import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define where System.in will be streaming from.

        System.setIn(new CustomInputStream());

        // Demonstrating getting input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in an int: ");
        int a = scanner.nextInt();
        System.out.println("Value is: " + a);

        System.out.println("Type in a double: ");
        double b = scanner.nextDouble();
        System.out.println("Value is: " + b);

        System.out.println("Type in a boolean: ");
        boolean c = scanner.nextBoolean();
        System.out.println("Value is: " + c);

        System.out.println("You will be entering five separate tokens");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d) Enter any text: ", i);
            String input = scanner.next(); // This will call bar() method because of the custom InputStream
            System.out.println("Result: " + input);
        }

        System.out.println("Type in a sentence:");
        String sentence = scanner.nextLine();
        System.out.println("The sentence was:\n" + sentence);

        System.out.println("Type in a second sentence:");
        sentence = scanner.nextLine();
        System.out.println("The sentence was:\n" + sentence);

        System.out.print("Finally, type in an int: ");
        a = scanner.nextInt();
        System.out.println("Final int: " + a);
    }
}
