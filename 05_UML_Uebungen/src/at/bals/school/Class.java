package at.bals.school;

import java.util.ArrayList;
import java.util.List;

public class Class {
	private String name;
	private List<Student> students = new ArrayList<Student>();
	private IClassType ClassType;

	public Class(String name, IClassType ClassType) {
		this.name = name;
		this.ClassType = ClassType;
	}

	public String getClassWork() {
		return this.ClassType.getFinalWork();
	}

	public void addStudentToClass(Student student) {
		this.students.add(student);
	}

	public double getAverageGrade() {
		double averageGrade = 0;
		int count = 0;

		for (int i = 0; i < students.size(); i++) {
			Student x = students.get(i);
			averageGrade = averageGrade + x.getAverageGrade();
			count++;
		}

		averageGrade = averageGrade / count;

		return averageGrade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
