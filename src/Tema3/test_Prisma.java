package Tema3;

import org.junit.Test;

import junit.framework.TestCase;

public class test_Prisma extends TestCase{
 		private prisma area;
 		
 		
 		
 		public void escenario () {
 			area = new prisma();
	}
 	@Test
 	public void testprisma () {
 		escenario ();
 		int actual = area.volu(4, 5, 7);
 		int esperado = 140;
 		assertEquals (esperado, actual);
 	}
}
