package aboba.module1.branch;

import java.util.Scanner;

public class Task3 {

	private static Scanner in;
	
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		System.out.print("Point1 (x,y): ");
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		
		System.out.print("Point2 (x,y): ");
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		
		System.out.print("Point3 (x,y): ");
		int x3 = in.nextInt();
		int y3 = in.nextInt();	
		
		if ((x2 - x1)/(x3 - x1) == (y2 - y1)/(y3 - y1)) {
			System.out.println("ABOBA points lying on one line");
		} else {
			System.out.println("ABOBA points do not lying on one line, they drunk");
		}	
	}
}
