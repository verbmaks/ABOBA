package aboba.module1.branch;

import java.util.Scanner;

//Вычислить значение функции
public class Task5 {

	private static Scanner in;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		System.out.print("F(x), where x = ");
		double x = in.nextDouble();
		double result;
		
		if (x <= 3 ) {
			result = Math.pow(x,  2) - 3*x + 9;
		} else {
			result = 1/(Math.pow(x,  3) + 6);
		}
		
		System.out.println("F(x) = " + result);
	}

}
