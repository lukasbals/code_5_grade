package at.bals.dataGenerator;

public class SelectionSort {
	public int[] selectionSort(int[] data, int max) {
		for (int f = 0; f < data.length; f++) {
			int aMin = max;
			int pos = 0;
			for (int i = f; i < data.length; i++) {
				if (data[i] < aMin) {
					aMin = data[i];
					pos = i;
				}
			}
			data[pos] = data[f];
			data[f] = aMin;
		}
		return data;
	}
}
