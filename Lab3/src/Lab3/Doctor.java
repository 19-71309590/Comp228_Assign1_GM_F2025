package Lab3;

public class Doctor extends Person {

    protected String specialization;
    protected double consultationFee;

    public Doctor(int personId, String name, int age, double salary,
                  String specialization, double consultationFee)
            throws InvalidPersonException, InvalidSalaryException {
        super(personId, name, age, salary);

        if (specialization == null || specialization.trim().isEmpty()) {
            throw new InvalidPersonException(
                    "Specialization cannot be empty.");
        }
        if (consultationFee < 0) {
            throw new InvalidPersonException(
                    "Consultation fee cannot be negative.");
        }
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }
    public void diagnosePatient() {
        System.out.println(name + " is diagnosing a patient.");
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
        System.out.println("Consultation Fee: $" + consultationFee);
    }
    @Override
    public void performDuties() {
        System.out.println(
                name + " is examining and treating patients.");
    }
}