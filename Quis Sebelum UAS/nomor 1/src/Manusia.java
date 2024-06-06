import java.util.Date;

public abstract class Manusia {

    public enum Gender{
        LAKI_LAKI, PEREMPUAN
    }

    public Manusia(String nama, String tanggalLahir, Gender gender) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.gender = gender;
    }

    private String nama;
    private String tanggalLahir;
    private Gender gender;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

}
