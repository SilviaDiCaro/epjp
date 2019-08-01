package b09;

import java.util.ArrayList;
import java.util.Collection;

public class Tabella {

	private Collection<Integer> data = new ArrayList<Integer>();

	public void add(Integer a) {//delega:prende la chiamata e la delega al suo arraylist interno. chi mi chiama può fare un add dell'array list
		data.add(a);
	}

	public boolean check(Integer a) {//(integer a-->lista dei parametri)
		return data.contains(a);//check delega contains
	}
	public void getData() {
	 	((ArrayList<Integer>) data).sort(null);//copia ordinata dell'array (non in ordine crescente)
	 	//nuova array list + sorting e ritornavo la copia
	}
}
//classe tabella che ha come proprietà (nome di variabile d'istanza o di classe) un ArrayList
//nella parte dati c'è collection
//ArrayList non statica 
//Statica--> la parte dati è sempre la stessa
//tutti gli oggetti lavorano su quella arraylist se static