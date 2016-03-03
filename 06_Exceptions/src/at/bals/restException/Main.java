package at.bals.restException;

public class Main {
	public static void main(String[] args) {
		RestLoader rl = new RestLoader();
		
		try {
			rl.loadFile(-1);
		} catch (RestException e) {
			System.out.println(e.getMessage());
		}
	}
}
