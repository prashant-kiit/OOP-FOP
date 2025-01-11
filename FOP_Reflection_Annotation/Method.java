package FOP_Reflection_Annotation;

import java.util.function.Function;

public class Method {
    @Route(routeName = "hello")
    private Function<String, String> sayh = name -> "Hello " + name;

    @Route(routeName = "bye")
    private Function<String, String> sayb = name -> "Bye " + name;
}
