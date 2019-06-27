import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	static ArrayList<Student> someStudent = new ArrayList<Student>();

	public static void main(String[] args) {

		int op;
		System.out.println("Enter your choice");
		System.out.println("1.Add stuent detail");
		System.out.println("2.remove student detail ");
		System.out.println("3.update student detail");
		System.out.println("4.display");
		System.out.println("5.exit");
		do {

			Scanner sc = new Scanner(System.in);
			op = sc.nextInt();
			switch (op) {
			case 1:
				add();
				break;
			case 2:
				remove();
				break;
			case 3:
				update();
				break;
			case 4:
				display();
				break;
			case 5:
				System.exit(0);
				break;
			}
		} while (op > 0 && op <= 4);
	}

	public static void add() {

		Scanner scan = new Scanner(System.in);

		System.out.print("\n ID: ");
		int id = scan.nextInt();

		System.out.print("\n Name: ");
		String name = scan.next();

		System.out.print("\n CGPA: ");
		float cgpa = scan.nextFloat();

		someStudent.add(new Student(id, name, cgpa));

	}

	public static void remove() {

		System.out.print(" Enter input to delete");
		Scanner scan = new Scanner(System.in);
		int delete = scan.nextInt();
		for (Student student : someStudent) {

			if (student.getId() == delete) {
				someStudent.remove(student);
				// continue;
			}

		}
	}

	public static void update() {

		System.out.print("Select student by ID: ");
		Scanner scan = new Scanner(System.in);
		int pickID = scan.nextInt();

		for (Student s : someStudent) {
			System.out.print(s.id);
			if (s.id == pickID) {

				System.out.print("enter student name: ");
				String newName = scan.next();
				s.setName(newName);
				System.out.print("enter student cgpa: ");
				float newCGPA = scan.nextFloat();
				s.setCgpa(newCGPA);
			}
		}

	}

	public static void display() {
		for (Student st : someStudent) {

			System.out.println(st.getId());
			System.out.println(st.getName());
			System.out.println(st.getCgpa());

		}

	}

}
