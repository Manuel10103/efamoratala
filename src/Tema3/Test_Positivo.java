package Tema3;

import org.junit.Test;

public class Test_Positivo {
	private Positivo negativo;
	private void assertEqual(boolean actual, boolean negativ) {
		// TODO Auto-generated method stub
		
	}
	public void escenario () {
		negativo = new Positivo ();
		
	}
	@Test
	public void negativ ( ) {
		escenario();
		boolean actual = negativo.negativ(-3);
		boolean negativ = true;
		
		assertEqual(actual,negativ);
	}
	
	
	
}
