package at.bals.sortAlgorithms;

public class BubbleSort implements Sort {
	public int[] doSort(int[] bubbleSortData) {
		int countNum = 0;
		while (countNum < (bubbleSortData.length -1)) {
			countNum = 0;
			//System.out.println(bubbleSortData[bubbleSortData.length - 1]);
			
			for (int i = 0; i < (bubbleSortData.length -1); i++) {
					if (bubbleSortData[i] >= bubbleSortData[i + 1]) {
						int save = bubbleSortData[i];
						bubbleSortData[i] = bubbleSortData[i + 1];
						bubbleSortData[i + 1] = save;
					} else {
						countNum++;
					}
			}
		}
		return bubbleSortData;
	}
}
