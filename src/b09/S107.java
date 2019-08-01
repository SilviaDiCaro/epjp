package b09;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class S107 {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("alpha", "beta", "gamma", "delta");

        TreeSet<String> ts = new TreeSet<>(data); 
        System.out.println("Simple tree: " + ts);

        class MyStringComparator implements Comparator<String> {
            public int compare(String s, String t) {
                return s.compareTo(t);
               
            }
        }

        MyStringComparator msc = new MyStringComparator();//msc comparatore istanziato

        TreeSet<String> ts2 = new TreeSet<>(msc);
        ts2.addAll(data);
        System.out.println("A tree initialized with a comparator (same as default): " + ts2);

        TreeSet<String> ts3 = new TreeSet<>(msc.reversed());
        ts3.addAll(data);
        System.out.println("A tree initialized with a reversed comparator: " + ts3);

        TreeSet<String> ts4 = new TreeSet<>((s, t) -> t.compareTo(s));//funzione in java 8. passo la funzione che voglio venga applicata su cui applicare compare to. è per dire che voglio fare il reverse
        ts4.addAll(data);
        System.out.println("A tree initialized with a lambda comparator: " + ts4);
    }
}
 

