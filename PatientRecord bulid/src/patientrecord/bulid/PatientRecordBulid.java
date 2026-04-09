
package patientrecord.bulid;

public class PatientRecordBulid {

   
    class PatientRecord {

    // Fields
    private String patientName;
    private int age;
    private String disease;
    private String doctorName;
    private String roomType;
    private double billAmount;

    // Private constructor (only Builder can access)
    private PatientRecord(Builder builder) {
        this.patientName = builder.patientName;
        this.age = builder.age;
        this.disease = builder.disease;
        this.doctorName = builder.doctorName;
        this.roomType = builder.roomType;
        this.billAmount = builder.billAmount;
    }

    // Display method
    public void displayDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Bill Amount: " + billAmount);
    }

    // Static Inner Builder Class
    public static class Builder {

        private String patientName;
        private int age;
        private String disease;
        private String doctorName;
        private String roomType;
        private double billAmount;

        // Setter methods with method chaining
        public Builder setPatientName(String patientName) {
            this.patientName = patientName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setDisease(String disease) {
            this.disease = disease;
            return this;
        }

        public Builder setDoctorName(String doctorName) {
            this.doctorName = doctorName;
            return this;
        }

        public Builder setRoomType(String roomType) {
            this.roomType = roomType;
            return this;
        }

        public Builder setBillAmount(double billAmount) {
            this.billAmount = billAmount;
            return this;
        }

        // Build method
        public PatientRecord build() {
            return new PatientRecord(this);
        }
    }

    // Main method for testing
    public static void main(String[] args) {

        PatientRecord patient = new PatientRecord.Builder()
                .setPatientName("Ravi Kumar")
                .setAge(35)
                .setDisease("Fever")
                .setDoctorName("Dr. Sharma")
                .setRoomType("General")
                .setBillAmount(5000.0)
                .build();

        patient.displayDetails();
    }
    }