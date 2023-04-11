package Examenes;

public class EJERCICIO1 {

	public static void main(String[] args) {
		double n1, n2, division;
		n1=5;
		n2=3;
		division=n1/n2;
		boolean b = division>20;
		boolean a = n1<=8;
		if ((division>20)&&(n1<=8)) {
			System.out.println("La division es" + division + "es mayor que 100");
		}
			System.out.println("el primer condicional es " +b);
			System.out.println("el segundo condicional es " +a);
	}

}
