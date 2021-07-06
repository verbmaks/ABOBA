package aboba.module2.arrays;

import java.util.Scanner;

public class Task04 {

	private static Scanner in;
	
	public static void main(String[] args) {

		in = new Scanner(System.in);

		//Старый код заполнения массива
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
	    
	    //Нужны буферы
	    int min = 0;
	    int max = 0;
	    
		//Ищем мин и макс
	    for (int i = 0; i < n; i++) {
	    	min = (array[i] < array[min])? i : min;
	    	max = (array[i] > array[max])? i : max;
	    }	    
	    
	    //Когда индексы этих ублюдков известны, проведем безбуферную замену
	    array[min] = array[min] + array[max];
	    array[max] = array[min] - array[max];
	    array[min] = array[min] - array[max];
	    
	    //Код вывода массива в консоль (в строку)
	    System.out.print("ABOBA Array: ");
	    for (int cell : array) {
			System.out.print(cell + " ");
		}
	}

}
