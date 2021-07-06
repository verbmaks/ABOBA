package aboba.module1.cycles;

import java.math.BigInteger;

public class Task4 {

	public static void main(String[] args) {

		BigInteger sum = BigInteger.valueOf(0);
		for (int i = 1; i <= 200; i++) {
			BigInteger plus = BigInteger.valueOf((long)Math.pow(i, 2));
			sum = sum.add(plus);
		}

		System.out.print(sum);

	}

}
