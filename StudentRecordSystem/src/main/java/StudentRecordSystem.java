import java.util.Scanner;

import com.prowings.model.RecordManager;
import com.prowings.model.Student;

public class StudentRecordSystem {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Student s = new Student();
		System.out.println(s);
		
		while (true) {
			System.out.println("\nStudent Record System Menu:");
			System.out.println("1. Add a new student");
			System.out.println("2. Display all students");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");

			int choice = scan.nextInt();
			scan.nextLine(); // Consume the newline character
			
			switch (choice) {
			case 1:
				RecordManager.createStudent();
				
				break;
			case 2:
				RecordManager.displayRecord();
				break;
			case 3:
				System.out.println("Exiting the program. Goodbye!");
				scan.close();
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
				break;
			}
		}

	}

}
