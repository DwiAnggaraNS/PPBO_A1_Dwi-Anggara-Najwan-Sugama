public class InternationalStudent extends Student{
    private String nationality;
    private String language;

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public void displayStudentReport(){
        System.out.println(super.getName()+"'s final result is "+super.getIPK());
    }
}
