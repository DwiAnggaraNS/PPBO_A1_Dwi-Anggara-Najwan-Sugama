import java.util.ArrayList;

public class Dokter extends Manusia{
    private String idDokter;
    private String nomorSTR;
    private String spesialis;
    private ArrayList<Antrian> antrianPasien = new ArrayList<Antrian>();

    public Dokter(String nama, String tanggalLahir, Gender gender, String nomorSTR, String spesialis) {
        super(nama, tanggalLahir, gender);
        this.nomorSTR = nomorSTR;
        this.spesialis = spesialis;
    }

    public void daftar(RumahSakit RS) {
        RS.tambahDokter(this);
    }

    public ArrayList<Antrian> getAntrianPasien() {
        return antrianPasien;
    }

    public String getIdDokter() {
        return idDokter;
    }

    public void setIdDokter(String idDokter) {
        this.idDokter = idDokter;
    }

    public String getNomorSTR() {
        return nomorSTR;
    }

    public void setNomorSTR(String nomorSTR) {
        this.nomorSTR = nomorSTR;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }

}
