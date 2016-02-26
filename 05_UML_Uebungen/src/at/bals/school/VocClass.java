package at.bals.school;

public class VocClass implements IClassType {
	private String finalWork;

	public VocClass(String finalWork) {
		this.finalWork = finalWork;
	}

	public String getFinalWork() {
		return finalWork;
	}

	public void setFinalWork(String finalWork) {
		this.finalWork = finalWork;
	}

}
