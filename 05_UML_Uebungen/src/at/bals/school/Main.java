package at.bals.school;

public class Main {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();

		s1.newStudent("Lukas", 2);
		s2.newStudent("Tobias", 4);
		s3.newStudent("Markus", 1.1);
		s4.newStudent("Corina", 2.3);
		
		UpperClass uc = new UpperClass("UpperWork");
		VocClass vc = new VocClass("VocWork");

		Class c1 = new Class("9bWI", uc);
		Class c2 = new Class("2aFI", vc);

		c1.addStudentToClass(s1);
		c1.addStudentToClass(s2);
		c2.addStudentToClass(s3);
		c2.addStudentToClass(s4);

		School sch1 = new School("HTL-Dornbirn");

		sch1.addClassToSchool(c1);
		sch1.addClassToSchool(c2);

		System.out.println(sch1.getAverageGrade());
		System.out.println(c2.getClassWork());
	}
}
