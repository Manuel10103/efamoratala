package Tema3;

import org.junit.Test;

import junit.framework.TestCase;

public class test_rectangulo extends TestCase{
		private rectangulo rectanguloo;
		 
		public void escenario () {
			rectanguloo = new rectangulo();
			//lo que esta en azul oscuro es el nombre de la clase y va en mayuscula la primera y en clarito una instancia de esa clase, una clase puede tener muchas instacncias y hemos creado una de ellas 
			// en el escenario es instanciar un rectangulo de forma vacia 
			// para hacer metodos de prueba tenemos que utilizar @Test y en cada metodo tenemos que añadir las asercciones que es lo que de verdad nos dice si esta bien o mal
			// asertequals esta en verde cuando los dos parametros esten iguales , si no son iguales se ponran en rojo 
			//asertrue tiene un parametro solo u va a dar okey cuando el parametro sea true y si es false en rojo 
			
		}
		@Test
		public void testSuma () {
			escenario ();
			assertEquals(rectanguloo.perimetro (3, 4), 14);
		}
		
		
		
		
		
	}

