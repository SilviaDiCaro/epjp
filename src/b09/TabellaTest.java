package b09;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import ex.S54;


class TabellaTest {

	@Test
	void addPlain() {
		Tabella tab = new Tabella();
		tab.add(7);
		tab.add(5);
	}
	
// @Test
// void testTabella2() {
// int[] actual =  Tabella.getData (5, 7);
//
// assertThat(actual[1], is(5));
// assertThat(actual[2], is(7));
//		
//	}
// @Test
//	void testTabella3() {
//	 boolean actual = Tabella.check(27);
//	 assertThat(actual, is(false));
//}

}
