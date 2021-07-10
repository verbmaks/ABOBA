package aboba.module2.matrix;

import java.util.Scanner;

/**
 * 
 * БУБАЛЕХ, ТЕБЕ ПИЗДА.
 * 				Я НАСРАЛ, ТЕБЕ РАЗГРЕБАТЬ, Ы)
 *
 */

/*
 * Магические квадраты ебать!
 * Здесь раньше времени применю декомпозицию
 * Потому что идите нахуй, вот почему
 */
public class Task16 {
	
	private static Scanner in;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		//Получим порядок квадрата
		System.out.print("Square range: ");
		int range = in.nextInt();
		
		//Подготовим матрицу для квадрата
		int[][] magicSquare = new int[range][range];

		//Определим порядок квадрата
		if (range % 2 != 0) 
			oddSquare(range, magicSquare);			//нечетный квадрат
		else
			if ((range/2) % 2 != 0)
				evenOddSquare(range, magicSquare);	//четно-нечетный
			else
				evenEvenSquare(range, magicSquare);	//четно-четный
		
		//Проверим квадрат
		//Сумма, которая должна получиться по всем строкам, столбцам и диагоналям
		int magicSum = (range * ((int)Math.pow(range, 2) + 1))/2;
		//Флаг магичности
		boolean isMagic = true;
		//Проверочная сумма
		int checkSum = 0;
		
		//По строкам
		for (int[] line : magicSquare) {
			checkSum = 0;
			for (int cell : line) {
				checkSum += cell;
			}
			if (checkSum != magicSum) isMagic = false;
		}
		
		//По столбцам
		for (int j = 0; j < range; j++) {
			checkSum = 0;
			for (int i = 0; i < range; i++) {
				checkSum += magicSquare[i][j];				
			}
			if (checkSum != magicSum) isMagic = false;
		}
		
		//Диагонали
		checkSum = 0;
		for (int i = 0; i < range; i++) {
			checkSum += magicSquare[i][i];
		}
		if (checkSum != magicSum) isMagic = false;
		
		checkSum = 0;
		int col = range-1;
		for (int i = 0; i < range; i++) {
				checkSum += magicSquare[i][col--];				
		}
		if (checkSum != magicSum) isMagic = false;
		if (!isMagic) System.out.println("ABOBA IS NOT MAGIC!");
		else System.out.println("MAGIC SQUARE! ABOBA! ABOBA! ABOBA!");		
		
