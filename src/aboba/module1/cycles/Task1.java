package aboba.module1.cycles;

import java.util.Scanner;

public class Task1 {

	private static Scanner in;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);

		System.out.print("ABOBA number: ");
		int num = in.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= num; i++) sum += i;
		
		System.out.print("Sum: " + sum);

	}

}
