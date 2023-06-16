import java.util.Scanner;

public class IntInput {

    private Scanner scanner = new Scanner(System.in);

    public int enteredValue (String str) {
        System.out.printf("Enter %s digit%n", str);
        while (scanner.hasNext() && !scanner.hasNextInt()) {
            System.out.println("This is not a number, try again");
            scanner.next();
        }
        return scanner.nextInt();
    }
}


