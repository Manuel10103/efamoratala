package Tema2;


public class tresenralla {

	public static void main(String[] args) {
		int [][] numeros = new int [3][3];
		rellenar(numeros);
		mostrar(numeros);
		
	}
	public static void rellenar(int[][] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				numeros [i][j] = (int) (Math.random()* 9) + 1;
			}
		}
	}
	public static void mostrar (int [][] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println();
			for (int j = 0; j < numeros[i].length; j++){
				System.out.print(numeros [i][j] + " | ");
				//cuando ponemos un syso y al rellenarlo ponemos println nos hace un salto de linea, si se lo quitamos no salta de linea 
			}
			
		}
	}
}
