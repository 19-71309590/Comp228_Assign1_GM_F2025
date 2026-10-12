package Lab3;

import java.util.Scanner;

public class MainDriver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person[] hospitalStaff = new Person[4];

        int count = 0;

        System.out.println(
                "==========================================");
        System.out.println(
                "        HOSPITAL MANAGEMENT SYSTEM        ");
        System.out.println(
                "==========================================");

        while (count < hospitalStaff.length) {
            try {
                System.out.println(
                        "\nStaff Member " + (count + 1));
                System.out.println("1. Doctor");
                System.out.println("2. Nurse");
                System.out.println("3. Surgeon");
                System.out.println("4. Emergency Doctor");
                System.out.print("Enter type: ");
                
                int type = scanner.nextInt();
                System.out.print("Enter Person ID: ");
                
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Age: ");
                
                int age = scanner.nextInt();
                System.out.print("Enter Salary: ");
                double salary = scanner.nextDouble();
                scanner.nextLine();

                switch (type) {
                    case 1:
                        System.out.print(
                                "Enter Specialization: ");
                        String doctorSpecialization =
                                scanner.nextLine();
                        System.out.print(
                                "Enter Consultation Fee: ");
                        double doctorFee =
                                scanner.nextDouble();
                        scanner.nextLine();
                        hospitalStaff[count] =
                                new Doctor(
                                        id,
                                        name,
                                        age,
                                        salary,
                                        doctorSpecialization,
                                        doctorFee);
                        break;
                    case 2:
                        System.out.print(
                                "Enter Department: ");
                        String department =
                                scanner.nextLine();
                        System.out.print(
                                "Enter Shift: ");
                        String shift =
                                scanner.nextLine();
                        hospitalStaff[count] =
                                new Nurse(
                                        id,
                                        name,
                                        age,
                                        salary,
                                        department,
                                        shift);
                        break;
                    case 3:
                        System.out.print(
                                "Enter Specialization: ");
                        String surgeonSpecialization =
                                scanner.nextLine();
                        System.out.print(
                                "Enter Consultation Fee: ");
                        double surgeonFee =
                                scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print(
                                "Enter Surgery Type: ");
                        String surgeryType =
                                scanner.nextLine();
                        System.out.print(
                                "Enter Operating Room: ");
                        String operatingRoom =
                                scanner.nextLine();
                        hospitalStaff[count] =
                                new Surgeon(
                                        id,
                                        name,
                                        age,
                                        salary,
                                        surgeonSpecialization,
                                        surgeonFee,
                                        surgeryType,
                                        operatingRoom);
                        break;
                    case 4:
                        System.out.print(
                                "Enter Specialization: ");
                        String emergencySpecialization =
                                scanner.nextLine();
                        System.out.print(
                                "Enter Consultation Fee: ");
                        double emergencyFee =
                                scanner.nextDouble();
                        scanner.nextLine();
                        hospitalStaff[count] =
                                new EmergencyDoctor(
                                        id,
                                        name,
                                        age,
                                        salary,
                                        emergencySpecialization,
                                        emergencyFee);
                        break;
                    default:
                        System.out.println(
                                "Invalid type.");
                        continue;
                }
                count++;
            }
            catch (InvalidPersonException e) {
                System.out.println(
                        "Person Error: " + e.getMessage());
            }
            catch (InvalidSalaryException e) {
                System.out.println(
                        "Salary Error: " + e.getMessage());
            }
            catch (Exception e) {
                System.out.println(
                        "Invalid input. Please try again.");
                scanner.nextLine();
            }
        }
        System.out.println();
        System.out.println(
                "==========================================");
        System.out.println(
                "       HOSPITAL STAFF INFORMATION         ");
        System.out.println(
                "==========================================");

        for (Person staff : hospitalStaff) {
            System.out.println();
            System.out.println(
                    "------------------------------------------");
            staff.displayDetails();
            staff.performDuties();

            if (staff instanceof EmergencyDoctor) {
                EmergencyDoctor emergencyDoctor =
                        (EmergencyDoctor) staff;
                emergencyDoctor.handleEmergency();
                emergencyDoctor.prescribeMedication();
                emergencyDoctor.generateBill();
            }
            else if (staff instanceof Surgeon) {
                Surgeon surgeon =
                        (Surgeon) staff;
                surgeon.performSurgery();
            }
            else if (staff instanceof Doctor) {
                Doctor doctor =
                        (Doctor) staff;
                doctor.diagnosePatient();
            }
            else if (staff instanceof Nurse) {
                Nurse nurse =
                        (Nurse) staff;
                nurse.assistPatient();
            }
        }
        scanner.close();
    }
}