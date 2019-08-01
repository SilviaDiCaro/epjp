package b09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class S100 {
    public static void main(String[] args) {
        Map<Integer, String> map = aMap();

        System.out.println("contains key 12: " + map.containsKey(12));
        System.out.println("contains value seven: " + map.containsValue("seven"));

        Set<Map.Entry<Integer, String>> items = map.entrySet();
        for (Map.Entry<Integer, String> item : items) {
            item.setValue(item.getValue() + "!");//cambia il valore di items e metti un "!"
        }

        Iterator<Map.Entry<Integer, String>> it = items.iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> item = it.next();
            System.out.println("Key: " + item.getKey() + ", value: " + item.getValue());
        }

        System.out.println("Value for key -1 (or null): " + map.get(-1));//per leggere il valore associato alla chiave se esiste, se no ritorna null
        System.out.println("Value for key -1 (or default): " + map.getOrDefault(-1, "missing"));//getorde-->stai cercando di accedere all'elemento chiave -1, se ha un valore lo ritorno, altrimenti dimmi tu cosa vuoi c he ritorni. è per evitare tanti null nel codice

        Set<Integer> keys = map.keySet();
        System.out.println("Keys are: " + keys);

        System.out.println("Previous value for 99 was: " + map.put(99, "nintynine"));//contrario di get, inserire. se avevo già 99, non inserisce un altro 99 ma sovrascrive novantanove con nintynine
        System.out.println("Current value for 99 is: " + map.putIfAbsent(99, "star")); 

        System.out.println("Removed value for key 23: " + map.remove(23));
        System.out.println("Replaced value for key 12: " + map.replace(12, "twelve"));//se 12 non c'è, ritorna null
        
        System.out.println("Size is " + map.size());
        System.out.println("Values are: " + map.values());

        map.clear();
        System.out.println("Is the map empty? " + map.isEmpty()); //collezione vuota
    }

    private static Map<Integer, String> aMap() {
        Map<Integer, String> result = new HashMap<>();
        result.put(7, "seven"); //col put riempio la mappa(chiave, valore)
        result.put(12, "twelve");
        result.put(23, "twentythree");
        result.put(31, "thirtyone");
        result.put(42, "fortytwo");

        return result;
    }

}
