import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TafuriMartaTest_B {

	private static int n=1;
	
	@Before
	public void setUp() throws Exception {
		TafuriMartaClass t=new TafuriMartaClass(0, 0);
		System.out.println("Inizio test n."+n);
		n++;
	}
	
	@Test
	public void testTafuriMet1() {
		//fail("Not yet implemented");
		TafuriMartaClass t=new TafuriMartaClass(2, 4);
		assertEquals(24, t.TafuriMet(2, 4),0.2f);	//risultato errato
	}
	
	@Test
	public void testTafuriMet2() {
		//fail("Not yet implemented");
		TafuriMartaClass t=new TafuriMartaClass(7, 9);
		assertEquals(504, t.TafuriMet(7, 9),0.2f);	//risultato errato
	}
	
	@Test
	public void testTafuriMet3() {
		//fail("Not yet implemented");
		TafuriMartaClass t=new TafuriMartaClass(4, 6);
		assertEquals(120, t.TafuriMet(4, 6),0.2f);	//risultato errato
	}

}
