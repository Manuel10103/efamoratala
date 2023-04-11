package Tema2;
import java.util.Scanner;

public class ejercicio0 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("introduce el primer numero");
		int num1 = sc.nextInt();
		
		System.out.println("introduce el segundo numero");
		int num2 = sc.nextInt();
		
		System.out.println("introduce el tercer numero");
		int num3 = sc.nextInt();
		if ((num1>num2) && (num1>num3)) {
			System.out.println("el primer numero es el mas grande.");
		}else if ((num2>num1) && num2>num3) {
			System.out.println("el segundo numero es el mas grande.");
		}else {
			System.out.println("el tercer numero es el mas grande.");
		}
		
	}

}
