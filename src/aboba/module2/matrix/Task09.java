package aboba.module2.matrix;

import java.util.Scanner;

public class Task09 {

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
		
		/**
		 * КОД ПРОГРАММЫ
		 */
		//Введем дополнительный массив для вывода итогов 
		//(я ж абапер, нет итога в таблице - получи по ебалу)
		int[] totals = new int[n];
		//И переменную для наибольшей суммы
		int highestTotal = 0;
		//Плюс индекс
		int highestTotalIndex = 0;
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				totals[j] += array[i][j]; 
			}
			if (totals[j] > highestTotal) {
				highestTotal = totals[j];
				highestTotalIndex = j+1;
			}
		}
		
		System.out.println("Result matrix: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {				
				if (array[i][j] < 10) 
					System.out.print("  " + array[i][j] + " ");
				else 
					System.out.print(" " + array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		//Итоги
		for (int total : totals) {
			System.out.print(total + " ");
		}
		System.out.println("\n");
		
		System.out.println("Row with highest total is: " + highestTotalIndex);
	}

}
