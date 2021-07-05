package aboba.module1.linear;

import java.util.Scanner;

public class Task2 {

	private static Scanner in;
	
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		System.out.print("a = ");
		double a = in.nextInt();
		
		System.out.print("b = ");
		double b = in.nextInt();
		
		System.out.print("c = ");
		double c = in.nextInt();
		
		double z = (b + Math.sqrt(Math.pow(b, 2) + 4*a*c))/(2*a) - Math.pow(a, 3) + Math.pow(b, -2);
		
		System.out.println("z = " + z);
		System.out.println("ABOBA");
	}

}
