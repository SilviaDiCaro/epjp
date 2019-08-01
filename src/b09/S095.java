package b09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S095 {
    public static void main(String[] args) {
        List<Integer> list = aList();
        System.out.println(list); 

      //  List <Integer> l2= new ArrayList<>();//lista vuota
        //l2.add(12);
        //l2.add(18);
        //l2.add(-5);
        //l2.add(-997);
    // System.out.println("L2: " + l2);
        
        System.out.println("At index 2: " + list.get(2));
        list.add(2, -997);//alla posizione 2, aggiungi l'elemento -997
        System.out.println("Index of -997: " + list.indexOf(-997));//in che posizione è l'elemento (indexOf)

        list.remove(3);
        list.set(3, 42);
        System.out.println(list);
    }

    private static List<Integer> aList() {
        return new ArrayList<Integer>(Arrays.asList(12, 18, -5, -2233));//ArrayList dà lista immodificabile, allora creo una lista, la duplico e la ritorno
    }
}
//arraylist è un oggetto con "vita propria" che può fare ciò che vuole--> copia su cui posso fare ciò che voglio
//Array.asList --> heap lunghezza fissa