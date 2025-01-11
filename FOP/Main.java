package FOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Flow Controlled using Map of Input-Key and Function-Object
        new Container().getContainer().get(input).apply("world");

        scanner.close();

    }
}
