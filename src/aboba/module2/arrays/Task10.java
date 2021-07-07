package aboba.module2.arrays;

import java.util.Scanner;

public class Task10 {

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

	    //Сначала почистим массив от лишних элементов
	    for (int i = 0; i < n; i++) {
	    	array[i] = (i % 2 == 1)? 0 : array[i];
	    }
	    
	    System.out.print("ABOBA new array: " + array[0] + " ");
	    //А теперь двигаем жопой до середины массива
	    for (int i = 1; i <= n/2 + n%2 - 1; i++) {
	    	array[i] = array[2*i];
	    	array[2*i] = 0;
	    	System.out.print(array[i] + " ");
	    }
	}

}
