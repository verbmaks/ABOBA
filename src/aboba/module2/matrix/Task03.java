package aboba.module2.matrix;

import java.util.Scanner;

public class Task03 {

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
		System.out.print("ABOBA row: ");
		int row = in.nextInt();
		System.out.print("ABOBA column: ");
		int column = in.nextInt();
		
		//Я подумал, что крест нарисовать будет весьма угарно
		System.out.println("ABOBA matrix: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == row-1) || (j == column-1)) {
					if (array[i][j] < 10) 
						System.out.print(" " + array[i][j] + " ");
					else 
						System.out.print(array[i][j] + " ");
				}
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}

}
