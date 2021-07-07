package aboba.module2.arrays;

import java.util.Scanner;

public class Task09 {

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

	    //Счетчик повторов
	    int counter = 0;
	    //Контейнер для искомого числа и его количества повторов
	    int resultNumber = array[0];
	    int resultCount = 0;
	    
	    //Чекаем каждое число number
	    for (int number : array) {
	    	counter = 0;
			//Зная число прочекаем количество его повторов
	    	for (int i = 0; i < n; i++) {
	    		counter += (number == array[i])? 1 : 0;
	    	}
	    	//Смотрим что получилось
	    	if (counter > resultCount) {
	    		resultCount = counter;
	    		resultNumber = number;
	    		continue;
	    	}
	    	if (counter == resultCount && number < resultNumber) {
	    		resultNumber = number;
	    		continue;
	    	}
		}
	    
	    System.out.print("ABOBA most common number is " + resultNumber);
	}

}
