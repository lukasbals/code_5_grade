package at.bals.school;

public class Main {

	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();

		s1.newStudent("Lukas", 1.9);
		s2.newStudent("Tobias", 1.6);
		s3.newStudent("Markus", 3.1);
		s4.newStudent("Corina", 2.6);

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

		System.out.println("Durchschnittsnote der " + sch1.getName() + " : "
				+ sch1.getAverageGrade());
		System.out.println("Durchschnittsnote der " + c1.getName() + " : "
				+ c1.getAverageGrade());
		System.out.println("Durchschnittsnote der " + c2.getName() + " : "
				+ c2.getAverageGrade());
		System.out.println("Abschlussarbeit der " + c1.getName() + " : "
				+ c1.getClassWork());
		System.out.println("Abschlussarbeit der " + c2.getName() + " : "
				+ c2.getClassWork());
	}
}
