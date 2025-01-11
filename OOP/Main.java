package OOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Flow Controlled using If Else Block
        if (input.equals("hello")) {
            new Container().sayHelloTo("world");
        }
        if (input.equals("bye")) {
            new Container().sayByeTo("world");
        }

        scanner.close();
    }
}
