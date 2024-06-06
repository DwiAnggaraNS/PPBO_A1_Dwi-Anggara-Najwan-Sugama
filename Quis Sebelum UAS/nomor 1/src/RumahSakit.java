import java.util.ArrayList;
import java.util.Objects;

public class RumahSakit {
    private String nama;
    private String alamat;
    private String noTelp;
    private ArrayList<Dokter> listAvaibleDokter = new ArrayList<Dokter>();
    private ArrayList<Antrian> listPasien = new ArrayList<Antrian>();
    public static int nomorUntukId = 1;

    public RumahSakit(String nama, String alamat, String noTelp) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public ArrayList<Dokter> getListAvaibleDokter() {
        return listAvaibleDokter;
    }

    public ArrayList<Antrian> getListPasien() {
        return listPasien;
    }

    public void tambahDokter(Dokter dokter){
        if (this.cekPendaftaranDokter(dokter)){
            String idDokter = this.generateIdDokter(dokter);
            dokter.setIdDokter(idDokter);
            this.listAvaibleDokter.add(dokter);
            System.out.println("SUKSES");
            nomorUntukId++;
        }else{
            System.out.println("DOKTER SUDAH TERDAFTAR");
        }
    }

    private boolean cekPendaftaranDokter(Dokter dokterPendaftar){
        for (Dokter dokter: listAvaibleDokter){
            if (Objects.equals(dokter.getNomorSTR(), dokterPendaftar.getNomorSTR())){
                return false;
            }else{
                continue;
            }
        }
        return true;
    }

    private String generateIdDokter(Dokter dokter){
        return "DR."+nomorUntukId+"."+dokter.getSpesialis();
    }

    public void cekListDokter(){
        if (listAvaibleDokter.isEmpty()){
            System.out.println("BELUM ADA DOKTER YANG TERSEDIA SAAT INI");
        }else{
            System.out.println("BERIKUT LIST DOKTER YANG TERSEDIA SAAT INI");
            System.out.println("==========================================");
            int i = 1;
            for (Dokter dokter: listAvaibleDokter){
                System.out.println(i+". Nama Dokter : "+dokter.getNama()+", Dokter spesialis : "+dokter.getSpesialis());
                i++;
            }
        }
    }

    public void cekAntrianPasien(){
        if (!listAvaibleDokter.isEmpty()){
            System.out.println("ANTRIAN RUMAH SAKIT SAAT INI");
            System.out.println("============================");
            for (Dokter dokter: listAvaibleDokter){
                System.out.println("DR. "+dokter.getNama());
                if(dokter.getAntrianPasien().isEmpty()){
                    System.out.println("ANTRIAN KOSONG");
                    System.out.println("==============");
                }else{
                    for (Antrian antrianPasien: dokter.getAntrianPasien()){
                        System.out.println(" ID ANTRIAN: "+antrianPasien.getNomorAntrian()+", Atas nama : "+antrianPasien.getNamaPasien());
                    }
                    System.out.println("==============");
                }
            }
        }
    }
}
