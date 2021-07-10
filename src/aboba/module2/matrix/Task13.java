package aboba.module2.matrix;

import java.util.Scanner;

public class Task13 {

	private static Scanner in;
	
	public static void main(String[] args) {

		in = new Scanner(System.in);
		
		/*
		 * Создание и заполнение КВАДРАТНОЙ матрицы 
		 * с рандомными элементами (0-100)
		 * array - матрица
		 * n - размерность матрицы
		 */
		System.out.print("Matrix range: ");
		int n = in.nextInt();
		int[][] array = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = (int) (Math.random() * 100);
			}
		}
		
		/*
		 * Вывод матрицы в консоль
		 * (Удалить блок, если не нужен)
		 */
		System.out.println("Created matrix: ");
		for (int[] line : array) {
			for (int cell : line) {
				//Выравнивание
				if (cell < 10) 
					System.out.print(" " + cell + " ");
				else 
					System.out.print(cell + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		/**
		 * КОД ПРОГРАММЫ
		 */

		for (int j = 0; j < n; j++) {
			
			//СортировОЧКА (шейкерная)
			boolean isSorted; 
			
			do {
				isSorted = true;
				
				//Едем вперед
				for (int k = 1; k < n; k++) {
					if (array[k][j] < array[k-1][j]) {
						//Безбуферная перестановка элементов
						array[k][j] = array[k][j] + array[k-1][j];
						array[k-1][j] = array[k][j] - array[k-1][j];
						array[k][j] = array[k][j] - array[k-1][j];
						//Так как перенстановки были, помечаем что массив несортирован
						isSorted = false;
					}				
				}
				
				//Если при прогоне вперед перестановок не было, дальше сортировать нет смысла
				if (isSorted) break;
				
				//Едем назад
				for (int k = n-2; k > 1; k--)
				{
					if (array[k][j] > array[k+1][j]) {
						//Безбуферная перестановка элементов
						array[k][j] = array[k][j] + array[k+1][j];
						array[k+1][j] = array[k][j] - array[k+1][j];
						array[k][j] = array[k][j] - array[k+1][j];
						//Так как перенстановки были, помечаем что массив несортирован
						isSorted = false;
					}
				}
			} while (!isSorted);

		}
		
		/*
		 * Вывод матрицы в консоль
		 * (Удалить блок, если не нужен)
		 */
		System.out.println("Sortded matrix: ");
		for (int[] line : array) {
			for (int cell : line) {
				//Выравнивание
				if (cell < 10) 
					System.out.print(" " + cell + " ");
				else 
					System.out.print(cell + " ");
			}
			System.out.println();
		}
	}

}
