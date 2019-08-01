package b05;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

class SimpleTest {

	@Test //prende il nome di annotazione 
	void IsEvenTrue() { //metodo void -- metodo che testo(is even)
		Simple simple = new Simple(); //fase di inizializzazione
		boolean result = simple.isEven(42); //fase di esecuzione
		
		assertTrue(result); //fase di testing
	}
	@Test
	void IsEvenFalse() {
		Simple simple = new Simple(); //fase di inizializzazione
		boolean result = simple.isEven(-43);
		
		assertFalse(result);
}
	@Test   
	void IsEvenZero() { 
		Simple simple = new Simple();  
		boolean result = simple.isEven(0);  
		
		assertTrue(result);  
	}
}
