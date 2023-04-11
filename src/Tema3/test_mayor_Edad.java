package Tema3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class test_mayor_Edad {
		private mayor_Edad mayoredad;
		
		public void escenario() {
			mayoredad = new mayor_Edad ();
	}
	@Test
	public void mayoredad() {
		escenario();
		boolean actual = mayoredad.mayoredad(19);
		boolean adulto = true;
		
		assertEquals(actual,adulto);
		
	}
}
