package aboba.module1.cycles;

import java.util.Scanner;

public class Task2 {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);

		System.out.println("Range (a,b): ");
		int a = in.nextInt();
		int b = in.nextInt();
		
		System.out.print("Step: ");
		int step = in.nextInt();
		
		for (int i = a; i <= b; i += step) {
			int result = (i > 2) ? i : i * -1;
			System.out.print(result + " ");
		}

	}

}
