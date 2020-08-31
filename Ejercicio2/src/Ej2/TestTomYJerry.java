package Ej2;

import junit.framework.TestCase;

public class TestTomYJerry extends TestCase {
	
	private Gato tom;
	private Raton jerry;
	
	public void setUp() {
		tom = new Gato();
		jerry = new Raton();
		
	}
	
	public void testAtraparRatonVerdadero() {
		tom.setEnergia(20);
		jerry.setPeso(4);
		assertTrue(tom.atraparRaton(tom.getVelocidad(), jerry.getVelocidad()));
	}
	
	public void testAtraparRatonFalso() {
		tom.setEnergia(10);
		jerry.setPeso(4);
		assertFalse(tom.atraparRaton(tom.getVelocidad(), jerry.getVelocidad()));
	}
	
	public void testTomCorreAJerry() {
		tom.setEnergia(20);
		jerry.setPeso(4);
		tom.setPosActual(30);
		jerry.setPosActual(34);
		tom.correrRaton(tom.getPosActual(),jerry.getPosActual());
		assertTrue(tom.getEnergia() == 6);
		assertTrue(tom.getPosActual() == 34);
	}
	
	
	
}
