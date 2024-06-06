public class HRStaff extends Employee {

    public HRStaff(String name, String birthDate, String department, double salary) {
        super(name, birthDate, department, "HR Staff", salary);
    }

    @Override
    public double getSalary() {
        return 5000000; // Gaji pokok untuk HR Staff
    }
}
