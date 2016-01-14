package at.bals.dataGenerator;

public class SelectionSort implements Sort {
	public int[] doSort(int[] data) {
		for (int f = 0; f < data.length; f++) {			
			int aMin = 100000;
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
