public class Developer extends Employee {

    public Developer(String name, String birthDate, String department, double salary) {
        super(name, birthDate, department, "Developer", salary);
    }

    @Override
    public double getSalary() {
        return 10000000; // Gaji pokok untuk Developer
    }
}
