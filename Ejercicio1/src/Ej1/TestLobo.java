package Ej1;

import junit.framework.TestCase;

public class TestLobo extends TestCase {
	
	Lobo lobo;
	
	public void setUp() {
		lobo = new Lobo();
		lobo.setCalorias(300);
	}
	
	public void testCalorias() {
		assertTrue(lobo.getCalorias() == 300);
	}
	
	public void testComerChanchito() {
		lobo.comerChanchito(300);
		assertTrue(lobo.getCalorias() == 330);
	}
	
	public void testEstaGordo() {
		assertEquals(true, lobo.estaGordo());
	}
	
	public void testEstaSaludable() {
		assertEquals(false, lobo.estaSaludable());

	}

}
