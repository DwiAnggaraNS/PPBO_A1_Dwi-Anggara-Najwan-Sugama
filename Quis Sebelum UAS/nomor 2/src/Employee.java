abstract class Employee {
    protected String id;
    protected String name;
    protected String birthDate;
    protected String department;
    protected String position;
    protected double salary;

    public Employee(String name, String birthDate, String department, String position, double salary) {
        this.name = name;
        this.birthDate = birthDate;
        this.department = department;
        this.position = position;
        this.salary = salary;
        this.id = generateID();
    }

    private String generateID() {
        String depCode = department.equals("Product") ? "PROD" : "HR";
        String randomNum = String.valueOf((int) (Math.random() * 100));
        return "000" + depCode + birthDate + randomNum;
    }

    public abstract double getSalary();

    public static String[] getDepartment() {
        return new String[]{"Product", "Human Resources"};
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }


    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Birth Date: " + birthDate + ", Department: " + department + ", Position: " + position + ", Salary: " + salary;
    }
}
