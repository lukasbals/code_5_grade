package at.bals.sortAlgorithms;

import java.util.Random;

public class DataGenerator {
	public static int[] generateDataArray(int size, int min, int max) {

		int[] iArr = new int[size];
		
		Random r = new Random();
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = r.nextInt(max - min) + min;
		}

		return iArr;
	}
}
