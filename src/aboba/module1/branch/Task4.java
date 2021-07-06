package aboba.module1.branch;

import java.util.Scanner;

public class Task4 {

	private static Scanner in;
	
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		System.out.print("ABOBA brick (x,y,z): ");
		int brickX = in.nextInt();
		int brickY = in.nextInt();
		int brickZ = in.nextInt();
		
		System.out.print("ABOBA hole (x,y): ");
		int holeX = in.nextInt();
		int holeY = in.nextInt();
		
		if ((brickX <= holeX && brickY <= holeY) || (brickY <= holeX && brickX <= holeY)) {
			System.out.println("Brick fits to hole");
			return;
		}
		if ((brickX <= holeX && brickZ <= holeY) || (brickZ <= holeX && brickX <= holeY)) {
			System.out.println("Brick fits to hole");
			return;
		}
		if ((brickZ <= holeX && brickY <= holeY) || (brickY <= holeX && brickZ <= holeY)) {
			System.out.println("Brick fits to hole");
			return;
		}
		System.out.println("ABOBA, it's stuck!");
	}
}
