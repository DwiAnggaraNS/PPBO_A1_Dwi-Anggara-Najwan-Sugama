import java.util.Objects;

public class Pasien extends Manusia{
    private String pekerjaan;
    private String domisili;

    public Pasien(String nama, String tanggalLahir, Gender gender, String pekerjaan, String domisili) {
        super(nama, tanggalLahir, gender);
        this.pekerjaan = pekerjaan;
        this.domisili = domisili;
    }

    public void daftar(RumahSakit RS, String keluhan, String namaDokter, Antrian.tipePasien tipePasien) {
        Dokter dokterTujuan = this.getDokterFromName(RS, namaDokter);
        if ( dokterTujuan == null){
            System.out.println("DOKTER TERSEBUT TIDAK TERSEDIA");
        }else{
            if (this.cekPendaftaranPasien(RS, this)){
                Antrian antrian = new Antrian(RS, keluhan, namaDokter, tipePasien);
                antrian.setNamaPasien(this.getNama());
                RS.getListPasien().add(antrian);
                dokterTujuan.getAntrianPasien().add(antrian);
                System.out.println("SUKSES");
            }else{
                System.out.println("PASIEN SUDAH TERDAFTAR");
            }
        }
    }

    private Dokter getDokterFromName(RumahSakit RS, String namaDokter){
        for (Dokter dokter: RS.getListAvaibleDokter()){
            if (Objects.equals(dokter.getNama(), namaDokter)){
                return dokter;
            }
        }
        return null;
    }

    private boolean cekPendaftaranPasien(RumahSakit RS, Pasien pasienPendaftar){
        for (Antrian antrian: RS.getListPasien()){
            if (Objects.equals(antrian.getNamaPasien(), pasienPendaftar.getNama())){
                return false;
            }else{
                continue;
            }
        }
        return true;
    }

    public void periksa(RumahSakit RS){
        String namaPasienPertama = RS.getListPasien().getFirst().getNamaPasien();
        if (Objects.equals(this.getNama(), namaPasienPertama)){
            String namaDokterPemeriksa = RS.getListPasien().getFirst().getNamaDokter();
            Dokter dokterPemeriksa = this.getDokterFromName(RS, namaDokterPemeriksa);
            System.out.println("SUKSES");
            RS.getListPasien().removeFirst();
            dokterPemeriksa.getAntrianPasien().removeFirst();
        }else{
            System.out.println("BELUM SAATNYA PERIKSA");
        }
    }


    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getDomisili() {
        return domisili;
    }

    public void setDomisili(String domisili) {
        this.domisili = domisili;
    }

}
