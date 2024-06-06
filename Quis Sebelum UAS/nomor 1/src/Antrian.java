public class Antrian {
    public enum tipePasien{
        MANDIRI, BPJS
    }

    private  String nomorAntrian;
    public static int urutanAntrian = 1;
    private RumahSakit RS;
    private String keluhan;
    private String namaDokter;
    private tipePasien tipePasien;
    private String namaPasien;

    public String getNamaPasien() {
        return namaPasien;
    }

    public void setNamaPasien(String namaPasien) {
        this.namaPasien = namaPasien;
    }

    public Antrian(RumahSakit RS, String keluhan, String namaDokter, Antrian.tipePasien tipePasien) {
        this.RS = RS;
        this.keluhan = keluhan;
        this.namaDokter = namaDokter;
        this.tipePasien = tipePasien;
        String IdDokter = this.getIdDokterFromName(namaDokter);
        this.nomorAntrian = IdDokter+"."+urutanAntrian;
        urutanAntrian++;
    }

    private String getIdDokterFromName(String namaDokter){
        for (Dokter dokter: RS.getListAvaibleDokter()){
            if (dokter.getNama() == namaDokter){
                return dokter.getIdDokter();
            }
        }
        return "null";
    }

    public String getNomorAntrian() {
        return nomorAntrian;
    }

    public RumahSakit getRS() {
        return RS;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public String getNamaDokter() {
        return namaDokter;
    }

    public Antrian.tipePasien getTipePasien() {
        return tipePasien;
    }
}
