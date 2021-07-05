package aboba.module1.branch;

import java.util.Scanner;

public class Task1 {

	private static Scanner in;
	
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		System.out.print("first angle = ");
		int firstAngle = in.nextInt();
		
		System.out.print("next angle = ");
		int nextAngle = in.nextInt();
		
		if (firstAngle + nextAngle < 180) {
			System.out.print("ABOBA exist! ");
			if (firstAngle + nextAngle == 90) {
				System.out.println("And it's rectangular!");
			} else {
				System.out.println("ABOBA isn't rectangular.");
			}
		} else {
			System.out.println("ABOBA is not a triangle :(");
		}		
	}
}
