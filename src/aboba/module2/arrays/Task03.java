package aboba.module2.arrays;

import java.util.Scanner;

public class Task03 {

	private static Scanner in;
	
	public static void main(String[] args) {

		in = new Scanner(System.in);

		//Старый код заполнения массива. Он мне нраица, поэтому сасите бибу
		System.out.print("Your array (with space delimeter): ");
		String line = in.nextLine();			//Строка с числами
		String delimeter = " ";					//Разделитель пробел
		String[] lines = line.split(delimeter);	//заполнение массива строк
		int n = lines.length;					//размерность массива
		int[] array = new int[n];				//Массив, который надо заполнить
	    for(int i = 0; i < n; i++) 				//Заполнение числового массива
	    { 
	    	array[i] = Integer.parseInt(lines[i]); 
	    }
	    
		//Необходимо три счетчика
	    int plusNumbers = 0;
	    int zeroNumbers = 0;
	    int minusNumbers = 0;

	    for (int cell : array) {
			if (cell > 0) {
				plusNumbers++;
				continue;
			}
			if (cell < 0) {
				minusNumbers++;
				continue;
			}
			zeroNumbers++;
		}
	    
	    System.out.println("ABOBA plus is " + plusNumbers);
	    System.out.println("ABOBA zero is " + zeroNumbers);
	    System.out.println("ABOBA minus is " + minusNumbers);
	}

}
