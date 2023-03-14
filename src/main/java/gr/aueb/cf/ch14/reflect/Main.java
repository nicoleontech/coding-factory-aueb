package gr.aueb.cf.ch14.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("gr.aueb.cf/src/ch14/reflect/Teacher.java");

            Constructor<?> defaultConstructor = clazz.getConstructor();
            defaultConstructor.setAccessible(true);
            Teacher teacher = (Teacher) defaultConstructor.newInstance();

            Constructor<?> longConstructor = clazz.getConstructor(Long.class);
            Teacher teacher2 = (Teacher) defaultConstructor.newInstance(10L);

            Method sayHello = clazz.getMethod("sayHello");
            sayHello.invoke(teacher);

            Method saySomething = clazz.getMethod("saySomething", String.class);
            saySomething.invoke(teacher2, "Coding Factory");

            System.out.println();

            Constructor<?>[] constructorsList = clazz.getDeclaredConstructors();
            System.out.println(Arrays.toString(constructorsList));

            Method[] methodsList = clazz.getDeclaredMethods();
            for (Method m : methodsList) {
                System.out.println("Method name " + m.getName());
                int mod = m.getModifiers();
                System.out.println(Modifier.toString(mod));
            }

            Field[] fieldsList = clazz.getDeclaredFields();
            for (Field f : fieldsList) {
                System.out.println("Field name " + f.getName());
                int fModifiers = f.getModifiers();
                System.out.println(Modifier.toString(fModifiers));
            }


        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
