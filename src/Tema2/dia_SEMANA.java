package Tema2;
import java.util.Scanner;

public class dia_SEMANA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un dia de la semana");
		String dia = null;
		dia=sc.nextLine();
		
		switch(dia) {
		case "lunes":
		case "martes":
		case "miercoles":
		case "jueves":
		case "viernes":
		System.out.println("este dia es laboral");
		break;
		case "sabado":
		case "domingo":
		System.out.println("es un dia festivo");
		default:
			System.out.println("introduce un dia de la semana");
		}
		
	}

}
