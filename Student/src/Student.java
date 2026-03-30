class Student {
    String name;
    int rollNo;

    // Constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Inner class
    class Marks {
        int m1, m2, m3;

        // Constructor
        Marks(int m1, int m2, int m3) {
            this.m1 = m1;
            this.m2 = m2;
            this.m3 = m3;
        }

        void displayResult() {
            int total = m1 + m2 + m3;
            double average = total / 3.0;

            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNo);
            System.out.println("Total Marks: " + total);
            System.out.println("Average Marks: " + average);
        }
    }

    public static void main(String[] args) {
        Student s = new Student("John", 101);

        // Creating inner class object
        Student.Marks m = s.new Marks(80, 90, 85);

        m.displayResult();
    }
}