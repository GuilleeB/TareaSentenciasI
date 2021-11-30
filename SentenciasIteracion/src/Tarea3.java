//@Author:Guillermo Balaguer
import java.util.Scanner;

public class Tarea3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 0;
		int i = 1;
		while (i <= 10) {
			System.out.println("Imprime un numero: ");
			int num2 = in.nextInt();
			i++;
			if (num2 < 0) {
				num++;
			}
		}
		if (num > 0) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}

	}
}
