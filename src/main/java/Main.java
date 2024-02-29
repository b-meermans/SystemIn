import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.setIn(new CustomInputStream());
        testC();
    }

    public static void testC() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            // Prompt for an integer and then another integer.
            System.out.println("Enter an integer:");
            int firstInt = Integer.parseInt(reader.readLine());
            System.out.println("You entered: " + firstInt);

            System.out.println("Enter another integer:");
            int secondInt = Integer.parseInt(reader.readLine());
            System.out.println("You entered: " + secondInt);

            // Prompt for a line of text.
            System.out.println("Enter a line of text:");
            String line = reader.readLine();
            System.out.println("You entered: \"" + line + "\"");

            // Prompt for a boolean.
            System.out.println("Enter a boolean value (true or false):");
            boolean booleanValue = Boolean.parseBoolean(reader.readLine());
            System.out.println("You entered: " + booleanValue);

            // Prompt for a double.
            System.out.println("Enter a double:");
            double doubleValue = Double.parseDouble(reader.readLine());
            System.out.println("You entered: " + doubleValue);

            // Series of varied prompts.
            System.out.println("Enter a word:");
            String word = reader.readLine();
            System.out.println("You entered: " + word);

            System.out.println("Enter a long integer:");
            long longValue = Long.parseLong(reader.readLine());
            System.out.println("You entered: " + longValue);

            System.out.println("Now, enter a float:");
            float floatValue = Float.parseFloat(reader.readLine());
            System.out.println("You entered: " + floatValue);

            // Add more prompts as needed
            System.out.println("Enter a single character:");
            char character = (char) reader.read();
            reader.readLine();  // Consume the newline left after reading the character.
            System.out.println("You entered: " + character);

            System.out.println("Enter a byte value:");
            byte byteValue = Byte.parseByte(reader.readLine());
            System.out.println("You entered: " + byteValue);

            // Concluding with a series of rapid prompts
            System.out.println("Enter a short value:");
            short shortValue = Short.parseShort(reader.readLine());
            System.out.println("You entered: " + shortValue);

            System.out.println("Finally, enter another line of text:");
            String finalLine = reader.readLine();
            System.out.println("You entered: \"" + finalLine + "\"");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void testB() {
        // Demonstrating getting input
        Scanner scanner = new Scanner(System.in);


        // Prompt for an int and then another int.
        System.out.println("Enter an integer:");
        int firstInt = scanner.nextInt();
        System.out.println("You entered: " + firstInt);

        System.out.println("Enter another integer:");
        int secondInt = scanner.nextInt();
        scanner.nextLine();  // Consume the leftover newline
        System.out.println("You entered: " + secondInt);

        // Prompt for a string.
        System.out.println("Enter a line of text:");
        String line = scanner.nextLine();
        System.out.println("You entered: \"" + line + "\"");

        // Prompt for a boolean.
        System.out.println("Enter a boolean value (true or false):");
        boolean booleanValue = scanner.nextBoolean();
        scanner.nextLine();  // Consume the leftover newline
        System.out.println("You entered: " + booleanValue);

        // Prompt for a double.
        System.out.println("Enter a double:");
        double doubleValue = scanner.nextDouble();
        scanner.nextLine();  // Consume the leftover newline
        System.out.println("You entered: " + doubleValue);

        // Series of varied prompts.
        System.out.println("Enter a word:");
        String word = scanner.next();
        System.out.println("You entered: " + word);

        scanner.nextLine();  // Consume the leftover newline

        System.out.println("Enter a long integer:");
        long longValue = scanner.nextLong();
        scanner.nextLine();  // Consume the leftover newline
        System.out.println("You entered: " + longValue);

        System.out.println("Now, enter a float:");
        float floatValue = scanner.nextFloat();
        scanner.nextLine();  // Consume the leftover newline
        System.out.println("You entered: " + floatValue);

        // Add more prompts as needed
        System.out.println("Enter a single character:");
        String charInput = scanner.nextLine();
        char character = charInput.length() > 0 ? charInput.charAt(0) : ' ';
        System.out.println("You entered: " + character);

        System.out.println("Enter a byte value:");
        byte byteValue = scanner.nextByte();
        scanner.nextLine();  // Consume the leftover newline
        System.out.println("You entered: " + byteValue);

        // Concluding with a series of rapid prompts
        System.out.println("Enter a short value:");
        short shortValue = scanner.nextShort();
        scanner.nextLine();  // Consume the leftover newline
        System.out.println("You entered: " + shortValue);

        System.out.println("Finally, enter another line of text:");
        String finalLine = scanner.nextLine();
        System.out.println("You entered: \"" + finalLine + "\"");
    }

    public static void testA() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in an int: ");
        int a = scanner.nextInt();
        System.out.println("Value is: " + a);

        System.out.println("Type in a second int: ");
        a = scanner.nextInt();
        System.out.println("Second value is: " + a);

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

        System.out.println("This call is meant to grab the next line - but that nextLine should be skipped:");
        String sentence = scanner.nextLine();
        System.out.println("The data was:\n" + sentence);

        System.out.println("Type in a second sentence:");
        sentence = scanner.nextLine();
        System.out.println("The sentence was:\n" + sentence);

        System.out.println("Type in a third sentence:");
        sentence = scanner.nextLine();
        System.out.println("The sentence was:\n" + sentence);


        System.out.print("Finally, type in an int: ");
        a = scanner.nextInt();
        System.out.println("Final int: " + a);
    }
}
