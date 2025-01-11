package FOP_Reflection_Annotation;

import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
        // Configuration
        Method method = new Method();
        Container container = new Container();
        ContainerConfiguration containerConfiguration = new ContainerConfiguration(container, method);
        containerConfiguration.configure();
        System.out.println("Test");

        // Flow Controlled using Map of Input-Key and Function-Object
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        @SuppressWarnings("unchecked")
        Function<String, String> function = (Function<String, String>) container.getContainer().get(input);
        System.out.println(function.apply("world"));

        scanner.close();
    }
}
