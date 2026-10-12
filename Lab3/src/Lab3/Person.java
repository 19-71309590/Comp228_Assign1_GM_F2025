package Lab3;
public class Person {

    protected int personId;
    protected String name;
    protected int age;
    protected double salary;

    public Person(int personId, String name, int age, double salary)
            throws InvalidPersonException, InvalidSalaryException {

        if (personId <= 0) {
            throw new InvalidPersonException("Person ID must be positive.");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidPersonException("Name cannot be empty.");
        }
        if (age <= 0) {
            throw new InvalidPersonException("Age must be positive.");
        }
        if (salary < 0) {
            throw new InvalidSalaryException("Salary cannot be negative.");
        }
        this.personId = personId;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Person ID: " + personId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
    }

    public void performDuties() {
        System.out.println(name + " is performing hospital duties.");
    }
}