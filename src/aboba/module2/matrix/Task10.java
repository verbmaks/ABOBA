package aboba.module2.matrix;

import java.util.Scanner;

public class Task10 {

	private static Scanner in;
	
	public static void main(String[] args) {

		in = new Scanner(System.in);
		
		/**
		 * Создание и заполнение КВАДРАТНОЙ матрицы 
		 * с рандомными элементами (-100 - 100)
		 * array - матрица
		 * n - размерность матрицы
		 */
		System.out.print("Matrix range: ");
		int n = in.nextInt();
		int[][] array = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = (int) (Math.random() * 200) - 100;
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
				if (cell >= 0) {
					if (cell < 10 && cell > -10) System.out.print(" ");
					System.out.print(" " + cell + " ");
				}
				else {
					if (cell < 10 && cell > -10) System.out.print(" ");
					System.out.print(cell + " ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		
		/**
		 * КОД ПРОГРАММЫ
		 */
		System.out.println("Positive diagonal elements: ");
		int i = 0;
		int j = 0;
		do {
			if (array[i][j] > 0)
				System.out.print(array[i][j] + " ");
			i++;
			j++;
		} while (i < n);
	}

}
