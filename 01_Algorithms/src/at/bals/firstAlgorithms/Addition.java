package at.bals.firstAlgorithms;

public class Addition {
	int num1 = 12990;
	int num2 = 999;

	public static void main(String[] args) {
		Addition a = new Addition();
		a.App();
	}

	public void App() {
		boolean i = true;
		int count = 0;
		int memorize = 0;

		while (i == true) {
			if (this.extractDigit(num1, count) >= 0) {
				int result;
				if (this.extractDigit(num2, count) == -1) {
					result = this.extractDigit(num1, count) + memorize;
				} else {
					result = this.extractDigit(num1, count)
							+ this.extractDigit(num2, count) + memorize;
				}
				if (result >= 10) {
					memorize = this.extractDigit(result, 1);
					result = this.extractDigit(result, 0);
				} else {
					memorize = 0;
				}
				System.out.println("Zahl:" + result);
			} else if (this.extractDigit(num2, count) >= 0) {
				int result = this.extractDigit(num2, count) + memorize;
				if (result >= 10) {
					memorize = this.extractDigit(result, 1);
					result = this.extractDigit(result, 0);
				} else {
					memorize = 0;
				}
				System.out.println("Zahl:" + result);
			} else {
				i = false;
			}
			count++;
		}
		if (memorize != 0) {
			System.out.println("Zahl:" + memorize);
		}
	}

	private int extractDigit(int number, int position) {
		number = (int) (number / (Math.pow(10, position)));
		int stelle = number % 10;

		// System.out.println("Im Algorithmus" + number);
		// System.out.println("stelle" + stelle);

		if ((stelle != 0)) {
			return stelle;
		} else if (number != 0) {
			return stelle;
		} else {
			return -1;
		}
	}

}
