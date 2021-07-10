package aboba.module2.matrix;

import java.util.Scanner;

public class Task05 {

	private static Scanner in;
	
	public static void main(String[] args) {

		in = new Scanner(System.in);
		
		/**
		 * КОД ПРОГРАММЫ
		 * array - матрица
		 * n - размерность матрицы
		 */
		int n;
		do {
			System.out.print("Matrix range (even!): ");
			n = in.nextInt();
		} while (n % 2 != 0);
		int[][] array = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = (i <= n-j-1)? j+1 : 0;
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
	}

}
