package at.bals.dataGenerator;

public class Main {

	public static void main(String[] args) {

		DataGenerator dg = new DataGenerator();

		int size = 5;
		int min = 10;
		int max = 100;

		int[] data = dg.generateDataArray(size, min, max);

		// VON HINTEN NACH VORNE NEU ORDNEN
		int[] reversedData = new int[size];

		for (int i = 0; i < data.length; i++) {
			int count = data.length - i - 1;
			reversedData[i] = data[count];
		}

		// GRÖSSTE ZAHL ERMITTELN
		int maxNumber = min;
		for (int i = 0; i < data.length; i++) {
			if (data[i] > maxNumber) {
				maxNumber = data[i];
			}
		}

		// KLEINSTE ZAHL ERMITTELN
		int minNumber = max;
		for (int i = 0; i < data.length; i++) {
			if (data[i] < minNumber) {
				minNumber = data[i];
			}
		}

		// AUSGABEN
		for (int i = 0; i < data.length; i++) {
			System.out.println("DATEN UNGEORDNET: " + data[i]);
		}
		//
		// System.out.println("MITTE");
		//
		// for (int i = 0; i < data.length; i++) {
		// System.out.println(reversedData[i]);
		// }

		System.out.println("Die größte Zahl ist: " + maxNumber);
		System.out.println("Die kleinste Zahl ist: " + minNumber);

		
		// SELECTION SORT
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
		for (int i = 0; i < data.length; i++) {
			System.out.println("SELECTION SORT: " + data[i]);
		}
	}

}
