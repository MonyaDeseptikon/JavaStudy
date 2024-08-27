import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HW2 {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException,
            IllegalAccessException, NoSuchFieldException, NoSuchMethodException {
//        Class<?> stringClass = Class.forName("String");
        Class<String> stringClass = String.class;
        Method[] methods = stringClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Поле: " + method.getName());
        }
    }
}