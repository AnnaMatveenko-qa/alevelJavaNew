package ua.matveenko.hw15;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Task1 {
    public static void main(String[] args) {
        Class<A> aClass = A.class;
        A a = null;
        try {
            Constructor<A> constructor = aClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            a = constructor.newInstance();
            System.out.println(a);
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException |
                 NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        try {
            Field field = aClass.getDeclaredField("name");
            Field fieldId = aClass.getDeclaredField("id");
            field.setAccessible(true);
            fieldId.setAccessible(true);
            field.set(a, "example");
            fieldId.set(a, "No ID");
            field.setAccessible(false);
            fieldId.setAccessible(false);
            System.out.println(a);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}