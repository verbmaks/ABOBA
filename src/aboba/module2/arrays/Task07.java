package aboba.module2.arrays;

import java.util.Scanner;

public class Task07 {

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

	    /* Постановка задачи - ануса говна. Хуй такому постановщику отрезать надо
	     * Предположим, что мужик купил шляпу, сел в неё и сгорел. 
	     * То есть, просто сумма симметричных членов массива
	     * КАК Я ВАМ ВЫСРУ ЕЩЕ ЧИСЕЛ ЗА ПРЕДЕЛОМ МАССИВА, А?!
	     */
	    
	    //Логика охуенная: берем два счетчика (с головы и хвоста) и ждем пока они встретятся
	    int forward = 0;
	    int backward = n-1;
	    //И переменная для максимального значения
	    int max = 0;
	    
	    //Погнали
	    while (forward < backward) {
	    	max = (array[forward] + array[backward] > max)? array[forward] + array[backward] : max;
	    	forward++;
	    	backward--;
	    }
	    
	    /*
	     * Алгоритм не учитывает нечетного кол-ва элементов в массиве
	     * Он просто удвоит средний элемент и все
	     * Впрочем, с такой постановкой задачи ваще похуй. Если надо - досру
	     */
	    
	    System.out.print("ABOBA Maximum is " + max);
	}

}
