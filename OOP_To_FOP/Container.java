package OOP_To_FOP;

public class Container implements ContainerInterface {
    @Override
    public String sayHelloTo(String name) {
        return "Hello " + name;
    }
}
