package aboba.module1.cycles;

import java.util.Scanner;

public class Task5 {

	private static Scanner in;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);

		System.out.print("e = ");
		double e = in.nextDouble();
		//Член ряда
		double a = 1./2. + 1./3.;
		//Номер члена (2 так как первый уже посчитан)
		int n = 2;
		//Результат 
		double result = 0;
		
		while (Math.abs(a) >= e) {
			result += a;
			a = (1/Math.pow(2, n) + 1/Math.pow(3, n));
			n++;
		};
		
		System.out.println("Summary of " + (n-1) + " members: " + result);

	}

}
