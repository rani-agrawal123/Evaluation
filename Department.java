package evaluation;

import java.util.ArrayList;

public class Department implements Printtable{
	ArrayList<Student> students = new ArrayList<>();
	
	public void addStudent(Student student) {
		student.add(student);
	}

	public Student getTopper() {
		Student topper = students.get(0);
		for(Student s : students) {
			if(s.calculateAverage() > topper.calculateAverage()) {
				topper = s;
			}
		}
		return topper;
	}
	
	public void desplayAll() {
		for(Student s : students) {
			System.out.println(s);
			toString();
		}
	}
	
	
	@Override 
	public void printSummary() {
		System.out.println("====== Summary =====");
		for(Student s: students) {
			System.out.println(s.name+"=>Grade:"+s.getGrade());
		}
	}
}
