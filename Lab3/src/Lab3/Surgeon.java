package Lab3;

public class Surgeon extends Doctor {

    protected String surgeryType;
    protected String operatingRoom;

    public Surgeon(int personId, String name, int age, double salary,
                   String specialization, double consultationFee,
                   String surgeryType, String operatingRoom)
            throws InvalidPersonException, InvalidSalaryException {

        super(personId, name, age, salary,
              specialization, consultationFee);

        if (surgeryType == null || surgeryType.trim().isEmpty()) {
            throw new InvalidPersonException(
                    "Surgery type cannot be empty.");
        }
        if (operatingRoom == null || operatingRoom.trim().isEmpty()) {
            throw new InvalidPersonException(
                    "Operating room cannot be empty.");
        }
        this.surgeryType = surgeryType;
        this.operatingRoom = operatingRoom;
    }
    public void performSurgery() {
        System.out.println(
                name + " is performing "
                + surgeryType + " in "
                + operatingRoom + ".");
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Surgery Type: " + surgeryType);
        System.out.println("Operating Room: " + operatingRoom);
    }
    @Override
    public void performDuties() {
        System.out.println(
                name + " is performing surgical duties.");
    }
}