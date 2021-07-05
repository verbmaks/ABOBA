package aboba.module1.branch;

import java.util.Scanner;

public class Task2 {

	private static Scanner in;
	
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
			
		System.out.print("Your first number = ");
		int a = in.nextInt();
		
		System.out.print("Your second number = ");
		int b = in.nextInt();
		
		System.out.print("Your third number = ");
		int c = in.nextInt();
		
		System.out.print("Your last number = ");
		int d = in.nextInt();
		
		int min1 = (a - b > 0)? a : b;
		int min2 = (c - d > 0)? c : d;
		int result = (min1 - min2 < 0)? min1 : min2;
		
		System.out.print("ABOBA winner is " + result);	
	}
}
