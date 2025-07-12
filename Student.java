package evaluation;

public class Student {
    String name;
    int rollNumber;
    String course;
    int[] marks = new int[5];
    
    public Student(String name,int rollNumber, String course, int[] marks) 
    throws InvalidMarksException{
    	this.name = name;
    	this.rollNumber = rollNumber;
    	this.course = course;
}

    for(int mark : marks) {
    	if(mark <0 || mark >100) {
    		throw new InvalidMarksException("Marks should be between 0 to 100")
    	}
    }
    this.marks = marks;


public double calculateAverage() {
	int sum = 0;
	for(int mark:marks) {
		sum += mark;
	}
	return sum/5.0;
    
}
    public String getGrade() {
    	double avg = calculateAverage();
    	if(avg >=90) {
    		return "A";
    	}
    	else if(avg >= 80) {
    		return "B";
    	}
    	else if(avg >= 70) {
    		return "C";
    	}
    	else if(avg>=60) {
    		return "D";
    	}
    	else {
    		return "F";
    	}
    }
    
    
    @Override
    public String toString() {
    	return "Name: "+name+"\nRollNumber: "+rollNumber+"\nCourse: "+course+"Average: "+calculateAverage()+",Grade: "+getGrade();
    }
    }
}