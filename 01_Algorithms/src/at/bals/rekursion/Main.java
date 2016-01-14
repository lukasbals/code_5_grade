package at.bals.rekursion;

public class Main {

	public static int sumUp(int max) {
		if (max == 0) {
			return 0;
		}
		return max + sumUp(max - 1);
	}
	
	public static int fakultaet(int max) {
		if (max == 1) {
			return 1;
		}
		return max * fakultaet(max - 1);
	}

	public static void main(String[] args) {
		System.out.println(sumUp(5));
		
		System.out.println(fakultaet(5));
	}

}
