package aboba.module2.arrays;

import java.util.Scanner;

public class Task02 {

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
	    
	    //Зададим Z
	    System.out.print("Z = ");
		int z = in.nextInt();
	    
		//Погнали заменять
	    int counter = 0;
	    for (int cell : array) {
	    	if (cell > z) {
	    		cell = z;
	    		counter++;
	    	}
		}
	    
	    //Код вывода массива в консоль (в строку)
	    System.out.print("ABOBA Array: ");
	    for (int cell : array) {
			System.out.print(cell + " ");
		}
	    System.out.println();
	    
	    System.out.println("Changes count: " + counter);
	}

}
