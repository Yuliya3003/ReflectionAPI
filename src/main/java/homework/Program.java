package homework;

import java.lang.reflect.Method;

//Используя Reflection API, напишите программу, которая выводит на экран все методы класса String.

public class Program {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> stringClass = String.class;

        Method[] methods = stringClass.getDeclaredMethods();
        for (Method method:methods
             ) {
            System.out.printf("Method: %s\n", method.getName());
        }
    }



}
