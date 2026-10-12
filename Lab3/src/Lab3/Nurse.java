package Lab3;

public class Nurse extends Person {

    protected String department;
    protected String shift;

    public Nurse(int personId, String name, int age, double salary,
                 String department, String shift)
            throws InvalidPersonException, InvalidSalaryException {
        super(personId, name, age, salary);

        if (department == null || department.trim().isEmpty()) {
            throw new InvalidPersonException(
                    "Department cannot be empty.");
        }
        if (shift == null || shift.trim().isEmpty()) {
            throw new InvalidPersonException(
                    "Shift cannot be empty.");
        }
        this.department = department;
        this.shift = shift;
    }

    public void assistPatient() {
        System.out.println(name + " is assisting a patient.");
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
        System.out.println("Shift: " + shift);
    }
    @Override
    public void performDuties() {
        System.out.println(
                name + " is providing nursing care to patients.");
    }
}