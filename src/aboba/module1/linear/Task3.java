package aboba.module1.linear;

import java.util.Scanner;

public class Task3 {

	private static Scanner in;
	
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		System.out.print("x = ");
		double x = in.nextInt();
		
		System.out.print("y = ");
		double y = in.nextInt();
		
		double z = (Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y)) * Math.tan(x*y);
		
		System.out.println("z = " + z);
		System.out.println("ABOBA");
	}

}
