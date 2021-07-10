package aboba.module2.matrix;

import java.util.Scanner;

public class Task07 {

	private static Scanner in;
	
	public static void main(String[] args) {

		in = new Scanner(System.in);
		
		/**
		 * КОД ПРОГРАММЫ
		 * array - матрица
		 * n - размерность матрицы
		 * posSum - количество положительных элементов
		 */
		int posSum = 0;
		System.out.print("Matrix range: ");
		int n = in.nextInt();
		double[][] array = new double[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				//с учетом, что I и J начинаются с 1, а не с 0
				array[i][j] = Math.sin((Math.pow(i+1,2) - Math.pow(j+1, 2))/n);
				posSum += (array[i][j] >= 0)? 1 : 0;
			}
		}
		
		/**
		 * Вывод матрицы в консоль double элементов
		 * (Удалить блок, если не нужен)
		 */
		System.out.println("Created matrix: ");
		for (double[] line : array) {
			for (double cell : line) {
				//Выравнивание
				if (cell >= 0) 
					System.out.print(" " + String.format("%.3f",cell) + " ");
				else 
					System.out.print(String.format("%.3f",cell) + " ");
			}
			System.out.println();
		}
		System.out.println("Positive cells number: " + posSum);
	}

}
