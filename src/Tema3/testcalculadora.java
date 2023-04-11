package Tema3;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;


	public class testcalculadora extends TestCase{
		private Calculadora calculadora;

	
	public void escenario () {
	calculadora = new Calculadora();	
	
	}
	@Test
	public void testSuma () {
		escenario();
		assertEquals(calculadora.suma(3, 5),8);
	}
	@Test
	public void testResta () {
		escenario ();
		assertEquals (calculadora.resta(5, 4),1);
	}
	@Test
	public void testMulti () {
		escenario ();
		assertEquals (calculadora.multi(5, 3),15);
	}
	@Test
	public void testDivisi () {
		escenario ();
		assertEquals (calculadora.divisi(20, 5),4);
	}
}
