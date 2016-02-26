package at.bals.school;

import java.util.ArrayList;
import java.util.List;

public class Class {
	private String name;
	private List<Student> students = new ArrayList<Student>();

	public void newClass(String name) {
		this.name = name;
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
