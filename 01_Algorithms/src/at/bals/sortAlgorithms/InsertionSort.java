package at.bals.sortAlgorithms;

public class InsertionSort implements Sort{
	public int[] doSort(int[] data) {
		int actualMin;
		int actualMax;
		if (data[0] > data[1]) {
			actualMax = data[0];
			actualMin = data[1];
			data[0] = actualMin;
			data[1] = actualMax;
		} else {
			actualMax = data[1];
			actualMin = data[0];
		}
		for (int i = 2; i < data.length; i++) {
			int f = data[i];
			for (int x = 0; x < i; x++) {
				if (f < data[x]) {

					for (int z = i; z > (x); z = z - 1) {
						data[z] = data[z - 1];
					}
					data[x] = f;
					x = i;
				}
			}

		}
		return data;
	}
}
