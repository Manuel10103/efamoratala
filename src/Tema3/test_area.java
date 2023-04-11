package Tema3;

import org.junit.Test;

import junit.framework.TestCase;

public class test_area {

	public class teste_area extends TestCase {
		private Area area;
		
		
		public void escenario () {
			area = new Area ();
		}
		@Test
		public void testArea () {
			escenario ();
			assertEquals(area.area(4, 6),24);  
			
		}
	}

}
