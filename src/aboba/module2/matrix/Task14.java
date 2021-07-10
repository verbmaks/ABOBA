package aboba.module2.matrix;

import java.util.Scanner;

/*
 * Алгоритм:
 * - Создать массив [m][n], причем n <= m (иначе номер 
 * столбца не влезет)
 * - Заполнить его следующим образом: первые элементы забить
 * единицами, количество соответствует номеру столбца, остальное
 * забить нулями
 * - Случайным образом переставить элементы в массиве
 */
public class Task14 {

	private static Scanner in;
	
	public static void main(String[] args) {
		
		//столбцы
		int m;
		//строки
		int n;
		
		in = new Scanner(System.in);
		
		//Получим M
		System.out.print("Количество столбцов: ");
		m = in.nextInt(); 
		
		//Проверка размерности N
		do {
			System.out.print("Количество строк (не более " + m + "): ");
			n = in.nextInt(); 
			if (n > m) {
				System.out.println("Количество строк не может быть больше количества столбцов!");
			}
		} while (n > m);
		
		//Когда размер матрицы указан верно, можно приступить к её созданию
		int[][] array = new int[m][n];
		
		//Заполнение матрицы
		//Перебор каждой строки i-го столбца (номер столбца есть индекс элемента строки)
		for (int j = 0; j < n; j++) {
			//запомним номер столбца. Будем от него отнимать по единице
			int number = j+1;
			//если номер больше единицы, ставим 1
			for (int i = 0; i < m; i++) {
				array[i][j] = (number > 0) ? (1) : (0);
				number--;
			}
		}		
		
		//Встряска. Рандомизируем положение каждого элемента
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < m; i++) {
				//придумаем новое место для текущего элемента
				int newIndex = (int) (Math.random() * (m-1));
				//Безбуферная перестановка, исключая перестановку неизменного индекса
				if (newIndex != i) {
					array[i][j] = array[i][j] + array[newIndex][j];
					array[newIndex][j] = array[i][j] - array[newIndex][j];
					array[i][j] = array[i][j] - array[newIndex][j]; //По идее в этой строке нет необходимости, но для подстраховки пусть будет
				}
			}
		}

		//После встряски массива можно и вывести его на экран
		System.out.println("Сформированный массив:");
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < n; j++)
			{				
				 System.out.print(array[i][j] + " ");
			}
			System.out.print("\n");
		}
		
	}
	
}
