//Lab one Task 2
public class PersonalInfo {
    public static void main(String[] args) {
        // Defining personal information variables
        String name = "Istiak Khan";
        String studentId = "E253051";
        int age = 22;
        String email = "e253051@ugrad.iiuc.ac.bd";
        String phone = "+880xxxxxxxxxx";
        String address = "-----------, --------, Chattogram";

        // Using println to display the information
        System.out.println("Personal Information:");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);

        // Using printf just once after all println statements
        System.out.printf(
                "\nFormatted Information:\nName: %s\nStudent ID: %s\nAge: %d\nEmail: %s\nPhone: %s\nAddress: %s\n",
                name, studentId, age, email, phone, address);
    }
}
