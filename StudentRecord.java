package evaluation;

public class StudentRecord {

	public static void main(String[] args) {
		try {
			Student s1 = new Student("Raj",1,"Java",new int[] {95,56,89,89,67});
			Student s2 = new Student("John",2,"JS",new int[] {90,44,34,79,66});
			Student s3 = new Student("Due",3,"Python",new int[] {90,46,89,29,69});
			
			Department dept = new Department();
			dept.addStudent(s1);
			dept.addStudent(s2);
			dept.addStudent(s3);
			
			System.out.println("\nTopper"+dept.getTopper());
			
			dept.printSummary();
		
		}
		catch(InvalidMarksException e) {
			System.out.println("Error: "+e.getMessage());
		}

	}

}
