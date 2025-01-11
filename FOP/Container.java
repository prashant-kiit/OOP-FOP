package FOP;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Container {
    private Map<String, Function<String, String>> container = new HashMap<>();
    private Function<String, String> sayhelloTo = name -> "Hello " + name;
    private Function<String, String> sayByeTo = name -> "Bye " + name;

    public Container() {
        // use reflection api and annotations to skip this manual configuration of Control Flow
        container.put("hello", sayhelloTo);
        container.put("bye", sayByeTo);
    }

    public Map<String, Function<String, String>> getContainer() {
        return container;
    }
}
