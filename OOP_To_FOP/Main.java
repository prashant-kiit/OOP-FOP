package OOP_To_FOP;

public class Main {
    public static void main(String[] args) {
        ContainerInterface containerInterface = (String name) -> "Hello " + name;
        System.out.println(containerInterface.sayHelloTo("world"));
    }
}
