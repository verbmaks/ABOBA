package aboba.module2.matrix;

import java.util.Scanner;

public class Task08 {

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
		//С учетом того, что пользователь вводит номер столбца матрицы, а не массива
		//Предположим, что юзер не дебил и вводит столбцы в пределах матрицы
		System.out.print("Rows to swap. \nRow 1: ");
		int row1 = in.nextInt() - 1;
		System.out.print("Row 2: ");
		int row2 = in.nextInt() - 1;
		
		System.out.println("Result matrix: ");
		for (int i = 0; i < n; i++) {
			array[i][row1] = array[i][row1] + array[i][row2];
			array[i][row2] = array[i][row1] - array[i][row2];
			array[i][row1] = array[i][row1] - array[i][row2];
			for (int j = 0; j < n; j++) {				
				if (array[i][j] < 10) 
					System.out.print(" " + array[i][j] + " ");
				else 
					System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