		/*
		 * Вывод матрицы в консоль
		 * (Удалить блок, если не нужен)
		 */
		System.out.println("Created matrix: ");
		for (int[] line : magicSquare) {
			for (int cell : line) {
				//Выравнивание
				if (cell < 100) {
					if (cell < 10) System.out.print(" ");
					System.out.print(" " + cell + " ");
				}
				else 
					System.out.print(cell + " ");
			}
			System.out.println();
		}
	}
	
	/*
	 * Сборка нечетного квадрата
	 * Он также вызывается для сборки четно-нечетного квадрата
	 * Сборка происходит методом терасс
	 */
	private static void oddSquare(int range, int[][] square) {
		//Для начала потребуется временный рабочий массив
		//Размерность нового массива
		int n = range*2-1;
		int[][] array = new int[n][n];
		
		//Начальное положение 
		int iStart = range-1;
		int jStart = 0;
		
		//Счетчик заполнения
		int numCount = 0;
		
		//Нам надо знать размер террас, это половина порядка минус один
		int nHalf = (range - 1)/2;
		
		//Заполнение рабочего массива
		do {
			int i = iStart;
			int j = jStart;
			do {
				array[i--][j++] = ++numCount;
			} while (numCount % range != 0);
			iStart++;
			jStart++;
		} while (numCount != Math.pow(range, 2));
		
		//Переставляем террасы
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				//В первую очередь нам нужны не нули
				if (array[i][j] == 0) continue;
				//Перемещаем элемент на range в зависимости от его расположения
				//Так как на месте назначения стоит ноль, нужное число можно просто туда поставить
				if (i < nHalf) array[i+range][j] = array[i][j];
				if (j < nHalf) array[i][j+range] = array[i][j];
				if (j >= nHalf + range) array[i][j-range] = array[i][j];
				if (i >= nHalf + range) array[i-range][j] = array[i][j];
			}
		}
		
		//Когда квадрат готов, можно перенести его в целевой массив
		for (int i = 0; i < range; i++) {
			for (int j = 0; j < range; j++) {
				square[i][j] = array[i+nHalf][j+nHalf];
			}
		}	
		
	}
	
	/*
	 * Сборка четно-четного квадрата
	 * метод полутеррас
	 */
	private static void evenEvenSquare(int range, int[][] square) {
		//Для начала потребуется временный рабочий массив
		//Размерность нового массива
		int n = range*2-1;
		int[][] array = new int[n][range];
		
		//Нам надо знать размер террас, это половина порядка минус один
		int nHalf = (range - 1)/2;
		
		//Начальное положение 
		int iStart = nHalf + 1;
		
		//Счетчик заполнения
		int numCount = 0;
		
		//Заполнение рабочего массива
		//Здесь говнокодище, но зато быстро придумано. 
		//Строится по два ромба (один левый, другой правый, оба пидорасы)
		do {
			int i = iStart;
			int j = -1;
			
			//Ромб вправо
			do {
				array[--i][++j] = ++numCount;
			} while (numCount % (range/2) != 0);
			j++;
			do {
				array[i++][j++] = ++numCount;
			} while (numCount % (range/2) != 0);
			j--;
			do {
				array[i++][j--] = ++numCount;
			} while (numCount % (range/2) != 0);
			i--;
			do {
				array[i--][j--] = ++numCount;
			} while (numCount % (range/2) != 0);
			
			//Ромб влево
			j += range;
			i += 2;
			do {
				array[i--][j--] = ++numCount;
			} while (numCount % (range/2) != 0);
			i++;
			do {
				array[i++][j--] = ++numCount;
			} while (numCount % (range/2) != 0);
			j++;
			do {
				array[i++][j++] = ++numCount;
			} while (numCount % (range/2) != 0);
			i--;
			do {
				array[i--][j++] = ++numCount;
			} while (numCount % (range/2) != 0);
			
			iStart += 4;
		} while (numCount != Math.pow(range, 2));
		
		//Когда говнокод отработал, можно собрать магический квадрат
		//переставив полутеррасы
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < range; j++) {
				//В первую очередь нам нужны не нули
				if (array[i][j] == 0) continue;
				//Перемещаем элемент на range в зависимости от его расположения
				//Так как на месте назначения стоит ноль, нужное число можно просто туда поставить
				if (i < nHalf) array[i+range][j] = array[i][j];
				if (i >= nHalf + range) array[i-range][j] = array[i][j];
			}
		}
		
		//Когда квадрат готов, можно перенести его в целевой массив
		for (int i = 0; i < range; i++) {
			for (int j = 0; j < range; j++) {
				square[i][j] = array[i+nHalf][j];
			}
		}
	}
	
	/*
	 * Сборка четно-нечетного
	 * Используется сборка нечетного квадрата
	 */
	private static void evenOddSquare(int range, int[][] square) {
		//В четверть квадрата нужно собрать нечетный
		int halfRange = range/2;
		int[][] fourthArray = new int[halfRange][halfRange];
		
		//Сборка квадрата
		oddSquare(halfRange, fourthArray);
		
		//Заполним четверти
		for (int i = 0; i < halfRange; i++) {
			for (int j = 0; j < halfRange; j++) {
				square[i][j] = fourthArray[i][j];
				square[i + halfRange][j + halfRange] = fourthArray[i][j] + (int)Math.pow(halfRange, 2);
				square[i][j + halfRange] = fourthArray[i][j] + (int)Math.pow(halfRange, 2)*2;
				square[i + halfRange][j] = fourthArray[i][j] + (int)Math.pow(halfRange, 2)*3;
			}
		}
		
		//Сделаем замены в первой и третьей четвертях
		int col = 0; 
		for (int i = 0; i < halfRange; i++) {
			if (i == 1) col++;
			if (i == halfRange-1) col--;
			square[i][col] 				= square[i][col] + square[i + halfRange][col];
			square[i + halfRange][col] 	= square[i][col] - square[i + halfRange][col];
			square[i][col] 				= square[i][col] - square[i + halfRange][col];
		}
		
		//Последняя замена, меняем центральную часть верхней и нижней половины квадрата
		//Сначала находим ширину заменяемой части (начало и конец, для цикла for)
		int head = halfRange - (halfRange-3)/2;
		int edge = halfRange + (head/2 - 1);
		
		//Пошла жара
		for (int i = 0; i < halfRange; i++) {
			for (int j = head; j < edge; j++) {
				square[i][j] 				= square[i][j] + square[i + halfRange][j];
				square[i + halfRange][j] 	= square[i][j] - square[i + halfRange][j];
				square[i][j] 				= square[i][j] - square[i + halfRange][j];
			}
		}
	}
}
