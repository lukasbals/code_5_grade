package at.bals.school;

public class Main {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();

		s1.newStudent("Lukas", 2);
		s2.newStudent("Tobias", 4);
		s3.newStudent("Markus", 1);
		s4.newStudent("Corina", 2);

		Class c1 = new Class();
		Class c2 = new Class();

		c1.newClass("9bWI");
		c2.newClass("2aFI");

		c1.addStudentToClass(s1);
		c1.addStudentToClass(s2);
		c2.addStudentToClass(s3);
		c2.addStudentToClass(s4);

		School sch1 = new School();

		sch1.newSchool("HTL-Dornbirn");

		sch1.addClassToSchool(c1);
		sch1.addClassToSchool(c2);

		System.out.println(sch1.getAverageGrade());
	}
}
