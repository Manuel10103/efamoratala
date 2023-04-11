package Tema3;

public class mayor_Edad {

	public static void main(String[] args) {

	}
	public boolean mayoredad (int edad) {
		int mayor = 18;
		boolean situa = false;
		if (edad >= mayor) {
			situa = true;
			
		}else {
			situa = false;
		}
		return situa;
	}

}
