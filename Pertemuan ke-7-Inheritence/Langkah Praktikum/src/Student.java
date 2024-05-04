import javax.naming.ServiceUnavailableException;

public class Student {
    private String name;
    private int NIM;
    private String address;
    private int semester;
    private double IPK;
    private String supervisor;


    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void requestSupervisor(String supervisor) {
        if (this.semester >= 7){
            this.setSupervisor(supervisor);
        }
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNIM() {
        return NIM;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void displayStudentReport(){
        System.out.println("Nilai akhir " +this.name+" adalah "+this.IPK);
    }
}