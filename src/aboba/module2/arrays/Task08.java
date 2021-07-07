package aboba.module2.arrays;

import java.util.Scanner;

public class Task08 {

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

	    
	    //Найдем прожиточный минимум
	    int min = array[0];
	    for (int cell : array) {
			min = (cell < min)? cell : min;
		}
	    
	    //Уже здесь можно было бы формировать новый массив, но найдем
	    //количество элементов, равное min
	    int minCounter = 0;
	    int newLength;
	    for (int cell : array) {
			minCounter += (cell == min)? 1 : 0;
		}
	    newLength = n - minCounter;
	    
	    //А теперь формируем новый массив
	    int[] newArray = new int[newLength];
	    int i = 0;
	    for (int cell : array) {
			if (cell != min) {
				newArray[i] = cell;
				i++;
			}
		}
	    
	    //Вывод срани на экран
	    System.out.print("ABOBA Array: ");
	    for (int cell : newArray) {
			System.out.print(cell + " ");
		}
	}

}
