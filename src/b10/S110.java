package b10;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class S110 {
    private static void printIntegerMethods() {
        Class<?> c = Integer.class;
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }

    private static void printDefaultArrayListCapacity() {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);//arraylist un cui ho messo elemento 1

        try {
            Field field = ArrayList.class.getDeclaredField("elementData");//campo in al dove vengono messi i valori davvero, è privata e invisibile all'utente
            field.setAccessible(true);
            Object[] data = (Object[]) field.get(al);
            System.out.println("My ArrayList has capacity " + data.length);//accedo alla lunghezza della element data 
        } catch (NoSuchFieldException | SecurityException | IllegalAccessException e) {
            System.out.println("Couldn't get ArrayList capacity: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        printIntegerMethods();
        printDefaultArrayListCapacity();
    }
}
