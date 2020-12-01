import java.util.Arrays;

public class StudentList {
	int i = 0;
	Student[] sT = new Student[2];
	
	public double getTotalScore() {
		double totalScore = 0;
		for (int i = 0; i < sT.length; i++) {
			totalScore+= sT[i].getTotalAssignmentScore();
		}return totalScore;
		
		
	}
	public Student[] getsT() {
		return sT;
	}

	public void setsT(Student[] sT) {
		this.sT = sT;
	}
	
	public void addNewStudent(Student newStudent) {
		sT[i] = newStudent;
		i++;
		}
	
	public Student findStudentID(String studentID) {
		Student s = new Student();
		for (int index = 0;index < sT.length; index++) {
			if (sT[index].getStudentId().equals(studentID) ) {
				s = sT[index];
			}
		}return s;
	}
	
	public Student findStudentByAssignmentID(int assignmentID) {
		Student s = new Student();
		for (int index = 0; index < sT.length; index ++) {
			if(sT[index].findAssignment(assignmentID)) {
				s = sT[index];
			}
		}return s;
	}
	
	public String displayAllStudents() {
		return  Arrays.toString(sT);
	}

	
	
	
	
}
	
