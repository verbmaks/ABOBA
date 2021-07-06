package aboba.module1.cycles;

import java.util.Scanner;

public class Task8 {

	private static Scanner in;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);

		System.out.print("First number: ");
		int num1 = in.nextInt();
		
		System.out.print("Second number: ");
		int num2 = in.nextInt();
		
		//Идея с boolean массивом реально угарная и позволяет не дублировать цифры в выводе
		boolean check[] = new boolean[10];
		while (num1 > 0) {
			int reminder = num1 % 10;
			num1 /= 10;
			
			int buff = num2;
			while (buff > 0) {
				if (buff % 10 == reminder) check[reminder] = true;
				buff /= 10;
			}
		}
		
		for (int i = 0; i < 10; i++) {
			if (check[i]) {
				System.out.print(i + " ");
			}
		}
	}

}
