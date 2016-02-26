package at.bals.school;

import java.util.ArrayList;
import java.util.List;

public class School {
	private String name;
	private List<Class> classes = new ArrayList<Class>();

	public School(String name) {
		this.name = name;
	}

	public void addClassToSchool(Class c) {
		this.classes.add(c);
	}

	public double getAverageGrade() {
		double averageGrade = 0;
		int count = 0;
		
		for (int i = 0; i < classes.size(); i++) {
			Class x = classes.get(i);
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
