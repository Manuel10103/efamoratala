package Tema2;
import java.util.Scanner;

public class ejercicio00 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0, n2 = 0, n3;
		
		System.out.println("introduce un numero");
		n1=sc.nextInt();
		System.out.println("introduce el segundo numero");
		n2=sc.nextInt();
		System.out.println("introduce el tercer numero");
		n3=sc.nextInt();
		if(n1>n2) {
			
			if (n1>n3){
				System.out.println("El mayor es: " + n1);
				
			}else {
				System.out.println("EL mayor es: " +n3);
			}
		}else if (n2>n3) {
			System.out.println("El mayor es: " + n2);
		}else {
			System.out.println("EL mayor es: " + n3);
	
		}
		
		
		
		
	}

}
