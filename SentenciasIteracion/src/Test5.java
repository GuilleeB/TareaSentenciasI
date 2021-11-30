//@Author:Guillermo Balaguer

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int num;
		int num2 = 0;
		System.out.println("Imprime un numero: ");
		num = in.nextInt();
		do {
			System.out.println("Imprime un numero del (1-100): ");
			num2 = in.nextInt();
			if (num2 < num) {
				System.out.println("MENOR");
			}
			else if (num2>num) {
				System.out.println("MAYOR");
			}
		}
		while (num2 != num);
		System.out.println("ACERTASTE");
	}
}
