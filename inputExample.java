import java.util.Scanner;

public class inputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking an integer input
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        System.out.println("Integer value: " + intValue);

        // Taking a float input
        System.out.print("Enter a float: ");
        float floatValue = scanner.nextFloat();
        System.out.println("Float value: " + floatValue);

        // Taking a character input
        System.out.print("Enter a character: ");
        char charValue = scanner.next().charAt(0);
        System.out.println("Character value: " + charValue);

        // Taking a string input (one word)
        System.out.print("Enter a word: ");
        String stringValue = scanner.next();
        System.out.println("String value: " + stringValue);

        // Taking a boolean input
        System.out.print("Enter a boolean (true/false): ");
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("Boolean value: " + booleanValue);

        // Taking a full line of text input
        scanner.nextLine(); // Consume newline left-over
        System.out.print("Enter a line of text: ");
        String lineValue = scanner.nextLine();
        System.out.println("Line value: " + lineValue);

        scanner.close();
    }
}
