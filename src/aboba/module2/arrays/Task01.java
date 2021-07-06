package aboba.module2.arrays;

import java.util.Scanner;

public class Task01 {

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
	    
	    //Зададим К
	    System.out.print("K = ");
		int k = in.nextInt();
	    
		//Находим сумму
	    int sum = 0;
	    for (int cell : array) {
			sum += (cell % k == 0)? cell : 0;
		}
	    
	    System.out.print("ABOBA sum is " + sum);
	}

}
