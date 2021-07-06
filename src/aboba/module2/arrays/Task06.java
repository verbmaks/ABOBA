package aboba.module2.arrays;

import java.util.Scanner;

public class Task06 {

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

	    int sum = 0;
	    
	    //Чекаем индекс и выводим элемент в сосноль
	    for (int i = 1; i <= n; i++) {
	    	boolean isPrime = true; //Флаг простого числа
	    	for (int divider = 2; divider < i; divider++) {
	    		if (i % divider == 0) {
	    			isPrime = false;
	    			break;
	    		}
	    	}
	    	sum += (isPrime)? array[i-1] : 0;
	    }
	    
	    System.out.print("ABOBA Prime sum = " + sum);
	}

}
