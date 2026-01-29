import java.util.Scanner;

class Student {
    String name;
    int rollNo;

    void addStudent(String n, int r) {
        name = n;
        rollNo = r;
        System.out.println("Student details saved");
    }

    void updateName(String n) {
        name = n;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        while (true) {
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    String name = sc.nextLine();
                    int roll = sc.nextInt();
                    s.addStudent(name, roll);
                    break;

                case 2:
                    String newName = sc.nextLine();
                    s.updateName(newName);
                    break;

                case 3:
                    s.display();
                    break;

                case 4:
                    System.out.println("Exited");
                    return;
            }
        }
    }
}