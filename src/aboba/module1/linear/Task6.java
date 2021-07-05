package aboba.module1.linear;

import java.util.Scanner;

public class Task6 {

	private static Scanner in;
	
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		System.out.print("Your ABOBA point x = ");
		int x = in.nextInt();
		
		System.out.print("Your ABOBA point y = ");
		int y = in.nextInt();
		
		if (((x <=2 && y <= 4 && x >= -2 && y >= 0) || (x <=4 && y <= 0 && x >= -4 && y >= -3)) && (y != -1 && x != 0)) {
			System.out.println("POPAL");
		} else {
			System.out.println("MIMO");
		}
	}

}
