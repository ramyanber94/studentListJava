import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		StudentList sL = new StudentList();
		Assignment[] aSt = new Assignment[5];
		Student[] sTu = new Student[20]; 
		
		int choice = 0;
		do { 
			 System.out.println("*****************Student Menu******************");
			 System.out.println("1-Add new student");
			 System.out.println("2-Find student by ID: ");
			 System.out.println("3-Display all the students: ");
			 System.out.println("4-Add new assignment: ");
			 System.out.println("5-Find student by assignment ID: ");
			 System.out.println("9-To exit");
			 choice = kbd.nextInt();
			 if(choice == 1) {
				 Student sT = new Student();
				 System.out.println("Enter student name: ");
				 String name = kbd.next();
				 System.out.println("Enter Student ID: ");
				 String studentId=kbd.next();
				 sT.setName(name);
				 sT.setStudentId(studentId);
				 sL.addNewStudent(sT);
			 }else if (choice == 2) {
				 String studentID;
				 System.out.println("Student ID is: ");
				 studentID = kbd.next();
				 System.out.println(sL.findStudentID(studentID));
				 
				 
			 }else if (choice == 3) {
				 System.out.println(sL.displayAllStudents());
			 }else if (choice == 4) {
				 System.out.println("Enter student ID: ");
				 String studentID = kbd.next();
				 Student findStudent = sL.findStudentID(studentID);
				 System.out.println("Enter assignment ID: ");
				 int assignmentID = kbd.nextInt();
				 System.out.println("Enter max score: ");
				 double maxScore = kbd.nextDouble();
				 System.out.println("Enter your obtained score: ");
				 double currentScore = kbd.nextDouble();
				 Assignment newAssignment = new Assignment();
				 newAssignment.setAssignmentId(assignmentID);
				 newAssignment.setMaxScore(maxScore);
				 newAssignment.setScore(currentScore);
				 findStudent.addNewAssignment(newAssignment);
				 System.out.println(sL.displayAllStudents());
			 }else if (choice == 5) {
				 System.out.println("Enter assignment ID: ");
				 int assignmentID = kbd.nextInt();
				 System.out.println(sL.findStudentByAssignmentID(assignmentID));
				 
				 
			 }
		}while(choice!=9);

	}

}

