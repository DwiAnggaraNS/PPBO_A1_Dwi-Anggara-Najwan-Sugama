public class Main {
    public static void main(String[] args) {
        Student nino = new Student();
        nino.setName("Nino");
        nino.setNIM(31134);
        nino.setAddress("Jalan jalan");
        nino.setSemester(1);

        InternationalStudent noni = new InternationalStudent();
        noni.setName("Noni");
        noni.setNIM(513155);
        noni.setAddress("Jalan julun");
        noni.setSemester(1);
//        System.out.println(noni.getName());
        noni.setNationality("Malaysian");
        noni.setLanguage("Melayu");

        nino.displayStudentReport();
        noni.displayStudentReport();
    }
}