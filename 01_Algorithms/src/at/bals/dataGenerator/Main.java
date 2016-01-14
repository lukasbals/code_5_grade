package at.bals.dataGenerator;

public class Main {

	public static void main(String[] args) {

		DataGenerator dg = new DataGenerator();

		int size = 5;
		int min = 10;
		int max = 100;

		//
		// Array ausgeben
		//
		int[] data = dg.generateDataArray(size, min, max);
		for (int i = 0; i < data.length; i++) {
			System.out.println("ZAHLEN UNGEORDNET: " + data[i]);
		}

		//
		// VON HINTEN NACH VORNE NEU ORDNEN
		//
		int[] reversedData = new int[size];

		for (int i = 0; i < data.length; i++) {
			int count = data.length - i - 1;
			reversedData[i] = data[count];
		}
		for (int i = 0; i < data.length; i++) {
			System.out.println("ZAHLEN UNGEORDNET UMGEDREHT: "
					+ reversedData[i]);
		}

		//
		// GRÖSSTE ZAHL ERMITTELN
		//
		int maxNumber = min;
		for (int i = 0; i < data.length; i++) {
			if (data[i] > maxNumber) {
				maxNumber = data[i];
			}
		}
		System.out.println("Die größte Zahl ist: " + maxNumber);

		//
		// KLEINSTE ZAHL ERMITTELN
		//
		int minNumber = max;
		for (int i = 0; i < data.length; i++) {
			if (data[i] < minNumber) {
				minNumber = data[i];
			}
		}
		System.out.println("Die kleinste Zahl ist: " + minNumber);

		//
		// Sysout Sorts
		//
		Sort sort = new InsertionSort();
		int[] sortedData = sort.doSort(data);
		
		for (int i = 0; i < data.length; i++) {
			System.out.println("SORTED: " + sortedData[i]);
		}
	}

}
