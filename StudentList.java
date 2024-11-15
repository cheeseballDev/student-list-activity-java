import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentList {
    private Map<String, String> students;
    private String studentID;
    private String studentName;
    public StudentList() {
        clearScreen();
        students = new HashMap<String, String>();
    }

    void startStudentList() {
        Scanner userInput = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter student number " + i + ": ");
            studentID = userInput.nextLine();
            System.out.print("Enter first name " + i + ": ");
            studentName = userInput.nextLine();
            students.put(studentID,studentName);
        }
        System.out.println("Student List:");
        for (Map.Entry<String, String> e: students.entrySet()) {
            System.out.print(e.getKey() + " " + e.getValue() +"\n");
        }
        students.remove(studentID);
        System.out.print("Enter your student number: ");
        studentID = userInput.nextLine();
        System.out.print("Enter your first name: ");
        studentName = userInput.nextLine();
        students.put(studentID, studentName);
        for (Map.Entry<String, String> e: students.entrySet()) {
            System.out.print(e.getKey() + " " + e.getValue() +"\n");
        }
    }

    private void clearScreen() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
