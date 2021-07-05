package aboba.module1.linear;

import java.util.Scanner;

public class Task4 {

	private static Scanner in;
	
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		System.out.print("number <nnn.ddd> = ");
		double number = in.nextDouble();
		
		//Целая часть
		double intPart = Math.floor(number);
		
		//Дробная часть
		double fractPart = Math.ceil((number - intPart) * 1000);
		
		//Меняем местами
		double newNumber = fractPart + intPart/1000;

		System.out.println("ABOBA is " + newNumber);
	}

}
