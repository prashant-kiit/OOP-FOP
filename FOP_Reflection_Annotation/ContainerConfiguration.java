package FOP_Reflection_Annotation;

import java.lang.reflect.Field;

public class ContainerConfiguration {
    private Container container;
    private Method method;

    public ContainerConfiguration(Container container, Method method) {
        this.method = method;
        this.container = container;
    }

    public void configure() throws IllegalArgumentException, IllegalAccessException {
        Field[] fields = method.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Object methodImplementation = field.get(method);
            System.out.println("Type : " + methodImplementation.getClass());
            System.out.println(field.getAnnotation(Route.class).routeName());
            System.out.println(methodImplementation);
            container.getContainer().put(field.getAnnotation(Route.class).routeName(), methodImplementation);
        }
    }
}
