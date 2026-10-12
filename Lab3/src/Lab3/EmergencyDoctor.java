package Lab3;

public class EmergencyDoctor extends Doctor
        implements MedicalProfessional, Billable {

    public EmergencyDoctor(int personId, String name, int age,
                           double salary,
                           String specialization,
                           double consultationFee)
            throws InvalidPersonException, InvalidSalaryException {

        super(personId, name, age, salary,
              specialization, consultationFee);
    }
    public void handleEmergency() {
        System.out.println(
                name + " is handling an emergency case!");
    }
    @Override
    public void prescribeMedication() {
        System.out.println(
                name + " is prescribing emergency medications.");
    }
    @Override
    public void generateBill() {
        System.out.println(
                name + " generated an emergency bill: $"
                + consultationFee);
    }
    @Override
    public void performDuties() {
        System.out.println(
                name + " is responding to emergency medical calls.");
    }
}