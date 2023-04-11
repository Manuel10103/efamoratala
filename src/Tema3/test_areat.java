package Tema3;

import org.junit.Test;

import junit.framework.TestCase;

public class test_areat {

	public class test_areat_ extends TestCase{
		private areatri area;
		
		
		public void escenario () {
			area = new areatri ();
			
		}
		@Test
		public void testareatri () {
			escenario ();
			boolean actual =  area.area(3, 5, 4);
			assertEquals(actual);
		}

	}

}
