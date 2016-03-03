package at.bals.restException;

public class RestLoader {
	public RestLoader() {

	}

	public void loadFile(int i) throws RestException {
		if (i >= 0) {
			System.out.println("Das passt!");
		} else {
			throw new RestException("Die Zahl ist weniger als Null.");
		}
	}
}
