package at.bals.school;

public class Student {
	private String name;
	private double averageGrade;

	public void newStudent(String name, double averageGrade) {
		this.name = name;
		this.averageGrade = averageGrade;
	}

	public double getAverageGrade() {
		return averageGrade;
	}

	public void setAverageGrade(double averageGrade) {
		this.averageGrade = averageGrade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
