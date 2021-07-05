package aboba.module1.linear;

import java.util.Scanner;

public class Task1 {

	private static Scanner in;
	
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		System.out.print("a = ");
		double a = in.nextInt();
		
		System.out.print("b = ");
		double b = in.nextInt();
		
		System.out.print("c = ");
		double c = in.nextInt();
		
		double z = ((a - 3) * b / 2) + c;
		
		System.out.println("z = " + z);
		System.out.println("ABOBA");
	}

}
