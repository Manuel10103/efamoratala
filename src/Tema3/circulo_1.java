package Tema3;



import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

	
		public class circulo_1 extends TestCase{
			private Circulo circ;
			
			public void escenario () {
				circ = new Circulo ();
			}
			
			@Test
			public void testArea() {
				escenario();
				double esperado = 12.56 ;
				double calculo = circ.area(2);
				assertEquals(calculo,esperado);
				
			}
	}


