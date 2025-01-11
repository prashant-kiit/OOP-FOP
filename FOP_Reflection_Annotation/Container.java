package FOP_Reflection_Annotation;
import java.util.HashMap;
import java.util.Map;

public class Container {
    private Map<String, Object> container = new HashMap<>();

    public Container() {
        // reflection api
    }

    public Map<String, Object> getContainer() {
        return container;
    }
}
