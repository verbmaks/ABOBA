package aboba.module1.linear;

import java.util.Scanner;

public class Task5 {

	private static Scanner in;
	
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		System.out.print("Your seconds = ");
		int seconds = in.nextInt();
		
		//Находим минуты и секундах сохраним остаток
		int minutes = seconds/60;
		seconds %= 60;
		
		//То же самое проделываем с часами
		int hours = minutes/60;
		minutes %= 60;
		
		System.out.println("ABOBA time is " + hours + "h " + minutes + "m " + seconds + "s");
	}

}
