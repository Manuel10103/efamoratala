package Tema2;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ejercicio5_debug_practica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		System.out.println("introduce numero");
		num1 = sc.nextInt();
		int result=num1;
		System.out.println("cuantas veces se multiplica?");
		num2 = sc.nextInt();
		int i =1;
		while (i < num2) {
			result= result * num1;
			i++;
			System.out.println(result);
		}
		
		

	}

}
