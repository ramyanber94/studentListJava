
public class Assignment {

	private int assignmentId;
	private double score, maxScore;

	public int getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(int assignmentId) {
		this.assignmentId = assignmentId;
	}

	

	public double getMaxScore(double maxScore) {
		return maxScore;
	}

	public boolean setMaxScore(double maxScore) {
		this.maxScore = maxScore;
		boolean sucess = false;
		if (maxScore >= 1 && maxScore <= 10) {
			sucess = true;
		}
		return sucess;
	}

	public double getScore() {
		return score;
	}

	public boolean setScore(double score) {
		this.score = score;
		boolean sucess = false;

		if (score >= 0 && score <= maxScore) {
			sucess = true;

		}
		return sucess;
	}
	@Override
	public String toString() {
		return "Assignment [assignment ID=" + assignmentId + ", score=" + score + ", max score=" + maxScore + "]";
	}
}
