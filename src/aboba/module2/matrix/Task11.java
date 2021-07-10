package aboba.module2.matrix;

public class Task11 {
	
	public static void main(String[] args) {
		
		/*
		 * Матрица 10x20 с элементами (0-15)
		 */
		int[][] array = new int[10][20];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				array[i][j] = (int) (Math.random() * 15);
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
		//Однозначно нужен счетчик
		int fiveCounter = 0;
		System.out.print("Rows where 5 meets more than three times: ");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				fiveCounter += (array[i][j] == 5)? 1 : 0;
			}
			if (fiveCounter >= 3) System.out.print(i+1 + " ");
			fiveCounter = 0;
		}
	}

}
