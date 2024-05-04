public class MasterStudent extends Student{
    private String Theses;

    public String getTheses() {
        return Theses;
    }

    public void applyTheses(String theses) {
        Theses = theses;
    }

    @Override
    public void requestSupervisor(String supervisor) {
        super.requestSupervisor(supervisor);
    }
}
