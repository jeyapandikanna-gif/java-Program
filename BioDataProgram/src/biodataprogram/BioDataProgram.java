
package biodataprogram;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BioDataProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("biodata.txt");

            // 👤 Personal Details
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Gender: ");
            String gender = sc.nextLine();

            System.out.print("Enter Date of Birth: ");
            String dob = sc.nextLine();

            System.out.print("Enter Blood Group: ");
            String blood = sc.nextLine();

            // 🎓 Education
            System.out.print("Enter Qualification: ");
            String qualification = sc.nextLine();

            System.out.print("Enter College Name: ");
            String college = sc.nextLine();

            System.out.print("Enter CGPA/Percentage: ");
            String cgpa = sc.nextLine();

            // 💼 Professional
            System.out.print("Enter Skills (comma separated): ");
            String skills = sc.nextLine();

            System.out.print("Enter Experience (in years): ");
            String exp = sc.nextLine();

            // 📞 Contact
            System.out.print("Enter Phone Number: ");
            String phone = sc.nextLine();

            System.out.print("Enter Email ID: ");
            String email = sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            // 👨‍👩‍👧 Family
            System.out.print("Enter Father Name: ");
            String father = sc.nextLine();

            System.out.print("Enter Mother Name: ");
            String mother = sc.nextLine();

            // ✍️ Writing to file
            writer.write("=========== BIO DATA ===========\n");

            writer.write("\n👤 Personal Details\n");
            writer.write("Name : " + name + "\n");
            writer.write("Age : " + age + "\n");
            writer.write("Gender : " + gender + "\n");
            writer.write("DOB : " + dob + "\n");
            writer.write("Blood Group : " + blood + "\n");

            writer.write("\n🎓 Education\n");
            writer.write("Qualification : " + qualification + "\n");
            writer.write("College : " + college + "\n");
            writer.write("CGPA : " + cgpa + "\n");

            writer.write("\n💼 Skills\n");
            writer.write(skills + "\n");
            writer.write("Experience : " + exp + " Year(s)\n");

            writer.write("\n📞 Contact\n");
            writer.write("Phone : " + phone + "\n");
            writer.write("Email : " + email + "\n");
            writer.write("Address : " + address + "\n");

            writer.write("\n👨‍👩‍👧 Family\n");
            writer.write("Father Name : " + father + "\n");
            writer.write("Mother Name : " + mother + "\n");

            writer.write("\n================================\n");

            writer.close();
            System.out.println("\n✅ Bio Data saved successfully in biodata.txt");

        } catch (IOException e) {
            System.out.println("❌ Error writing file: " + e.getMessage());
        }

        sc.close();
    }
    }
    
}
