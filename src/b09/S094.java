package b09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class S094 {
    public static void main(String[] args) {
        Collection<Integer> coll = emptyCollection(); //il primo collection è interfaccia, coll è reference,per emptyCollection() guarda la riga 49

        coll.addAll(aCollection());
        System.out.println(coll);

        if (coll.contains(-2233)) {//passo il primitivo che viene trasormato automaticamente in integer
            System.out.println("-2233 is there");
        }

        if (coll.equals(aCollection())) {
            System.out.println("Same collection");
        }

        coll.add(42);
        if (!coll.equals(aCollection())) {//"!" significa "not"
            System.out.println("Different collection");
        }

        System.out.println("The collection has " + coll.size() + " elements"); //size per il numero di elementi

        Iterator<Integer> it = coll.iterator();//non sono molto usati adesso gli iteratori (si usa for each)
        System.out.print("{ ");
        while (it.hasNext()) {//finché l'iteratore ha successore, prendi next e stampalo
            System.out.print(it.next() + " ");//sposta l'iteratore e ritorna il valore contenuto (prima di fare next devo  fare has next)
        }
        
        
       
        System.out.println('}');
        System.out.print("{ ");
        for(Integer value: coll) {
        	System.out.println(value + " ");
        }
        System.out.print("} ");
        
        
        coll.remove(-5);//boxing, diventa oggetto e viene rimosso dalla collection
        
        Integer[] values = coll.toArray(new Integer[coll.size()]);
        System.out.println(Arrays.toString(values));
        
        coll.retainAll(aCollection());
        System.out.println(coll);
        
        coll.clear();
        System.out.println("Collection is empty? " + coll.isEmpty());
    }

    private static Collection<Integer> emptyCollection() { //non iporta come funzioni emptycollection, è una collection e la tratto come tale
        Collection<Integer> result = new ArrayList<Integer>();

        return result;
    }

    private static Collection<Integer> aCollection() {
        return Arrays.asList(12, 18, -5, -2233); //la classe arrays funziona viene trasformata in collection
    }//parto da una sequenza di valori per ottenere una lista
    //ritorna un reference a una lista
  //metodi per array (asList prende una sequenza di valori e la converte in una lista che è un tipo di collezione)
    //se devo inizializzare la lista, asList è il modo più comodo per inizializzare i valori
}
