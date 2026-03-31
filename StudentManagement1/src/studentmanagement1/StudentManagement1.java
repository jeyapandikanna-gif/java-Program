
package studentmanagement1;
import java.util.*;

class Student {
    int rollNo;
    String name;
    int age;
    String course;
    double marks;

    Student(int rollNo, String name, int age, String course, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------");
    }
}

public class StudentManagement1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            System.out.println("\n1.Add 2.View 3.Search 4.Update 5.Delete 6.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int r = sc.nextInt();

                    boolean exists = false;
                    for (Student s : list) {
                        if (s.rollNo == r) {
                            exists = true;
                            break;
                        }
                    }
                    if (exists) {
                        System.out.println("Roll number already exists!");
                        break;
                    }

                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String n = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int a = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Course: ");
                    String c = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    double m = sc.nextDouble();

                    list.add(new Student(r, n, a, c, m));
                    System.out.println("Student Added!");
                    break;

                case 2:
                    if (list.isEmpty()) {
                        System.out.println("No records found!");
                    } else {
                        for (Student s : list) {
                            s.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll No to search: ");
                    int sr = sc.nextInt();
                    boolean found = false;
                    for (Student s : list) {
                        if (s.rollNo == sr) {
                            s.display();
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Student not found!");
                    break;

                case 4:
                    System.out.print("Enter Roll No to update: ");
                    int ur = sc.nextInt();
                    boolean updated = false;
                    for (Student s : list) {
                        if (s.rollNo == ur) {
                            System.out.print("Enter new marks: ");
                            s.marks = sc.nextDouble();
                            updated = true;
                            System.out.println("Marks Updated!");
                            break;
                        }
                    }
                    if (!updated) System.out.println("Student not found!");
                    break;

                case 5:
                    System.out.print("Enter Roll No to delete: ");
                    int dr = sc.nextInt();
                    boolean deleted = false;
                    Iterator<Student> it = list.iterator();
                    while (it.hasNext()) {
                        Student s = it.next();
                        if (s.rollNo == dr) {
                            it.remove();
                            deleted = true;
                            System.out.println("Student Deleted!");
                            break;
                        }
                    }
                    if (!deleted) System.out.println("Student not found!");
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }
}