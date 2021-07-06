package aboba.module1.cycles;

import java.util.Scanner;

public class Task7 {

	private static Scanner in;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);

		System.out.print("m: ");
		int m = in.nextInt();
		
		System.out.print("n: ");
		int n = in.nextInt();
		
		//Перебор числел в диапазоне
		for (int number = m; number <=n; number++) {
			System.out.print("Dividers for " + number + ": ");
			//Перебор делителей для числа number
			for (int divider = 2; divider < number; divider++) {
				if (number % divider == 0) System.out.print(divider + " ");
			}
			System.out.println();
		}
		System.out.println("ABOBA done");
	}

}
