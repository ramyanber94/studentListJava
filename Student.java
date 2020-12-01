import java.util.Arrays;

public class Student {
	private String studentId, name;
	private double totalAssignmentScore;
	private double totalMaxScore;
	Assignment[] assignments = new Assignment[5];
	
	
	public Assignment[] getAssignments() {
		return assignments;
	}

	Assignment aS = new Assignment();
	int i = 0;

	public double getTotalAssignmentScore() {
		totalAssignmentScore = 0;
		for (int i = 0; i < assignments.length; i++) {
			totalAssignmentScore += assignments[i].getScore();
		}
		return totalAssignmentScore;
	}

	public void setTotalAssignmentScore(double totalAssScore) {
		this.totalAssignmentScore = totalAssScore;
	}

	public double getTotalMaxScore() {
		totalMaxScore = 0;
		for (int i = 0; i < assignments.length; i++) {
			totalMaxScore += assignments[i].getScore();
		}
		return totalMaxScore;

	}

	public void setTotalMaxScore(double maxScore) {
		this.totalMaxScore = maxScore;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addNewAssignment(Assignment assignment) {
		assignments[i] = assignment;
		i++;
	}
	
	public boolean findAssignment(int assignmentID) {
		
		for(int index = 0; index < assignments.length; index ++ ) {
			if(assignments[index]!=null) {
				if(assignmentID == assignments[index].getAssignmentId()) {
					return true;
				}
				
			}
		}return false;
		
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", assignments=" + Arrays.toString(assignments) + "]";
	}

}
