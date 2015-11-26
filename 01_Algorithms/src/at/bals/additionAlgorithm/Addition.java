package at.bals.additionAlgorithm;

public class Addition {
	int num1 = 192;
	int num2 = 238;

	public static void main(String[] args) {
		Addition a = new Addition();
		a.App();
	}

	public void App() {
		boolean i = true;
		int count = 0;
		int memorize = 0;
		
		while (i == true) {
			//System.out.println("Memorize:" + memorize);
			if (this.extractDigit(num1, count) >= 1) {
				
				int result = this.extractDigit(num1, count)
						+ this.extractDigit(num2, count) + memorize;
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
	}

	private int extractDigit(int number, int position) {
		number = (int) (number / (Math.pow(10, position)));
		return number % 10;
	}

}
