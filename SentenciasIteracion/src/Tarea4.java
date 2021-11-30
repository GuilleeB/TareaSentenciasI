//@Author:Guillermo Balaguer
import java.util.Scanner;

public class Tarea4 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int result = 10;
		int num;
		int x = -1;
		do {
			System.out.println("Introduce un numero entre (0-10): ");
			num = in.nextInt();
		}
		while (!(num == -1));
		//No consigo dar con una solucion para que cuando lea el 10 diga si.
		if (num == result) {
		System.out.println("SI");
		}
	}
}
	

	


			


