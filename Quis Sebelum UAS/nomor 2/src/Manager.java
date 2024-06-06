public class Manager extends Employee {

    public Manager(String name, String birthDate, String department, double salary) {
        super(name, birthDate, department, "Manager", salary);
    }

    @Override
    public double getSalary() {
        return 20000000; // Gaji pokok untuk Manager
    }
}
